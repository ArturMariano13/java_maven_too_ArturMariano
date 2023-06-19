package br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_biblioteca.classes;

import java.util.Collection;

/**
 *
 * @author artur_mariano
 */

// agregação: relacionamento N-N
// losango não preenchido
public class Livro {
    
    private Integer id;
    private String titulo;
    //o livro possui uma coleção (lista) de palavras-chave
    private Collection<PalavrasChave> palavrasChave;
    
    Livro(){
        
    }
    
    public Livro(Integer id, String titulo){
        
        this.id = id;
        this.titulo = titulo;
    }
    
    public Integer getId(){
        return this.id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
