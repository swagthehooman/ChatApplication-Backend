package com.swagthehooman.chatapplication.Controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swagthehooman.chatapplication.Models.Channel;
import com.swagthehooman.chatapplication.Repositories.IChannelRepository;

@RestController
@RequestMapping("/channels/")
public class ChannelController {

    @Autowired
    private IChannelRepository channelRepo;

    @GetMapping("/userchannels")
    public List<Channel> getChannelsById(@RequestParam UUID id) {
        return channelRepo.findByUserId(id);
    }

    @GetMapping("/allchannels")
    public List<Channel> getAllChannels() {
        return channelRepo.findAll();
    }
    
}
