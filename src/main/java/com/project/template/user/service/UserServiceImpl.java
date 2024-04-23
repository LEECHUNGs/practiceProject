package com.project.template.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.template.user.dto.UserDTO;
import com.project.template.user.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

	private final UserMapper mapper;

	@Override
	public int insertUser(UserDTO user) {
		mapper.insertUser(user);

		return 0;
	}

	@Override
	public void userSignUp(UserDTO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserDTO userLogIn(UserDTO inputUser) {
		UserDTO currentUser = mapper.userLogIn(inputUser.getUserId());

		return currentUser;
	}

}
