package com.bolsadeideas.spring.boot.web.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	@GetMapping("/")
	public String index() {
		 return "params/index";
	}

	@GetMapping("/string")
	public String params(@RequestParam(name="texto") String texto, Model model) {
		model.addAttribute("resultado", "El texto enviado es: "+texto);
		return "params/ver";
	}
	
	
	@GetMapping("/mix-params")
	public String params(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
		model.addAttribute("resultado", "El texto enviado es: "+saludo + " y el numero es: "+numero);
		return "params/ver";
	}
}
	