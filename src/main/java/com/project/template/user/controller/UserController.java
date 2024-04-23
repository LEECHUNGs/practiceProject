package com.project.template.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.template.user.dto.UserDTO;
import com.project.template.user.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@SessionAttributes({ "currentUser" })
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

	private final UserService service;

	@GetMapping("profile")
	public String profile() {

//		service.insertUser(user);

		return "layouts/profile";
	}

	@GetMapping("signup")
	public String userSignUp() {
		return "layouts/user/signUp";
	}

	@GetMapping("login")
	public String userLogin() {
		return "layouts/user/login";
	}

	@PostMapping("signup")
	public String userSignUp(UserDTO user) {

		service.userSignUp(user);

		return "redirect:/profile";
	}

	@PostMapping("login")
	public String userLogIn(UserDTO inputUser, Model model, RedirectAttributes redirectAttributes) {
		UserDTO currentUser = service.userLogIn(inputUser);

		model.addAttribute("loginMember", currentUser);

		return "redirect:/";
	}

}
