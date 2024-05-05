package com.swagthehooman.chatapplication.Repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagthehooman.chatapplication.Models.User;

public interface IUserRepository extends JpaRepository<User, UUID> {
    public Optional<User> findByUserName(String userName);
}
