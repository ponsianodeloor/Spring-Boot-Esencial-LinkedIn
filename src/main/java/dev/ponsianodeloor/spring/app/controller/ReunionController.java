package dev.ponsianodeloor.spring.app.controller;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.ponsianodeloor.spring.app.model.Persona;
import dev.ponsianodeloor.spring.app.model.Reunion;

@Controller
@RequestMapping("/reuniones")
public class ReunionController {

	private static final List<Reunion> reuniones = new ArrayList<>();
	
	//se agregan 5 reuniones en la lista reuniones
	static {
		for (int i=0; i < 5; i++) {
			Reunion reunion = new Reunion(
					i, 
					"Reunión " + i, 
					ZonedDateTime.now().plusDays(i));
			
			for (int j=0;j < i; j++) {
				reunion.addPersona(new Persona(i+j, "Nombre " + i + j, "Apellido " + i + j));
			}
			
			reuniones.add(reunion);
		}
	}
	
	@GetMapping
	public String getAllReuniones(Model model) {
		model.addAttribute("reuniones", reuniones);
		
		return "reuniones"; 
	}
	
}
