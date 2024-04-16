package com.data.server.data_server.service;

import com.data.server.data_server.model.RoleType;
import com.data.server.data_server.model.User;
import com.data.server.data_server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final UserRepository userRepository;


    @Transactional
    public void 회원가입(User user) {
        user.setRole(RoleType.USER);
        userRepository.save(user);
    }
}