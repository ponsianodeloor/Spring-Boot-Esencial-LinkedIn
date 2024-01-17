package dev.ponsianodeloor.spring.app.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dev.ponsianodeloor.spring.app.service.PersonaService;

@Component
public class PersonaRunner implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(PersonaRunner.class);
	
	@Autowired
	private PersonaService personaService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Directorio de personas");
		personaService.getAllPersonas().forEach(persona -> {
			LOG.info(persona.toString());	
		});
		LOG.info("Fin del directorio");
	}

}
