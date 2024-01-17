package dev.ponsianodeloor.spring.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.ponsianodeloor.spring.app.model.Persona;
import dev.ponsianodeloor.spring.app.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	public List<Persona> getAllPersonas(){
		return personaRepository.findAll();
	}
}
