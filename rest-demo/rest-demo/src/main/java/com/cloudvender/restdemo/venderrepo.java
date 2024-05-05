package com.cloudvender.restdemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface venderrepo extends JpaRepository<venderdetails,String>{
    
}
