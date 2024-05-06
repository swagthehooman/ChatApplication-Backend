package com.swagthehooman.chatapplication.Models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    private String email;
    private UUID userId;
    private String username;
    private String password;
    private long fileSize;
    private Boolean isActive;
    private String roles;
    // @Lob
    // @Column(columnDefinition = "BLOB")
    // private byte[] dp;
}
