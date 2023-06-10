package com.example.shopapi.Controllers;

import com.example.shopapi.DTO.LoginDTO;
import com.example.shopapi.DTO.UserDTO;
import com.example.shopapi.Model.User;
import com.example.shopapi.payload.LoginMesage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {
	@Autowired
	private com.example.shopapi.Services.UserService userService;

	@PostMapping(path="/save")
	public String saveUser(@RequestBody UserDTO userDTO){
		String id=userService.addUser(userDTO);
		return id;
	}
	@PostMapping(path="/login")
	public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO){
		LoginMesage loginMesage = userService.loginUser(loginDTO);
		return ResponseEntity.ok(loginMesage);
	}
	@RequestMapping(value = "/edit", method = RequestMethod.PUT)
	private User update(@RequestBody User user)
	{
		userService.updateUser(user);
		return user;
	}

}
