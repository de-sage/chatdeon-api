package com.social_media.blog.repository;


import com.social_media.blog.entity.SocialMediaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialMediaUserRepository extends JpaRepository<SocialMediaUser, Integer> {

}
