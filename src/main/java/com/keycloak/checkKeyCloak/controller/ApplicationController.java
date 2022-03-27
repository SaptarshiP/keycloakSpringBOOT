package com.keycloak.checkKeyCloak.controller;

import javax.servlet.http.HttpServletRequest;

import org.keycloak.KeycloakSecurityContext;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApplicationController {
	
	
	
	@RequestMapping(value = "/app", method = RequestMethod.GET)
	public String getSd( Authentication auth ) {
		return auth.getName();
	}
	
	
}
