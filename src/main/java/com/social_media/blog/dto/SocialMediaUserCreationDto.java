package com.social_media.blog.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SocialMediaUserCreationDto {

    @NotNull
    public String username;

    @NotNull
    public String password;

    @NotNull
    private LocalDateTime createdAt;


}
