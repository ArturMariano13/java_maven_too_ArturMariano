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
public class Aviao {
    private Long id;
    private String codigo;
    private Double carga;
    private Integer qtdEconomica;
    private Integer qtdPrimeira;
    private Integer qtdExecutiva;
    private CiaAerea ciaAerea;

    public Aviao() {
    }

    public Aviao(Long id, 
            String codigo, 
            Double carga, 
            Integer qtdEconomica, 
            Integer qtdPrimeira, 
            Integer qtdExecutiva, 
            CiaAerea ciaAerea) {
        this.id = id;
        this.codigo = codigo;
        this.carga = carga;
        this.qtdEconomica = qtdEconomica;
        this.qtdPrimeira = qtdPrimeira;
        this.qtdExecutiva = qtdExecutiva;
        this.ciaAerea = ciaAerea;
    }

    public Long getId() {
        return id;
    }

    public Integer getQtdPrimeira() {
        return qtdPrimeira;
    }

    public Integer getQtdExecutiva() {
        return qtdExecutiva;
    }

    public Integer getQtdEconomica() {
        return qtdEconomica;
    }

    public String getCodigo() {
        return codigo;
    }

    public CiaAerea getCiaAerea() {
        return ciaAerea;
    }

    public Double getCarga() {
        return carga;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQtdPrimeira(Integer qtdPrimeira) {
        this.qtdPrimeira = qtdPrimeira;
    }

    public void setQtdExecutiva(Integer qtdExecutiva) {
        this.qtdExecutiva = qtdExecutiva;
    }

    public void setQtdEconomica(Integer qtdEconomica) {
        this.qtdEconomica = qtdEconomica;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCiaAerea(CiaAerea ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }   
}
