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
public class Rota {
    private Long id;
    private String nome;
    private String descricao;
    private Aeroporto aeroporto1;
    private Aeroporto aeroporto2;

    public Rota() {
    }

    public Rota(Long id, 
            String nome, 
            String descricao,
            Aeroporto aeroporto1,
            Aeroporto aeroporto2) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.aeroporto1 = aeroporto1;
        this.aeroporto2 = aeroporto2;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Aeroporto getAeroporto1() {
        return aeroporto1;
    }

    public Aeroporto getAeroporto2() {
        return aeroporto2;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAeroporto1(Aeroporto aeroporto1) {
        this.aeroporto1 = aeroporto1;
    }

    public void setAeroporto2(Aeroporto aeroporto2) {
        this.aeroporto2 = aeroporto2;
    }    
}
