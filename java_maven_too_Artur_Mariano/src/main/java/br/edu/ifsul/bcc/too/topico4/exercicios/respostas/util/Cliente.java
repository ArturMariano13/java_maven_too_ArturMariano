
package br.edu.ifsul.bcc.too.topico4.exercicios.respostas.util;

import java.util.Date;

/**
 *
 * @author telmo
 */
public class Cliente {
   
    private String endereco;
    private String bairro;
    private String telefone;
    private Date ultimacompra;
    
    public Cliente(){
        
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the ultimacompra
     */
    public Date getUltimacompra() {
        return ultimacompra;
    }

    /**
     * @param ultimacompra the ultimacompra to set
     */
    public void setUltimacompra(Date ultimacompra) {
        this.ultimacompra = ultimacompra;
    }

    
   
    
    
}
