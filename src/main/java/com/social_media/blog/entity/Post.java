package com.social_media.blog.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Post {

    @Id
    private String postId;

    @ManyToOne()
    @JoinColumn()
    private SocialMediaUser socialMediaUser;

    @OneToMany
    private List<Comment> commentList;
}
