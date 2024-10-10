package com.jokingwill.SimpleUserAuthenticationAPI.model;
import com.jokingwill.SimpleUserAuthenticationAPI.model.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "users")

public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;


}
