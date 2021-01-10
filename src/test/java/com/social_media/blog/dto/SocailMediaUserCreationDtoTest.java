package com.social_media.blog.dto;

import com.social_media.blog.entity.SocialMediaUser;
import org.junit.Test;
import org.modelmapper.ModelMapper;

import static org.junit.Assert.assertEquals;

public class SocailMediaUserCreationDtoTest {

    private static final ModelMapper modelMapper = new ModelMapper();

    @Test
    public void checkSocialMediaUserMapping() {
        SocialMediaUserCreationDto creation = new SocialMediaUserCreationDto();

        creation.setEmail("gomotosho1.gmail.com");
        creation.setUsername("Gideon");
        creation.setPassword("Password");

        SocialMediaUser client = modelMapper.map(creation, SocialMediaUser.class);
        assertEquals(creation.getEmail(), client.getEmail());
        assertEquals(creation.getUsername(), client.getUsername());
        assertEquals(creation.getPassword(), client.getPassword());
        System.out.println(client.getCreatedAt());
    }
}
