package dev.ponsianodeloor.spring.app.model;

public class Persona {
	
	private long id;
	private String nombres;
	private String apellidos;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(long id, String nombres, String apellidos) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}	

}
