package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

/**
 *
 * @author Usuario
 */
public class Equipe {
    
    private Integer id;
    private String nome;
    private String especialidades;
    
    public Equipe(){
        
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

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
    
    
}
