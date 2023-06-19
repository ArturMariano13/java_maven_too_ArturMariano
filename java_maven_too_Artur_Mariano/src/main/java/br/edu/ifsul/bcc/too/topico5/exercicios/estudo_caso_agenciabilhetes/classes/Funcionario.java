/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Funcionario extends Pessoa{
    
    private String codigo;
    private String contaCorrente;
    
    Funcionario(){
        
    }
    
    public Funcionario(Long id, 
                    String nome, 
                    String email, 
                    String telefone, 
                    String usuario, 
                    String senha, 
                    Date dataNascimento,
                    String codigo,
                    String contaCorrente){
        //super(id, nome, email, telefone, usuario, senha, dataNascimento);
        this.codigo = codigo;
        this.contaCorrente = contaCorrente;
    }
}