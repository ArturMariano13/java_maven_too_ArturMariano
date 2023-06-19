
package br.edu.ifsul.bcc.too.topico4.exercicios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Exercicio9 {
    
    private List<PessoaEncapsulada>  lista = new ArrayList();
    
    public Exercicio9(){
        exercicio9_4();
        
    }
    
    private void exercicio9_4(){
        
        PessoaEncapsulada pe = new PessoaEncapsulada();
        pe.setCpf("00000000000");
        pe.setNome("Artur");
        Calendar c = Calendar.getInstance();
        c.set(2004, 02, 13);
        pe.setDataNascimento(c);
        lista.add(pe);
        
        pe = new PessoaEncapsulada();
        pe.setCpf("11111111111");
        pe.setNome("Gisele");
        c.set(1975, 8, 23);
        pe.setDataNascimento(c);
        lista.add(pe);
        
        pe = new PessoaEncapsulada();
        pe.setCpf("22222222222");
        pe.setNome("Maurício");
        c.set(1973, 8, 13);
        pe.setDataNascimento(c);
        lista.add(pe);
        
        
        pe = new PessoaEncapsulada();
        pe.setCpf("33333333333");
        pe.setNome("Cailane");
        c.set(2003, 6, 2);
        pe.setDataNascimento(c);
        lista.add(pe);
        
        pe = new PessoaEncapsulada();
        pe.setCpf("44444444444");
        pe.setNome("Júlia");
        c.set(2013, 0, 5);
        pe.setDataNascimento(c);
        lista.add(pe);
        
        pe = new PessoaEncapsulada();
        pe.setCpf("55555555555");
        pe.setNome("Marcos");
        c.set(1984, 1, 4);
        pe.setDataNascimento(c);
        lista.add(pe);
        
        for (PessoaEncapsulada p : lista){
            System.out.println(p);
        }
    }
    
    public static void main(String[] args) {
        new Exercicio9();
    }
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
    
}
