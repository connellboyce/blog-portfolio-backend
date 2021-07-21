package com.connellboyce.blogportfoliobackend.repository;

import com.connellboyce.blogportfoliobackend.model.ERole;
import com.connellboyce.blogportfoliobackend.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
