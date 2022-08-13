package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Mensaje con Thymeleaf";
        
        var persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Duran");
        persona1.setEmail("jperez@mail.com");
        persona1.setTelefono("3185229307");

        var persona2 = new Persona();
        persona2.setNombre("Anderson");
        persona2.setApellido("Sepulveda");
        persona2.setEmail("ander@mail.com");
        persona2.setTelefono("3178021942");

        var personaList= new ArrayList();
        personaList.add(persona1);
        personaList.add(persona2);

        //var personas= Arrays.asList(persona,persona2);


        
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personaList",personaList);
        return "index";
    }
}
