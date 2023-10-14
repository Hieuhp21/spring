package com.example.de2.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.de2.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User, Integer> {
    User findByUsernameAndPassword(String username,String password);
}
