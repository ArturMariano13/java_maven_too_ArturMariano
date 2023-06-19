package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

/**
 *
 * @author Usuario
 */
public class Bagagem {
    private Long id;
    private Double peso;
    private TipoBagagem tipoBagagem;

    public Bagagem() {
    }

    public Bagagem(Long id, 
                Double peso) {
        this.id = id;
        this.peso = peso;
    }
    
    
}
