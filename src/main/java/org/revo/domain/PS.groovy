package org.revo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by ashraf on 11/22/2015.
 */
@Document
class PS {
    @Id
    String id
    int grade
    @DBRef
    Subject subject
    @DBRef
    PT pt
    State state = State.non
}
