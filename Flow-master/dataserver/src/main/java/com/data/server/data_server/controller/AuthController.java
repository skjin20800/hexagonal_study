package com.data.server.data_server.controller;

import com.data.server.data_server.model.AuthJoinReqDto;
import com.data.server.data_server.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RequiredArgsConstructor
@RestController
public class AuthController {

    private final AuthService authService;

    // 주소 : 인증안되었을 때 /user, /post, 인증이 되던 말던 무조건 온다./loginForm
    @GetMapping("/loginForm")
    public String login() {
        return "auth/loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "auth/joinForm";
    }

    @GetMapping("/join")
    public String join() {
        AuthJoinReqDto test = new AuthJoinReqDto();
        test.setUsername("aa"+ UUID.randomUUID());
        test.setPassword("bb");
        test.setEmail("cc@cc");
        authService.회원가입(test.toEntity());
        return "good"; // 로그인 로직 다시 때리기d
    }
}
