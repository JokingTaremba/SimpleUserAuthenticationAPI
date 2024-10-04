package com.jokingwill.SimpleUserAuthenticationAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "users")

public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID)

    private Long id;
    private String username;
    private String email;
    private String password;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

}
