package org.revo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef

/**
 * Created by ashraf on 12/3/2015.
 */
class Subject {
    @Id
    String id
    String name
    @DBRef
    Set<Subject> required = new HashSet<>()
    int hour = 3
    int maxGrade = 100
}
