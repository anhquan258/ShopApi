package com.example.shopapi.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String acc;
    private String pass;
    private String name;
    private String email;
    private String birthday;
    private String adress;
}

