package org.revo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by ashraf on 12/3/2015.
 */
@Document
class PT {
    @Id
    String id
    @DBRef
    Term term
    @DBRef
    Person person
    @DBRef
    Set<PS> ps = new HashSet<>()
}
