
package br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama;

import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Arma extends Artefato {
    
    private float comprimento_cano;
    private Tipo tipo;
    private Collection<Municao> municoes;
    
    
    public Arma(){
        
    }

    /**
     * @return the comprimento_cano
     */
    public float getComprimento_cano() {
        return comprimento_cano;
    }

    /**
     * @param comprimento_cano the comprimento_cano to set
     */
    public void setComprimento_cano(float comprimento_cano) {
        this.comprimento_cano = comprimento_cano;
    }

    /**
     * @return the municoes
     */
    public Collection<Municao> getMunicoes() {
        return municoes;
    }

    /**
     * @param municoes the municoes to set
     */
    public void setMunicoes(Collection<Municao> municoes) {
        this.municoes = municoes;
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    
}
