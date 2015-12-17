package org.revo.Service

import org.revo.Repository.PersonRepository
import org.revo.Repository.PhoneNumberRepository
import org.revo.domain.Person
import org.revo.domain.PhoneNumber
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener
import org.springframework.data.mongodb.core.mapping.event.BeforeDeleteEvent
import org.springframework.stereotype.Component

/**
 * Created by revo on 17/12/15.
 */
@Component
class Util extends AbstractMongoEventListener<Person> {
    @Autowired
    PhoneNumberRepository phoneNumberRepository
    @Autowired
    PersonRepository personRepository

    @Override
    void onBeforeDelete(BeforeDeleteEvent<Person> event) {
        String id = event.source.get("id")
        Set<PhoneNumber> numbers = personRepository.findOne(id).phoneNumberSet
        numbers.each {
            phoneNumberRepository.delete(it)
        }
    }
}
