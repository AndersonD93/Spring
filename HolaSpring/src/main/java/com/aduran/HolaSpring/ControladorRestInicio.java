package com.aduran.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorRestInicio {

    @GetMapping("/")
    public String inicio(){
        log.info("ejecutanto el controlador rest");
        return "Hola Mundo con Spring 1";
    }
}
