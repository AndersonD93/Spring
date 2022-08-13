package com.aduran.HolaSpring_JDK11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.aduran.HolaSpring_JDK11.domain.Persona;


@Controller
public class ControladorRest {
	
	@Value("${index.saludo}")
	private String saludo;
	
    @GetMapping("/")
    public String inicio(Model model){
    	var mensaje= "Hola Mundo con Thymeleaf soy Anderson";
    	
    	var persona= new Persona();
    	persona.setNombre("Anderson");

    	
    	
    	model.addAttribute("mensaje", mensaje);
    	model.addAttribute("saludo", saludo);
    			
        return "index";
    }

}

