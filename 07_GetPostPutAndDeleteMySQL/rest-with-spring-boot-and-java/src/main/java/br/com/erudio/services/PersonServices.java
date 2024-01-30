package br.com.erudio.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();

	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public Person findById(String id) {

		logger.info("Find one Person!");

		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Igor");
		person.setLastName("Frutuoso");
		person.setAddress("São Paulo - SP - Vila Pauliceia");
		person.setGender("Male");
		return person;
	}
}
