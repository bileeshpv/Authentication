package com.sample.user.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.user.management.entity.UserDetailsBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetailsBean,Integer>{

}
