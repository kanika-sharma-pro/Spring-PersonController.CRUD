package io.zipcoder.Controller;

import io.zipcoder.model.Person;
import io.zipcoder.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonController {
   private final PersonRepo personRepo;

   @Autowired
   public PersonController(PersonRepo personRepo){
       this.personRepo = personRepo;
   }

   @RequestMapping("/people")
    ResponseEntity<Person> createPerson(@RequestBody Person p) {
       return new ResponseEntity<>(personRepo.save(p), HttpStatus.OK);
   }



}
