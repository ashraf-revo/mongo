package org.revo.Service

import org.revo.domain.Person
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener
import org.springframework.data.mongodb.core.mapping.event.BeforeDeleteEvent
import org.springframework.stereotype.Component

/**
 * Created by revo on 17/12/15.
 */
@Component
class Util extends AbstractMongoEventListener<Person> {

    @Override
    void onBeforeDelete(BeforeDeleteEvent<Person> event) {
        String id = event.source.get("id") as String
    }
}
