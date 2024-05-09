package br.com.cpti.exemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello {
	
	@GetMapping
	
	public String exemplo() {
		return "Hello World!";
	}
	
	@GetMapping("/teste")
	
	public String exemplo2() {
		return "Aula de Spring";
	}
	
	@GetMapping("/converter")
	
	public String exemplo3(@RequestParam String texto) {
		return texto.toUpperCase();
	}
}
