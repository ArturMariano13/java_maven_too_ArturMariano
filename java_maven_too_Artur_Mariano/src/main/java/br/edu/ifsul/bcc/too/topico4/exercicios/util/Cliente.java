
package br.edu.ifsul.bcc.too.topico4.exercicios.util;

import java.util.Date;

/**
 *
 * @author telmo
 */
public class Cliente {
    
   
    protected String endereco;
    protected String bairro;
    protected String telefone;
    protected Date ultimaCompra;
    
    
    Cliente(){
        
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(Date ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }

    
    
    
}
