package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

/**
 *
 * @author Usuario
 */
public class Peca {
    
    private Integer id;
    private String nome;
    private Float valor;
    private String fornecedor;
    
    public Peca(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
