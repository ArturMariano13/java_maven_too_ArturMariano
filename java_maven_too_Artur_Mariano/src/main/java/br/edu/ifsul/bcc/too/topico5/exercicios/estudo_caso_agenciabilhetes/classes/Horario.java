package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

import java.util.Date;
import java.util.Collection;

/**
 *
 * @author Usuario
 */
public class Horario {
    
    private Long id;
    private String codigo;
    private Date partida;
    private Date chegada;
    private Integer qtdEconomica;
    private Integer qtdPrimeira;
    private Integer qtdExecutiva;
    
    private Aviao aviao;
    
    private Collection <Bilhete> bilhete;

    private Rota rota;
    
    public Horario() {
    }

    public Horario(Long id, 
                String codigo, 
                Date partida, 
                Date chegada, 
                Integer qtdEconomica, 
                Integer qtdPrimeira, 
                Integer qtdExecutiva, 
                Aviao aviao,
                Rota rota) {
        this.id = id;
        this.codigo = codigo;
        this.partida = partida;
        this.chegada = chegada;
        this.qtdEconomica = qtdEconomica;
        this.qtdPrimeira = qtdPrimeira;
        this.qtdExecutiva = qtdExecutiva;
        this.aviao = aviao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getPartida() {
        return partida;
    }

    public void setPartida(Date partida) {
        this.partida = partida;
    }

    public Date getChegada() {
        return chegada;
    }

    public void setChegada(Date chegada) {
        this.chegada = chegada;
    }

    public Integer getQtdEconomica() {
        return qtdEconomica;
    }

    public void setQtdEconomica(Integer qtdEconomica) {
        this.qtdEconomica = qtdEconomica;
    }

    public Integer getQtdPrimeira() {
        return qtdPrimeira;
    }

    public void setQtdPrimeira(Integer qtdPrimeira) {
        this.qtdPrimeira = qtdPrimeira;
    }

    public Integer getQtdExecutiva() {
        return qtdExecutiva;
    }

    public void setQtdExecutiva(Integer qtdExecutiva) {
        this.qtdExecutiva = qtdExecutiva;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
    
    
}
