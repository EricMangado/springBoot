package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class springBootWebControler {
	
	@GetMapping("/test")
	public String test() {
		return "<H1>Esto es una pagina de demos para /test</H1>";
		
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "<H1>Esto es una pagina de demos para /demo</H1>";
		
	}
	
}
