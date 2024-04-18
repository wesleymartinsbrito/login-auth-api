package com.wesleymartins.loginauthapi.repositories;

import com.wesleymartins.loginauthapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
