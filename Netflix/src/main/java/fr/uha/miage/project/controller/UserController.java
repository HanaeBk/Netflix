package fr.uha.miage.project.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.uha.miage.project.model.User;
import fr.uha.miage.project.repository.UserRepository;;


@Controller
public class UserController {
		  
	
	@Autowired
	private UserRepository UserRepository;
		  	
		  	
	@GetMapping("/")
		  	public String listUser(Model model) {
		  
		  		Iterable<User> list =  UserRepository.findAll();
		  		model.addAttribute("user", list);
		  		return "ListUsers"; 
		  	}
		  	
		  	@GetMapping("/create")
		  	public String createUserForm(Model model) {
		  		model.addAttribute("user", new User());
		  		return "CreateUser";
		  	}
		  	
		  	@PostMapping("/create")
		  	public String createUser(@Valid User User, BindingResult bindingResult) {
		  
		  		if(bindingResult.hasErrors())
		  			return "CreateUser";
		  		
		  		User sauvegardeUser = UserRepository.save(User);
		  		
		  		System.out.println("nouveau utilisateur enregistre avec identifiant : " +sauvegardeUser.getId());
		  		return "redirect:/";
		  	}
		  
		  	@GetMapping("/User/{id}")
		  	public User userByName(@PathVariable(value="id") int id){
		  		return UserRepository.findById(id);
		  	}
		  	
		  	@GetMapping("/delete/{id}")
		  	public String deleteUser(@PathVariable("id") Long id){
		  		UserRepository.delete(id);
		  		return "redirect:/";
		  	}
		  	
		  	@GetMapping("/edit/{id}")
		  	public String editUserForm(@PathVariable("id") Long id, Model model){
		  		
		  		User User = UserRepository.findOne(id);
		  		model.addAttribute("user", User);
		  		
		  		return "ModifyUser";
		  	}
		  	
		  	@PostMapping("/edit")
		  	public String editCours(@Valid User User){
		  		UserRepository.save(User);		
		  		return "redirect:/";
		  	}
		  	
		  	@PostMapping("/Login")
		  	@RequestMapping(value = "/login", method = RequestMethod.POST)
		      public ResponseEntity authentification(@RequestParam("mail") String mail, @RequestParam("password") String password) {
		          
		           User r = UserRepository.findByMailAndPassword(mail, password);
		          if(r != null) return new ResponseEntity<>(r, HttpStatus.OK);
		          else return  new ResponseEntity<>(r, HttpStatus.UNAUTHORIZED);
		  		
		  
		      }
		  	
		  		  }

