package com.aduran.HolaSpring_JDK11;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class ControladorRest {
    @GetMapping("/")
    public String inicio(){
        return ("Hola Mundo Spring");
    }

}

