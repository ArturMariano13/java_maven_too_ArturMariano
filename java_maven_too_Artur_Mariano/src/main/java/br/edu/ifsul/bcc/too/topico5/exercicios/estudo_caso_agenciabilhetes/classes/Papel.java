package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Papel {
    
    private Long id;
    private String nome;
    private String descricao;
    
    private CiaAerea ciaAerea;
    
    private ArrayList<Funcionario> funcionarios;
    
    Papel(){
        funcionarios = new ArrayList();
    }
    
    public Papel(Long id,
                String nome,
                String descricao,
                CiaAerea ciaAerea){
        
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ciaAerea = ciaAerea;
        funcionarios = new ArrayList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CiaAerea getCiaAerea() {
        return ciaAerea;
    }

    public void setCiaAerea(CiaAerea ciaAerea) {
        this.ciaAerea = ciaAerea;
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public int quantidadeFuncionarios(){
        return funcionarios.size();
    }
    
    public void excluirFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }
    
    public Funcionario getFuncionario(int posicao){
        return funcionarios.get(posicao);
    }
}
