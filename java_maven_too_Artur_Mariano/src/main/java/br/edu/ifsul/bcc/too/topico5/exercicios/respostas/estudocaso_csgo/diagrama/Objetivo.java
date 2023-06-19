
package br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama;

import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Objetivo {
 
    private Integer id;
    private String descricao;
    private Integer pontos;
    private Collection<Local> locais;
    
    public Objetivo(){
        
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the pontos
     */
    public Integer getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    /**
     * @return the locais
     */
    public Collection<Local> getLocais() {
        return locais;
    }

    /**
     * @param locais the locais to set
     */
    public void setLocais(Collection<Local> locais) {
        this.locais = locais;
    }
    
    
    
    
}
