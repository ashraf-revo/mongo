package org.revo.domain

import groovy.transform.Canonical
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by ashraf on 12/3/2015.
 */
@Document
class Person {
    @Id
    String id
    String name
    @DBRef
    Set<PhoneNumber> phoneNumberSet=new HashSet<>()
}
