package dev.ponsianodeloor.spring.app.model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="reunion")
public class Reunion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String asunto;
	private ZonedDateTime fecha;
	
	
	//relacion de muchos a muchos con personas en la tabla asistente
	@ManyToMany
	@JoinTable(
			name="asistente",
			joinColumns = {@JoinColumn(name="reunion_id")},
			inverseJoinColumns = {@JoinColumn(name="persona_id")}
	)
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

	@Override
	public String toString() {
		return "Reunion [id=" + id + ", asunto=" + asunto + ", fecha=" + fecha + "]";
	}
	
}
