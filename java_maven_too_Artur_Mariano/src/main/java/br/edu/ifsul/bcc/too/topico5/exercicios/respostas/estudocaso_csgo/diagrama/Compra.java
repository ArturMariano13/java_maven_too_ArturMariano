
package br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Compra {
    
    private Integer id;
    private Calendar data;
    private Float total;
    
    private Jogador jogador;
    
    private Collection<ItensCompra> itens;
    
    public Compra(){
        
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
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the total
     */
    public Float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Float total) {
        this.total = total;
    }

    /**
     * @return the jogador
     */
    public Jogador getJogador() {
        return jogador;
    }

    /**
     * @param jogador the jogador to set
     */
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    /**
     * @return the itens
     */
    public Collection<ItensCompra> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(Collection<ItensCompra> itens) {
        this.itens = itens;
    }
    
    
}
