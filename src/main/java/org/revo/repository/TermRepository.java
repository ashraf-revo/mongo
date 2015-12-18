package org.revo.repository;

import org.revo.domain.Term;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Set;

/**
 * Created by revo on 04/12/15.
 */
public interface TermRepository extends MongoRepository<Term, String> {
    Set<Term> findByEnabledOrPt_Person_Id(boolean enabled, String id);

}
