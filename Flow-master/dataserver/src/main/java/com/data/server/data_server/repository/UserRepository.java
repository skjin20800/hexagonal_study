package com.data.server.data_server.repository;

import com.data.server.data_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{


}
