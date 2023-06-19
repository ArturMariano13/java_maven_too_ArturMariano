package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class Funcionario extends Pessoa{
    
    private String numero_ctps;
    private Calendar data_admissao;
    private Calendar data_demissao;
    
    private Cargo cargo;
    
    public Funcionario(String cpf, String nome, Calendar data_nascimento, String cep, String complemento, String numero_ctps, Calendar data_admissao, Calendar data_demissao){
        
        super(cpf, nome, data_nascimento, cep, complemento);
        this.numero_ctps = numero_ctps;
        this.data_admissao = data_admissao;
        this.data_demissao = data_demissao;
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Calendar getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Calendar data_admissao) {
        this.data_admissao = data_admissao;
    }

    public Calendar getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Calendar data_demissao) {
        this.data_demissao = data_demissao;
    }
    
    
}
