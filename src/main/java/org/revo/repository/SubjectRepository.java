package org.revo.repository;

import org.revo.domain.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by revo on 04/12/15.
 */
public interface SubjectRepository extends MongoRepository<Subject, String> {
}
