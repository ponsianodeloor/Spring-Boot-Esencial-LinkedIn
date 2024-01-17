package dev.ponsianodeloor.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ponsianodeloor.spring.app.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
