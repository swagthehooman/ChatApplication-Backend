package com.swagthehooman.chatapplication.DTOs;

import com.swagthehooman.chatapplication.Models.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoDTO {
    private String userName;
    private String email;
    private String password;

    public UserInfoDTO(User user) {
        this.email = user.getEmail();
        this.userName = user.getUserName();
        this.password = user.getPassword();
    }
}
