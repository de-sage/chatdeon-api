package com.social_media.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialMediaUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int socailMediaUserId;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String profilePicUrl;

    @OneToMany
    private List<Post> posts;

    @OneToMany
    private List<Friend> friends;

    @OneToMany
    private List<Message> chatHistory;

}
