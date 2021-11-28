package com.ProjetoSpringBoot.projetosb;

import org.springframework.web.bind.annotation.GetMapping;

public class SugestaoController {
	@GetMapping("/sugerirfilme")
	public String pageSugestao() {
		return "sugestão";
	}
	
	@GetMapping("/filmesugerido")
	public String pageSugido() {
		return "sugerido";
	}
	
	@GetMapping("/sucesso")
	public String pageSucesso() {
		return "sucesso";
	}
}