package io.github.PerseuAlves.springbootkeycloak.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String root() {
		return "root";
	}
	
	@GetMapping("/user-admin")
	public String user(@AuthenticationPrincipal OAuth2User principal) {
		return principal.getName();
	}
}
