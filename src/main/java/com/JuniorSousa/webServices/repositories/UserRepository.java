package com.JuniorSousa.webServices.repositories;

import com.JuniorSousa.webServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
