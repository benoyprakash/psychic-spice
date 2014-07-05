package com.classifieds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classifieds.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

}
