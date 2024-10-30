package com.SpringSecurity.SpringSecurity.Repo;

import com.SpringSecurity.SpringSecurity.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Long> {
    Users findByUsername(String username);
}
