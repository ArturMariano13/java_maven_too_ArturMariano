package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

/**
 *
 * @author artur_mariano
 */
public class PalavrasChave {
    
    private Integer id;
    private String nome;
    
    //construtor padrão
    PalavrasChave(){
        
    }
    
    //construtor público com parâmetros
    public PalavrasChave (Integer id, String nome){
        
        this.id = id;
        this.nome = nome;
    }
    
    public Integer getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }   
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
