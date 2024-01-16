package dev.ponsianodeloor.spring.app.service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import dev.ponsianodeloor.spring.app.model.Persona;
import dev.ponsianodeloor.spring.app.model.Reunion;

@Service
public class ReunionService {

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
	
	public List<Reunion> getAllReuniones(){
		return reuniones;
	}
}
