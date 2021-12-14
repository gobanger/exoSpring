package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Person;
import fr.solutec.repository.PersonRepository;

@RestController @CrossOrigin("*")
public class PersonRest {
	
	@Autowired
	private PersonRepository personRepo; 

	@GetMapping(value = "user")
	public Iterable<Person> getAllPerson(){
		return personRepo.findAll();
	}
	
	@PostMapping("user")
	public Person createPerson(@RequestBody Person p) {
		return personRepo.save(p); 
	}
	
	@GetMapping("user/{id}")
	public Optional<Person> getOnePerson(@PathVariable Long id){
		return personRepo.findById(id);
	}
}
