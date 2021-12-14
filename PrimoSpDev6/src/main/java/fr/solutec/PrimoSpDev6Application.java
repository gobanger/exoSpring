package fr.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Person;
import fr.solutec.repository.PersonRepository;

@SpringBootApplication
public class PrimoSpDev6Application implements CommandLineRunner {
	
	@Autowired
	private PersonRepository personRepo;

	public static void main(String[] args) {
		SpringApplication.run(PrimoSpDev6Application.class, args);
		System.out.println("Lancement ok");
		
	}

	@Override
	public void run(String... args) throws Exception {
		Person p1 = new Person(null, "Cage", "Nicolas", 57);
		Person p2 = new Person(null, "IX", "Louis", 57);
		Person p3 = new Person(null, "Panther", "Black", 57);
		personRepo.save(p1);
		personRepo.save(p2);
		personRepo.save(p3);
	}
}
