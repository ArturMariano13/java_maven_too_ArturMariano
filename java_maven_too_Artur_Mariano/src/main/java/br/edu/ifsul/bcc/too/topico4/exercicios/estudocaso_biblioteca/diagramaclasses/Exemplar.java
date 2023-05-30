package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

/**
 *
 * @author artur_mariano
 */
public class Exemplar {
    
    private Integer id;
    private Boolean situacao;
    //apenas para onde aponta a seta
    private Livro livro;
    
    Exemplar(){
        
    }
    
    public Exemplar(Integer id, Boolean situacao){
        this.id = id;
        this.situacao = situacao;
    }
    
    public Integer getId(){
        return this.id;
    }
    
    public Boolean getSituacao(){
        return this.situacao;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public void setSituacao(Boolean situacao){
        this.situacao = situacao;
    }
}
