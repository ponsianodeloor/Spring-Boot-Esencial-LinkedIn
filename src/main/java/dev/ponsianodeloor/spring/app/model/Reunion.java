package dev.ponsianodeloor.spring.app.model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reunion {

	private long id;
	private String asunto;
	private ZonedDateTime fecha;
	
	//relacion de uno a muchos con personas
	private List<Persona> personas = new ArrayList<>();

	public Reunion() {
		// TODO Auto-generated constructor stub
	}

	public Reunion(long id, String asunto, ZonedDateTime fecha) {
		super();
		this.id = id;
		this.asunto = asunto;
		this.fecha = fecha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public ZonedDateTime getFecha() {
		return fecha;
	}

	public void setFecha(ZonedDateTime fecha) {
		this.fecha = fecha;
	}
	
	public List<Persona> getPersonas() {
		return personas;
	}

	//se puede reemplazar el setter setPersonas por addPersona
	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	public void addPersona(Persona persona) {
		personas.add(persona);
	}
	
}
