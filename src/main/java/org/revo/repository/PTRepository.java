package org.revo.repository;

import org.revo.domain.PT;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

/**
 * Created by revo on 04/12/15.
 */
public interface PTRepository extends MongoRepository<PT,String> {
    Optional<PT> findByPerson_IdAndTerm_Id(String person, String term);

    Set<PT> findByPerson_Id(String id);
}
