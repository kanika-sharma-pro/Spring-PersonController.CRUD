package io.zipcoder.Controller;

import io.zipcoder.model.Person;
import io.zipcoder.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class PersonController {
   private final PersonRepo personRepo;

   @Autowired
   public PersonController(PersonRepo personRepo){
       this.personRepo = personRepo;
   }

   @PostMapping(value = "/people")
    ResponseEntity<Person> createPerson(@RequestBody Person p) {
       return new ResponseEntity<>(personRepo.save(p), HttpStatus.CREATED);
   }
@GetMapping(value = "/people/{ID}")
    ResponseEntity<Person> getPerson (@PathVariable("id") int id) {
       return new ResponseEntity<>(personRepo.findOne(id), HttpStatus.OK);
}

@GetMapping(value ="/people")
    ResponseEntity<Iterable<Person>> getPersonList(){
       return new ResponseEntity<>(personRepo.findAll(), HttpStatus.OK);
}

@PutMapping(value = "/people/{id}")
ResponseEntity<Person> updatePerson (@PathVariable("id") @RequestBody Person p){
       return new ResponseEntity<>(personRepo.save(p), HttpStatus.ACCEPTED);
}

@DeleteMapping(value = "/people/{ID}")
    void deletePerson(@PathVariable("id") int id){
       personRepo.delete(id);
}

}
