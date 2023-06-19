
package br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama;

import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Mapa {
    
    private Integer id;
    private String nome;    
    private Collection<Local> locais;
    
    public Mapa(){
        
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
