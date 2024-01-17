package dev.ponsianodeloor.spring.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.ponsianodeloor.spring.app.model.Reunion;
import dev.ponsianodeloor.spring.app.repository.ReunionRepository;

@Service
public class ReunionService {
	
	@Autowired
	private ReunionRepository reunionRepository;
	
	public List<Reunion> getAllReuniones(){
		return reunionRepository.findAll();
	}
}
