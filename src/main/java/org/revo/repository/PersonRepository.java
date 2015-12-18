package org.revo.repository;

import org.revo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

/**
 * Created by revo on 04/12/15.
 */
public interface PersonRepository extends MongoRepository<Person, String> {
    Optional<Person> findByEmail(String email);

    Set<Person> findByPt_Term_Id(String id);

}
