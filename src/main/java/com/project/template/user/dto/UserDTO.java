package com.project.template.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {
	private String userNo;
	private String userName;
	private String userId;
	private String userPassword;
	private String userRole;
	private String userDelFl;
}
