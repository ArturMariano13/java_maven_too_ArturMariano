package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Calendar;


public abstract class Pessoa implements Comparable<Pessoa>{
   
    /*campos da tabela --> atributos da instância*/
    private String cpf;
    private String rg;
    private String nome;
    private String endereco;
    private String cep;
    private Integer numero;
    private String telefone;
    private Calendar data_nascimento; // protegido para evitar erros e mudanças inesperadas
    private Calendar data_cadastro;
    private Integer idade; // privado para proteger a idade
    
    /*construtor padrão: protegido (visível apenas dentro do pacote) e sem parâmetros*/
    public Pessoa(){
        
    }
    
    /*polimofrismo: várias formas (ex.: outro construtor com mesmo nome, porém assinatura diferente)*/
    public Pessoa(String cpf,
            String rg,
            String nome,
            String endereco,
            String cep,
            Integer numero,
            String telefone,
            Calendar data_cadastro,
            Calendar data_nascimento){
        // apesar de ter o mesmo nome do construtor acima, a sua assinatura é diferente por possuir parâmetro
        
        this.cpf = cpf; // atribui-se o cpf local (parâmetro) ao cpf global (acessado pelo "this.")
        this.rg = rg;
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.telefone = telefone;
        this.data_cadastro = data_cadastro;
        this.data_nascimento = data_nascimento;
        
        int ano_nascimento = data_nascimento.get(Calendar.YEAR);
        int ano_atual = Calendar.getInstance().get(Calendar.YEAR);
        this.idade = ano_atual - ano_nascimento;
       
    }
    
    //get para retornar
    public Integer getIdade(){
        return this.idade;
    }
        
    public String getCpf(){
        return this.cpf;
    }
    
    public String getRg(){
        return this.rg;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getCep(){
        return this.cep;
    }
    
    public Integer getNumero(){
        return this.numero;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public Calendar getDataNascimento(){
        return this.data_nascimento;
    }
    
    public Calendar getDataCadastro(){
        return this.data_cadastro;
    }
    
    // set para alterar
    public void setDataNascimento(Calendar c){
        int ano_nascimento = data_nascimento.get(Calendar.YEAR);
        int ano_atual = Calendar.getInstance().get(Calendar.YEAR);
        this.idade = ano_atual - ano_nascimento;
         // EXERCÍCIO: calcular a idade da pessoa
    }
    
    @Override
    public int compareTo(Pessoa p) {
        return this.data_nascimento.compareTo(p.getDataNascimento());
    } 
    
    
}
