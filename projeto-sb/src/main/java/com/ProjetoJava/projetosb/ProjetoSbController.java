package com.ProjetoJava.projetosb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjetoSbController {
	@GetMapping("/")
	public String pageHome() {
		return "home";
	}
	
	@GetMapping("/esp22")
	public String pageEsp22() {
		return "esperados2022";
	}
	
	@GetMapping("/esp23")
	public String pageEsp23() {
		return "esperados2023";
	}
	
	@GetMapping("/equipe")
	public String pageEquipe() {
		return "nossa-equipe";
	}
	
	@GetMapping("/contato")
	public String pageContato() {
		return "contato";
	}
}
