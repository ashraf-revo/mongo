package org.revo.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.validator.constraints.NotEmpty
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
    @NotEmpty
    String name
    @NotEmpty
    String email
    @NotEmpty
    @JsonIgnore
    String password
    @DBRef
    Set<PT> pt=new HashSet<>()
}
