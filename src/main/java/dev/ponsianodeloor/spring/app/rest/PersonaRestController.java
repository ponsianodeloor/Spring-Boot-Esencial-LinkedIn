package dev.ponsianodeloor.spring.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ponsianodeloor.spring.app.model.Persona;
import dev.ponsianodeloor.spring.app.service.PersonaService;

@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public List<Persona> getAllPersonas(){
		return personaService.getAllPersonas();
	}
}
