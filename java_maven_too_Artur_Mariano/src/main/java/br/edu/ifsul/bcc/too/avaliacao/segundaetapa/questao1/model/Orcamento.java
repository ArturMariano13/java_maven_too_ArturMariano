package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Orcamento {
    
    private Integer id;
    private String observacoes;
    private Calendar data;
    
    private List<Peca> pecas;
    private Veiculo veiculo;
    private MaoObra mao_obra;
    private Cliente cliente;
    private Funcionario funcionario;

     public Orcamento(){
        pecas = new ArrayList<Peca>();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public MaoObra getMao_obra() {
        return mao_obra;
    }

    public void setMao_obra(MaoObra mao_obra) {
        this.mao_obra = mao_obra;
    }
     
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
    public void adicionarPeca(Peca p){
        pecas.add(p);
    }
    
    public void excluirPeca(Peca p){
        pecas.remove(p);
    }
    
    public int quantidadePecas(){
        return pecas.size();
    }
    
    public Peca getPecas(int posicao){
        return pecas.get(posicao);
    }
}
