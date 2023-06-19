/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

/**
 *
 * @author Usuario
 */
public class Aeroporto {
    
    private Long id;
    private String nome;
    private String codigo;
    private Endereco endereco;
    
    Aeroporto(){
        
    }

    public Aeroporto(Long id, String nome, String codigo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
     
    
}
