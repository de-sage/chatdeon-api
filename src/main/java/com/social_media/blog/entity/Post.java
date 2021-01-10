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
public class Post {

    @Id
    private int postId;

    private String postImageUrl;

    private String postText;

    @ManyToOne()
    @JoinColumn()
    private SocialMediaUser socialMediaUser;

    @OneToMany
    private List<Comment> commentList;
}
