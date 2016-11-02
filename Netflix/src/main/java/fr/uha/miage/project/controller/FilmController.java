package fr.uha.miage.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import fr.uha.miage.project.repository.FilmRepository;


@Controller
public class FilmController {

	@Autowired
	FilmRepository filmRepository;
	
	/* index.html */
	
	@GetMapping("/CreateFilm")
	public String showIndexGET() {
		return "createFilm"; 
	}

}
