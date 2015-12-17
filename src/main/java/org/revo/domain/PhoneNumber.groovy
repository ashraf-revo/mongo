package org.revo.domain

import groovy.transform.Canonical
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by revo on 17/12/15.
 */
@Document
class PhoneNumber {
    @Id
    String id
    String phone
    @DBRef
    Person person
}
