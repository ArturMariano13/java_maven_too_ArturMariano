package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class Pagamento {
    
    private Integer id;
    private Integer numero_parcela;
    private Calendar data_vencimento;
    private Calendar data_pagamento;
    private Float valor;
    
    private Servico servico;
    private FormaPagamento formaPagamento;
    
    public Pagamento(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero_parcela() {
        return numero_parcela;
    }

    public void setNumero_parcela(Integer numero_parcela) {
        this.numero_parcela = numero_parcela;
    }

    public Calendar getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Calendar data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public Calendar getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Calendar data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    
}
