package com.MundoSenai.Presenca.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")
public class M_Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Long cpf;
    private Long telefone;
    private String data_nasc;
    private String senha;


    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Long getCpf() {
        return cpf;
    }

    public Long getTelefone() {
        return telefone;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public String getSenha() {
        return senha;
    }


}
