package org.revo.repository;

import org.revo.domain.PS;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * Created by revo on 04/12/15.
 */
public interface PSRepository extends MongoRepository<PS, String> {
    Set<PS> findByPt_Person_IdAndPt_Term_Id(Long person, Long term);
    Set<PS> findByPt_Person_Id(String id);
}
