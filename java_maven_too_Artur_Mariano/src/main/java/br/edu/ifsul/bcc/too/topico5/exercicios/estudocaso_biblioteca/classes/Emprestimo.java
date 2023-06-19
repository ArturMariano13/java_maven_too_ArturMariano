package br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_biblioteca.classes;

import java.util.Collection;
import java.util.Calendar;

/**
 *
 * @author artur_mariano
 */
public class Emprestimo implements Comparable<Emprestimo> {
    
    private Calendar data;
    private Calendar data_devolucao;
    private Calendar data_devolvido;
    private Boolean situacao;
    private Funcionario funcionario;
    private Aluno aluno;
    private Exemplar exemplar;
    
    private Collection<Parcelamento> parcelamento;
    
    
    public Emprestimo(){
        
    }
    
    public Emprestimo (Calendar data, 
            Calendar data_devolucao, 
            Calendar data_devolvido, 
            Boolean situacao,
            Funcionario funcionario,
            Aluno aluno,
            Exemplar exemplar){
        this.data = data;
        this.data_devolucao = data_devolucao;
        this.data_devolvido = data_devolvido;
        this.situacao = situacao;
        this.aluno = aluno;
        this.exemplar = exemplar;
        this.funcionario = funcionario;
    }
    
    public Calendar getData(){
        return this.data;
    }
    
    public Calendar getData_devolucao(){
        return this.data_devolucao;
    }
    
    public Calendar getData_devolvido(){
        return this.data_devolvido;
    }
    
    public Boolean getSituacao(){
        if (this.data_devolvido != null)
            this.situacao = true;
        else
            this.situacao = false;
        return this.situacao;
    }
    
    public Collection getParcelamento(){
        return this.parcelamento;
    }
    
    public void setData(Calendar data){
        this.data = data;
    }
    
    public void setData_devolucao(Calendar data_devolucao){
        this.data_devolucao = data_devolucao;
    }
    
    public void setData_devolvido(Calendar data_devolvido){
        this.data_devolvido = data_devolvido;
    }
    
    public void setSituacao(Boolean situacao){
        if (this.data_devolvido == null)
            situacao = false;
        else
            situacao = true;
        this.situacao = situacao;
    }
    
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
    
    public void setExemplar(Exemplar exemplar){
        this.exemplar = exemplar;
    }
    
    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }
    
    public void setParcelamento(Collection<Parcelamento> parcelamento){
        this.parcelamento = parcelamento;
    }
    
    @Override
    public int compareTo(Emprestimo e){
        return this.data_devolucao.compareTo(e.data_devolucao);
    }
}
