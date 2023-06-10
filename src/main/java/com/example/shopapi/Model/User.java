package com.example.shopapi.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "iduser")
    private Integer iduser;

    @Column(name = "acc")
    private String acc;

    @Column(name = "pass")
    private String pass;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "adress")
    private String adress;

    public User(String acc, String pass, String name,
        String email, String birthday, String adress) {
        this.acc = acc;
        this.pass = pass;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.adress = adress;
    }

    public User(Integer iduser, String acc, String name, String email, String birthday, String adress) {
        this.iduser = iduser;
        this.acc = acc;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.adress = adress;
    }
}
