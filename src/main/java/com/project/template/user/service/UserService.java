package com.project.template.user.service;

import com.project.template.user.dto.UserDTO;

public interface UserService {

	int insertUser(UserDTO user);

	void userSignUp(UserDTO user);

	UserDTO userLogIn(UserDTO inputUser);

}
