package org.revo.Repository

import org.revo.domain.Person
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by revo on 17/12/15.
 */
interface PersonRepository extends MongoRepository<Person, String> {

}