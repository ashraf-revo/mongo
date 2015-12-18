package org.revo.domain

import org.hibernate.validator.constraints.NotEmpty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by ashraf on 12/3/2015.
 */
@Document
class Term {
    @Id
    String id
    @NotEmpty
    String name
    @DBRef
    Set<PT> pt = new HashSet<>()
    boolean enabled = true
    int maxHour
    int defaultHour
    int minHour
    Date CreatedDate = new Date();
}
