package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class Parcelamento{
    
    private Integer id;
    private Integer numero_parcela;
    private Calendar data_vencimento;
    private Calendar data_pagamento;
    private Double valor;
    private Double valor_pago;
    
    private Situacao situacao;
    
    // atributo que irá referenciar Emprestimo -> agregação por composição
    // atributo da entidade fraca que aponta para a forte
    private Emprestimo emprestimo;
    
    Parcelamento(){
        
    }
    public Parcelamento(Integer id,
            Integer numero_parcela,
            Calendar data_vencimento,
            Calendar data_pagamento,
            Double valor,
            Double valor_pago){
        
        this.id = id;
        this.numero_parcela = numero_parcela;
        this.data_vencimento = data_vencimento;
        this.data_pagamento = data_pagamento;
        this.valor = valor;
        this.valor_pago = valor_pago;
    }
    
    public Integer getId(){
        return this.id;
    }
    
    public Integer getNumero_parcela(){
        return this.numero_parcela;
    }
    
    public Calendar getData_vencimento(){
        return this.data_vencimento;
    }
    
    public Calendar getData_pagamento(){
        return this.data_pagamento;
    }
    
    public Double getValor(){
        return this.valor;
    }
    
    public Double getValor_pago(){
        return this.valor_pago;
    }
    
    public Situacao getSituacao(){
        return this.situacao;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public void setNumero_parcela(Integer numero_parcela){
        this.numero_parcela = numero_parcela;
    }
    
    public void setData_vencimento(Calendar data_vencimento){
        this.data_vencimento = data_vencimento;
    }
    
    public void setData_pagamento(Calendar data_pagamento){
        this.data_pagamento = data_pagamento;
    }
    
    public void setValor(Double valor){
        this.valor = valor;
    }
    
    public void setValor_pago(Double valor_pago){
        this.valor_pago = valor_pago;
    }
    
    public void setSituacao(){
        Parcelamento p = new Parcelamento();
        if (this.valor_pago == null){
            situacao = situacao.ATRASO;
        }
        else{
            situacao = situacao.EMDIA;
        }
            
        this.situacao = situacao;
    }
    
}
