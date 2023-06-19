package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

/**
 *
 * @author Usuario
 */
public abstract class Bilhete {
    
    private Long id;
    private Integer numero;
    private String assento;
    
    Bilhete(){
        
    }
    
    public Bilhete(Long id,
                    Integer numero,
                    String assento){
        
        this.id = id;
        this.numero = numero;
        this.assento = assento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }   
    
}
