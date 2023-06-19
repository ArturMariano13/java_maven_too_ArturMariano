package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

import java.util.Date;
        
/**
 *
 * @author Usuario
 */
public abstract class Pessoa {
    
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String usuario;
    private String senha;
    private Date dataNascimento;
    private Endereco endereco;

    Pessoa() {
    }

    public Pessoa(Long id, 
            String nome, 
            String email, 
            String telefone, 
            String usuario, 
            String senha, 
            Date dataNascimento, 
            Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }       
}
