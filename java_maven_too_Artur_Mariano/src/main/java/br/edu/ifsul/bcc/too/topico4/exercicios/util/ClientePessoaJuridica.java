
package br.edu.ifsul.bcc.too.topico4.exercicios.util;

/**
 *
 * @author telmo
 */
public class ClientePessoaJuridica extends Cliente {
    
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    
    
    public ClientePessoaJuridica(){
        
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    
    
    
    
}
