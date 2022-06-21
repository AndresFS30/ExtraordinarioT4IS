package com.extraordinario.pregunta2;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;



@RestController
//@RequestMapping("/extraordinario/saludos")
public class EndPoint {

    @GetMapping("/Hola")
    public String saludoGet(@RequestParam String nombre) {
        return "Hola" + " " + nombre;
    }

    @GetMapping("/HolaG")
    public String holaG() {

        String g = "Hola Gente";
        
        return g;
    }

    @PostMapping("/Persona")
    public String saludoPost(@RequestBody Persona cont){
        return  cont.getMensaje()+" "+"hola mundo";
    } 
}