package dev.ponsianodeloor.spring.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.ponsianodeloor.spring.app.model.Persona;

@Service
public class PersonaService {

	private static final List<Persona> personas = new ArrayList<>();
	
	//se agregan 5 personas en la lista personas
	static {
		for (int i=0; i < 5; i++) {
			personas.add(
					new Persona(
							i, 
							"Persona Nombres " + i, 
							"Persona Apellidos " + i));
		}
	}
	
	public List<Persona> getAllPersonas(){
		return personas;
	}
}
