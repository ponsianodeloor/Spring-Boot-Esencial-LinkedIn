package dev.ponsianodeloor.spring.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.ponsianodeloor.spring.app.model.Persona;

@Controller
@RequestMapping("/personas")
public class PersonaController {
	
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
	
	@GetMapping
	public String getAllPersonas(Model model) {
		model.addAttribute("personas", personas);
		
		return "personas";
	}
}
