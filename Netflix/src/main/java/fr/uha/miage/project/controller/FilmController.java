package fr.uha.miage.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.uha.miage.project.model.Film;
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
