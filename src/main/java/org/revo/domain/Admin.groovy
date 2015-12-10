package org.revo.domain

import org.springframework.data.annotation.Id

/**
 * Created by ashraf on 12/4/2015.
 */
class Admin {
    @Id
    String id
    String role
    String name
    String email
    String password
}
