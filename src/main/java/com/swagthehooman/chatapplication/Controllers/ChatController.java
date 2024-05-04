package com.swagthehooman.chatapplication.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagthehooman.chatapplication.Models.Chat;
import com.swagthehooman.chatapplication.Repositories.IChatRepository;

@RestController
@RequestMapping("/chats/")
public class ChatController {

    @Autowired
    private IChatRepository chatRepo;

    @GetMapping("/allChats")
    public List<Chat> getAllChats() {
        return chatRepo.findAll();
    }
}
