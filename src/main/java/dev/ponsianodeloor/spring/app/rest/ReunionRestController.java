package dev.ponsianodeloor.spring.app.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.ponsianodeloor.spring.app.model.Reunion;
import dev.ponsianodeloor.spring.app.service.ReunionService;

@RestController
@RequestMapping("/api/reuniones")
public class ReunionRestController {

	private ReunionService reunionService;

	public ReunionRestController(ReunionService reunionService) {
		this.reunionService = reunionService;
	}
	
	@GetMapping
	public List<Reunion> getAllReuniones(){
		return reunionService.getAllReuniones();
	}
	
}
