package org.revo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef


/**
 * Created by ashraf on 12/3/2015.
 */
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
