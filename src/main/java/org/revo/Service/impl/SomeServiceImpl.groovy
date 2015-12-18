package org.revo.Service.impl


import org.revo.Service.SomeService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * Created by revo on 17/12/15.
 */
@Service
@Transactional
class SomeServiceImpl implements SomeService {
    @Autowired
    PersonRepository personRepository
    @Autowired
    PhoneNumberRepository phoneNumberRepository

    @Override
    void init() {
        personRepository.deleteAll()
        phoneNumberRepository.deleteAll()
        Person person = new Person(name: "ashraf")
        person = personRepository.save(person)
        PhoneNumber phoneNumber1 = new PhoneNumber(phone: "01120266849", person: person)
        PhoneNumber phoneNumber2 = new PhoneNumber(phone: "01120266844", person: person)
        person.phoneNumberSet = [phoneNumber1, phoneNumber2]
        phoneNumberRepository.save(phoneNumber1)
        phoneNumberRepository.save(phoneNumber2)
        personRepository.save(person)
        personRepository.delete(person)

    }
}
