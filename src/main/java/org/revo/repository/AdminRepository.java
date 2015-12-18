package org.revo.repository;

import org.revo.domain.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by ashraf on 12/4/2015.
 */
public interface AdminRepository extends MongoRepository<Admin, String> {
    Optional<Admin> findByEmail(String email);
}
