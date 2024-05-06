package com.swagthehooman.chatapplication.services.AuthenticationServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.swagthehooman.chatapplication.DTOs.UserAuthDTO;
import com.swagthehooman.chatapplication.DTOs.UserRegisterDTO;
import com.swagthehooman.chatapplication.Repositories.IUserRepository;

@Service
public class AuthenticationService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private IUserRepository userRepo;
    @Autowired
    private AuthenticationManager authManager;
    @Autowired
    private TokenService tokenService;

    // public UserAuthDTO registerUser(UserRegisterDTO userInfo) {

    // }

    // public UserAuthDTO loginUser(String email, String password){

    // }
}
