package org.revo.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef

/**
 * Created by ashraf on 12/3/2015.
 */
class Term {
    @Id
    String id
    String name
    @DBRef
    Set<PT> pt = new HashSet<>()
    boolean enabled = true
    int maxHour
    int defaultHour
    int minHour
    @CreatedDate
    Date CreatedDate
}
