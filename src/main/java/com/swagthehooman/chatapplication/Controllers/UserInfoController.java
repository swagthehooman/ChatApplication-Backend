package com.swagthehooman.chatapplication.Controllers;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swagthehooman.chatapplication.DTOs.UserInfoDTO;
import com.swagthehooman.chatapplication.Models.User;
import com.swagthehooman.chatapplication.Repositories.IUserRepository;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private IUserRepository userRepo;

    @GetMapping("/getusername")
    public UserInfoDTO getUserInfoByUsername(@RequestParam String username) {
        Optional<User> user = userRepo.findByUserName(username);
        return user.isPresent() ? new UserInfoDTO(user.get()) : new UserInfoDTO();
    }

    @GetMapping("/getuserid")
    public UserInfoDTO getUserInfoById(@RequestParam UUID id) {
        Optional<User> user = userRepo.findById(id);
        return user.isPresent() ? new UserInfoDTO(user.get()) : new UserInfoDTO();
    }

    @PostMapping("/saveuser")
    public UserInfoDTO setUserInfo(@RequestBody UserInfoDTO userInfo) {
        User user = new User();
        user.setEmail(userInfo.getEmail());
        user.setPassword(userInfo.getPassword());
        user.setUserName(userInfo.getUserName());
        user.setUserId(UUID.randomUUID());
        return new UserInfoDTO(userRepo.save(user));
    }
}
