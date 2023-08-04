package com.MundoSenai.Presenca.Controller;

import ch.qos.logback.core.model.Model;
import com.MundoSenai.Presenca.Service.S_Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Pessoa {
    @GetMapping("/")
    public String helloWord() {
        return "Login/login";
    }

    @PostMapping("/")
    public String postLogin(@RequestParam("usuario") String usuario,
                            @RequestParam("senha") String senha) {
        if (S_Pessoa.getPessoaLogin(usuario, senha) == null) {
            return "Login/login";
        } else {
            return "Home/home";
        }
    }

    @GetMapping("/cadastro")
    public String getCadastro(){
        return "Pessoa/cadastro";
    }

    @PostMapping("/cadastro")
    public String postCadastro(@RequestParam("nome") String nome,
                               @RequestParam("email") String email,
                               @RequestParam("cpf") String cpf,
                               @RequestParam("telefone") String telefone,
                               @RequestParam("data_nasc") String data_nascimento,
                               @RequestParam("senha") String senha,
                               @RequestParam("confsenha") String conf_senha,
                               Model model){

        
        String mensagem = S_Pessoa.cadastrarPessoas(nome, email, cpf, telefone, data_nasc, senha, confsenha);
        model.addAttribute("nome") String nome,
        ("email") String email,
        ("cpf") String cpf,
        ("telefone") String telefone,
        ("data_nasc") String data_nascimento

        return "Redirect: /";
    }

}
