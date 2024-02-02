package com.educandoweb.ecommerce.repositories;

import com.educandoweb.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {



}
