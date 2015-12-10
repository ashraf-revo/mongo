package org.revo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef

/**
 * Created by ashraf on 12/3/2015.
 */
class Person {
    @Id
    String id
    String name
    String email
    String password
    @DBRef
    Set<PT> pt = new HashSet<>()
}
