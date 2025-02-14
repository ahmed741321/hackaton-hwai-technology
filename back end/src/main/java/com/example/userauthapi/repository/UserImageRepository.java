package com.example.userauthapi.repository;

import com.example.userauthapi.entity.UserImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserImageRepository extends JpaRepository<UserImage, Long> {

}
