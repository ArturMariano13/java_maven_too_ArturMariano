
package br.edu.ifsul.bcc.too.topico4.exercicios.util;

import java.util.Date;

/**
 *
 * @author telmo
 */
public class ClientePessoaFisica extends Cliente {
    
    private String cpf;
    private String nome;
    private Date nascimento;
    
    public ClientePessoaFisica(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
