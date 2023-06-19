package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

/**
 *
 * @author Usuario
 */
public enum SituacaoBilhete {
    DISPONIVEL((long)1, "disponivel"),
    RESERVADO((long)2, "reservado"),
    VENDIDO((long)3, "vendido");
    
    private Long id;
    private String nome;

    private SituacaoBilhete(Long id, String nome) {
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
