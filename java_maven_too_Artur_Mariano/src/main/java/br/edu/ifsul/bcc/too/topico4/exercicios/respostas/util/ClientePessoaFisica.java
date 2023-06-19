
package br.edu.ifsul.bcc.too.topico4.exercicios.respostas.util;

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

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nascimento
     */
    public Date getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    
}
