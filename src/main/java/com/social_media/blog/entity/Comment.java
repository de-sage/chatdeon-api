package com.social_media.blog.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Comment {

    @Id
    private String commentId;

    @ManyToOne()
    @JoinColumn()
    private SocialMediaUser socialMediaUser;
}
