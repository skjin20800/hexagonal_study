package com.data.server.data_server.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {

    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //시퀀스, auto_increment

    @Column(nullable = false, length = 100, unique = true)
    private String username;

    @Column(nullable = false, length = 100)// 123456 => 해쉬(비밀번호 암호화)
    private String password;

    @Column(nullable = false, length = 100)
    private String email;

    @Setter
    @Enumerated(EnumType.STRING) // Enum값을 DB에넣을때 STRING으로 바꿔넣어준다
    private RoleType role; // ADMIN, USER등 권한


}
