package org.revo.Repository;

import org.revo.domain.Person;
import org.revo.domain.PhoneNumber;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by revo on 17/12/15.
 */
public interface PhoneNumberRepository extends MongoRepository<PhoneNumber, String> {
}
