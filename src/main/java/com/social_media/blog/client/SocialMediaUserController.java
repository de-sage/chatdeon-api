package com.social_media.blog.client;

import com.social_media.blog.dto.SocialMediaUserCreationDto;
import com.social_media.blog.entity.SocialMediaUser;
import com.social_media.blog.repository.SocialMediaUserRepository;
import com.social_media.blog.util.DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class SocialMediaUserController {

    @Autowired
    private SocialMediaUserRepository socialMediaUserRepository;


    @GetMapping
    public List<SocialMediaUser> getUsers() {
        return socialMediaUserRepository.findAll();
    }

    @PostMapping
    public void newUser(@DTO(SocialMediaUserCreationDto.class) SocialMediaUser socialMediaUser) {
        socialMediaUserRepository.save(socialMediaUser);
    }
}
