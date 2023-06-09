package br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_biblioteca.classes;

import java.util.Calendar;

/**
 *
 * @author artur_mariano
 */
public class Aluno extends Pessoa {
    
    private String matricula;
    
    public Aluno(){
        
    }
    
    public Aluno(String matricula){
        
        this.matricula = matricula;
    }
    
    public Aluno(String cpf,
            String rg,
            String nome,
            String endereco,
            String cep,
            Integer numero,
            String telefone,
            Calendar data_cadastro,
            Calendar data_nascimento,
            String matricula){
        
       super(cpf, rg, nome, endereco, cep, numero, telefone, data_cadastro, data_nascimento);
       this.matricula = matricula;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getCpf(){
        return super.getCpf();
    }
    
    
    
}
