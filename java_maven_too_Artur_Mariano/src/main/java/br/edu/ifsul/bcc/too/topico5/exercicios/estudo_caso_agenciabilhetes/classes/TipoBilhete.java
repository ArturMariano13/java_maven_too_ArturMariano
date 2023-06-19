package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

/**
 *
 * @author Usuario
 */
public enum TipoBilhete {
    ECONOMICA((long)1, "Economica"),
    EXECUTIVA((long)2, "Executiva"),
    PRIMEIRA((long)3, "Primeira");
    
    private Long id;
    private String nome;
    
    TipoBilhete(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
}
