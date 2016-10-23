package fr.uha.miage.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.uha.miage.project.Model.Film;
import fr.uha.miage.project.Repository.FilmRepository;


@Controller
public class FilmController {

	@Autowired
	FilmRepository filmRepository;
	
	/* index.html */
	
	@GetMapping("/single")
	public String showIndexGET(Model model) {
		//Iterable<Film> list = filmRepository.findAll();
		//model.addAttribute("films", list);
		return "single"; 
	}

}
