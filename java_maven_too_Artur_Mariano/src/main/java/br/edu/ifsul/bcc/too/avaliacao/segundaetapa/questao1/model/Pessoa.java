package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public abstract class Pessoa {
    
    private String cpf;
    private String nome;
    private Calendar data_nascimento;
    private String cep;
    private String complemento;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String cpf,
                String nome,
                Calendar data_nascimento,
                String cep,
                String complemento){
        this.cpf = cpf;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    
}
