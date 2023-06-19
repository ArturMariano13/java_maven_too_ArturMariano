
package br.edu.ifsul.bcc.too.topico4.exercicios.respostas;

import java.util.Calendar;

/**
 *
 * @author telmo
 */

/*   
9. Utilizando o conceito de encapsulamento, crie métodos públicos na classe br.edu.ifsul.bcc.too.topico4.PessoaEncapsulada
   para disponibilizar o acesso aos atributos da instância: corOlhos, corCabelo, dataNascimento, altura.    
*/

/*
9.1 Utilizando o conceito de encapsulamento, crie um novo atributo de instância na classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada.
Esse atributo irá manter a informação da idade. A informação da idade deve ser gerada automaticamente pelo
método setDataNascimento(). Sendo assim, disponibilize o acesso a esse atributo através do método getIdade(). 
O método setIdade() não deve ser codificado, já que a idade será gerada automaticamente.

*/

/*
9.2 Utilizando o conceito de polimorfismo/sobrecarga, codifique um novo construtor para a classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada.
    Esse método deverá ter uma assinatura que possibilite receber por parâmetro dados para os atributos: cpf, nome, corOlhos, corCabelo, dataNascimento, altura;

*/

/*
9.3 Utilizando o conceito de polimorfismo/sobreposicao, reescreva o método toString() na classe br.edu.ifsul.bcc.too.base.topico4.PessoaEncapsulada.
Esse método deverá retornar uma string no formato: " CPF: <cpf> - Nome: <nome> Idade: <idade>";    
*/

/*
9.4 Codifique e execute um método na classe Exercicio9 para criar cinco instâncias de PessoaEncapsulada. Em seguida adicione-as em uma lista e imprime-as na saída padrão os dados de cada aluno no formato " CPF: <cpf> - Nome: <nome> Idade: <idade>"
*/

//classe é uma especificação para um objeto. 
//Classe ou tipo, permite especificar o formato dos objetos que poderão ser criados futuramente. (variáveis do tipo da classe).
//Ou seja, classe é como se fosse um molde para objetos. 
//instância de uma classe é equivalente a objeto da classe.

public class PessoaEncapsulada {
    
    /* atributos de instância ou de objeto: definem o estado do objeto em um determinado instante.*/
    private String cpf;//atributos privados e métodos públicos é uma forma de encapsulamento.
    private String nome;
    private String corOlhos;
    private String corCabelo;
    private Calendar dataNascimento;
    private Float altura;   
    private Integer idade;
    
    /*
      Acessibilidade: permite implementar o encapsulamento. Ou seja, encapsular (ocultar) a complexidade (código) 
      que não é relevante para o restante da implementação e disponibilizar o que é revelante. 
    
      private: visível apenas dentro da classe.
      protected: visível apenas dentro do pacote.
      public: totalmente visível. 
    */
    
    //construtor padrão da classe: protegido e sem parâmetros.
    protected PessoaEncapsulada(){
        
        //esse método será executado na criação da instância.
    }
    
    //https://www.devmedia.com.br/sobrecarga-e-sobreposicao-de-metodos-em-orientacao-a-objetos/33066
    //polimorfismo: possibilita a reutilização de codigo fonte, uma vez que um objeto pode assumir várias formas.
    //Existem dois tipos de polimorfismo: sobrecarga (orverload) e sobreposição (override).
    
    //Sobrecarga: permite a existencia de mais de um método com o mesmo nome, porém, 
    //com assinatura diferente (quantidade e tipo de argumentos/parâmetros)
    protected PessoaEncapsulada (String cpf, String nome, String corOlhos, String corCabelo, Calendar dataNascimento, Float altura){
        
        this.cpf = cpf;
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.dataNascimento = dataNascimento;
        this.altura = altura; 
        
        Calendar data_atual = Calendar.getInstance();
        
        this.idade = data_atual.get(Calendar.YEAR)  - dataNascimento.get(Calendar.YEAR);
        
    }
    
    //Sobreposição: permite reescrever um método em uma subclasse que possua comportamento diferente
    //do método de mesma assinatura na superclasse.
    @Override
    public String toString(){
        
        // CPF: <cpf> - Nome: <nome> Idade: <idade>
        
        return "CPF: "+this.getCpf()+" - Nome:"+this.getNome();
    }
    
    //encapsulamento: restringe o acesso ao atributo da instância e libera o acesso vai método público.
    //dessa forma é possível controlar o que será retornado.

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the corOlhos
     */
    public String getCorOlhos() {
        return corOlhos;
    }

    /**
     * @param corOlhos the corOlhos to set
     */
    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    /**
     * @return the corCabelo
     */
    public String getCorCabelo() {
        return corCabelo;
    }

    /**
     * @param corCabelo the corCabelo to set
     */
    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    /**
     * @return the dataNascimento
     */
    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
        
        Calendar data_atual = Calendar.getInstance();
        
        this.idade = data_atual.get(Calendar.YEAR)  - dataNascimento.get(Calendar.YEAR);
    }
    
    public Integer getIdade(){
        
        return this.idade;
    }

    /**
     * @return the altura
     */
    public Float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Float altura) {
        this.altura = altura;
    }
 
    
    
    
}
