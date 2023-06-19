package br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_biblioteca.classes;

import java.util.Calendar;

/**
 *
 * @author artur_mariano
 */
public class Funcionario extends Pessoa{
    // extends informa que Funcionario é herança de Pessoa
    // herda todas as características de Pessoa
    private String numero_ctps;
    
    Funcionario(){
        
    }
    
    public Funcionario(String numero_ctps){
        
        this.numero_ctps = numero_ctps;
    }
    
    public Funcionario(String cpf,
            String rg,
            String nome,
            String endereco,
            String cep,
            Integer numero,
            String telefone,
            Calendar data_cadastro,
            Calendar data_nascimento,
            String numero_ctps){
        
        super(cpf, rg, nome, endereco, cep, numero, telefone, data_cadastro, data_nascimento);
        this.numero_ctps = numero_ctps;
    }
    
    //metodos get e set para o numero_ctps
    public String getNumero_ctps(){
        return this.numero_ctps;
    }
    public void setNumero_ctps(String numero_ctps){
        this.numero_ctps = numero_ctps;
    }
}
