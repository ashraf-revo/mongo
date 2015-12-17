package org.revo.Service

import org.revo.domain.Person
import org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent

/**
 * Created by revo on 17/12/15.
 */
interface SomeService {
    void init()
    void SaveAndDelete()
}