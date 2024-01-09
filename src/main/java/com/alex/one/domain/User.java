package com.alex.one.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data   // for lambok
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
}
