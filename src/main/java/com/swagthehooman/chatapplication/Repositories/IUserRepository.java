package com.swagthehooman.chatapplication.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swagthehooman.chatapplication.Models.User;

public interface IUserRepository extends JpaRepository<User, String> {

    public Optional<User> findByUsername(String userName);

    public Optional<User> findByEmail(String email);
}
