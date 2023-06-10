package com.example.shopapi.Services;

import com.example.shopapi.DTO.LoginDTO;
import com.example.shopapi.DTO.UserDTO;
import com.example.shopapi.Model.User;
import com.example.shopapi.Repository.UserRepository;
import com.example.shopapi.payload.LoginMesage;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
	@Autowired
    private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public String addUser(UserDTO userDTO) {
		User user = new User(
				userDTO.getAcc(),
		    this.passwordEncoder.encode(userDTO.getPass()),
				userDTO.getName(),
				userDTO.getEmail(),
				userDTO.getBirthday(),
				userDTO.getAdress()
		);
		userRepository.save(user);
		return user.getName();
	}

	@Override
	public LoginMesage loginUser(LoginDTO loginDTO) {
		String msg = "";
		User user1 = userRepository.findByAcc(loginDTO.getAcc());
		if (user1 != null) {
			String password = loginDTO.getPass();
			String encodedPassword = user1.getPass();
			Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			if (isPwdRight) {
				Optional<User> employee = userRepository.findOneByAccAndPass(loginDTO.getAcc(), encodedPassword);
				if (employee.isPresent()) {
					return new LoginMesage("Login Success", true, user1);
				} else {
					return new LoginMesage("Login Failed", false);
				}
			} else {

				return new LoginMesage("password Not Match", false);
			}
		}else {
			return new LoginMesage("Account not exits", false);
		}
	}
	@Transactional
	@Override

	public String updateUser(User user1) {
		userRepository.updateUser(user1.getAcc(),user1.getAdress(),user1.getBirthday(),user1.getEmail(),user1.getName(),user1.getIduser());
		return user1.getName();
	}
}
