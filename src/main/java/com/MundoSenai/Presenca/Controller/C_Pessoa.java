package com.MundoSenai.Presenca.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class C_Pessoa {
    @GetMapping("/")
    public String helloWord (){
        return "Login/login";
    }
    @GetMapping("/teste")
    public String teste (){
        return "teste";
    }
}