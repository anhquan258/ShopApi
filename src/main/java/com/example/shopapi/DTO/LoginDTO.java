package com.example.shopapi.DTO;

import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class LoginDTO {
	private String acc;
    private String pass;
}
