package com.ProjetoSpringBoot.projetosb;

import org.springframework.web.bind.annotation.GetMapping;

public class Esperados23Controller {
	@GetMapping("/esperados22")
	public String pageEsp22() {
		return "esperados22";
	}
}