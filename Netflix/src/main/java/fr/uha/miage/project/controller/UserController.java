package fr.uha.miage.project.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.uha.miage.project.model.User;
import fr.uha.miage.project.repository.UserRepository;;

@Controller
public class UserController {

	private final String SESSION_ATTRIBUTE_USER = "user";

	@Autowired
	private UserRepository UserRepository;

	@GetMapping(value = { "/index", "/" })
	public String home(HttpSession session, Model model) {

		User user = (User) session.getAttribute(SESSION_ATTRIBUTE_USER);

		if (user == null) {
			System.out.println("no user logged-in");
			user = new User();
			user.setPseudo("Log-in");
			session.setAttribute(SESSION_ATTRIBUTE_USER, user);
		}

		return "index";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		System.out.println("user logged-out");
		return authentify(model);
	}

	@GetMapping("/list")
	public String list(Model model) {

		Iterable<User> list = UserRepository.findAll();
		model.addAttribute("users", list);
		return "ListUsers";
	}

	@GetMapping("/create")
	public String createUserForm(Model model) {
		model.addAttribute("user", new User());
		return "CreateUser";
	}

	@PostMapping("/create")
	public String createUser(HttpSession session, @Valid User User, BindingResult bindingResult) {

		if (bindingResult.hasErrors())
			return "CreateUser";

		User sauvegardeUser = UserRepository.save(User);
		session.setAttribute(SESSION_ATTRIBUTE_USER, User);
		System.out.println("new user saved with id : " + sauvegardeUser.getId());
		return "redirect:/";
	}

	@GetMapping("/User/{id}")
	public User userByName(@PathVariable(value = "id") int id) {
		return UserRepository.findById(id);
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") Long id, Model model) {
		UserRepository.delete(id);
		return list(model);
	}

	@GetMapping("/edit/{id}")
	public String editUserForm(@PathVariable("id") Long id, Model model) {

		User User = UserRepository.findOne(id);
		model.addAttribute("user", User);
		return "ModifyUser";
	}

	@PostMapping("/edit")
	public String editUser(@Valid User User) {
		UserRepository.save(User);
		return "ListUsers";
	}

	@GetMapping("/auth")
	public String authentify(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@PostMapping("/auth")
	public String authentification(HttpSession session, User Cred, Model model) {

		User r = UserRepository.findByPseudoAndPassword(Cred.getPseudo(), Cred.getPassword());
		if (r != null) // return new ResponseEntity<>(r, HttpStatus.OK);
		{
			System.out.println("user found");
			model.addAttribute("user", r);
			session.setAttribute(SESSION_ATTRIBUTE_USER, r);// .getPseudo());
			if (r.isAdmin()) {
				System.out.println(r.getPseudo() + " is ADMINISTRATOR");
				return "adminpage";
			} else {
				System.out.println(r.getPseudo() + " is simple user");
				return "index";
			}
		} else
			System.out.println("user not found: incorrect pseudo and or psw");
		return "login";

	}
	/*
	 * session.removeAttribute("msgerreur"); User r =
	 * UserRepository.findByPseudo(Cred.getPseudo()); 
	 * if(r == null) { session.setAttribute("msgerreur",
	 * "Inexisting username!"); return "login"; } else
	 * if(Cred.getPassword()!=r.getPassword())//
	 * BCrypt.checkpw(Cred.getPassword(),r.getPassword()) {
	 * session.setAttribute("msgerreur", "Wrong password!"); return "login"; }
	 * else { model.addAttribute("user", r); session.setAttribute("user", r);
	 * return "HelloUser"; }
	 */
}
