package dev.ponsianodeloor.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.ponsianodeloor.spring.app.model.Reunion;

public interface ReunionRepository extends JpaRepository<Reunion, Long> {

}
