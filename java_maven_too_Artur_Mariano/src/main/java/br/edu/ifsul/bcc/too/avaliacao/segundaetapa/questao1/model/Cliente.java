package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Cliente extends Pessoa {
    
    private String observacoes;
    
    private List<Veiculo> veiculos;
    
    public Cliente(String cpf, String nome, Calendar data_nascimento, String cep, String complemento, String observacoes, Veiculo v){
        super(cpf, nome, data_nascimento, cep, complemento);
        veiculos = new ArrayList<Veiculo>();
        adicionarVeiculo(v);
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
    }
    
    public int quantidadeVeiculos(){
        return veiculos.size();
    }
    
    public void excluirVeiculo(Veiculo v){
        veiculos.remove(v);
    }
    
    public Veiculo getVeiculo(int posicao){
        return veiculos.get(posicao);
    }
    
}
