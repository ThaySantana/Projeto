package com.TrabalhoJava.projeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjetoJavaController {
	@GetMapping("/")
	public String inicio() {
		return "index";
	}
	
	@GetMapping("/felipe")
	public String pageFelipe() {
		return "felipe";
	}
	
	@GetMapping("/leonardo")
	public String pageLeonardo() {
		return "leonardo";
	}
	
	@GetMapping("/thaylla")
	public String pageThaylla() {
		return "thaylla";
	}
	
	@GetMapping("/contato")
	public String pageContato() {
		return "contato";
	}
}

