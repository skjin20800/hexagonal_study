package com.data.server.data_server.model;

import lombok.Data;

@Data
public class AuthJoinReqDto {

    private String username;
    private String password;
    private String email;

    public User toEntity() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();
    }
}

