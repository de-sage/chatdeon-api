package com.social_media.blog.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/v1/SocialMediaUsers"})
public class MediaUserController {
    @GetMapping
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
