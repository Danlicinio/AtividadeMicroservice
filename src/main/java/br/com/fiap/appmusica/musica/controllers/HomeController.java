package br.com.fiap.appmusica.musica.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home (HttpServletRequest request) {
		request.setAttribute("nomeCantora", "Danielle Licinio!");
		return "home";
	}
	
}
