package com.swagthehooman.chatapplication.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swagthehooman.chatapplication.DTOs.UserInfoDTO;
import com.swagthehooman.chatapplication.Models.User;
import com.swagthehooman.chatapplication.Repositories.IUserRepository;

@RestController
@RequestMapping("/user/")
public class UserInfoController {

    @Autowired
    private IUserRepository userRepo;

    public UserInfoDTO getUserInfo(@RequestParam String username) {
        return new UserInfoDTO(userRepo.getByUserName(username).get());
    }

    public UserInfoDTO setUserInfo(@RequestBody UserInfoDTO userInfo) {
        User user = new User();
        user.setEmail(userInfo.getEmail());
        user.setPassword(userInfo.getPassword());
        user.setUserName(userInfo.getUserName());

        return new UserInfoDTO(userRepo.save(user));
    }
}
