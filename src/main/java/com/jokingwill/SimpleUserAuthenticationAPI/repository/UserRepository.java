package com.jokingwill.SimpleUserAuthenticationAPI.repository;

import com.jokingwill.SimpleUserAuthenticationAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
