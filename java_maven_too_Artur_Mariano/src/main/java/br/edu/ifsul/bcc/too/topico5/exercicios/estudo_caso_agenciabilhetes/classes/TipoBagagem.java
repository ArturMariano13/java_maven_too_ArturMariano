package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

/**
 *
 * @author Usuario
 */
public enum TipoBagagem {
    DISPONIVEL((long)1, "mao", 5.0),
    RESERVADO((long)2, "nacional", 23.0),
    VENDIDO((long)3, "internacional", 32.0);
    
    private Long id;
    private String nome;
    private Double pesoMax;
    TipoBagagem(Long id, String nome, Double pesoMax) {    
        this.id = id;
        this.nome = nome;
        this.pesoMax = pesoMax;
    }
    
    public Long getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Double getPesoMax(){
        return pesoMax;
    }
    
}
