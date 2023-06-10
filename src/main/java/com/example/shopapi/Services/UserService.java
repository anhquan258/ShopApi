package com.example.shopapi.Services;

import com.example.shopapi.DTO.LoginDTO;
import com.example.shopapi.DTO.UserDTO;
import com.example.shopapi.Model.User;
import com.example.shopapi.payload.LoginMesage;

public interface UserService {
  String addUser(UserDTO userDTO);


  LoginMesage loginUser(LoginDTO loginDTO);

  String updateUser(User user);
}
