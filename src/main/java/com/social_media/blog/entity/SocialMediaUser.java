package com.social_media.blog.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class SocialMediaUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String socailMediaUserId;

    private String socialMediaUsername;

    private String password;

    @OneToMany
    private List<Post> posts;

}
