package org.revo.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.validator.constraints.NotEmpty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by ashraf on 12/4/2015.
 */
@Document
class Admin {
    @Id
    String id
    @NotEmpty
    String role
    @NotEmpty
    String name
    @NotEmpty
    String email
    @NotEmpty
    @JsonIgnore
    String password
}
