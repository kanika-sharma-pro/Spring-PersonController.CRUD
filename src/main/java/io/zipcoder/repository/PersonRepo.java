package io.zipcoder.repository;

import io.zipcoder.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer>{

}
