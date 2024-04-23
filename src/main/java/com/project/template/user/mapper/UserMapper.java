package com.project.template.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.project.template.user.dto.UserDTO;

@Mapper
public interface UserMapper {
	public int insertUser(@Param("user") UserDTO user);

	public UserDTO userLogIn(String string);
}
