
package br.edu.ifsul.bcc.too.topico4.exercicios.respostas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author telmo junior
 */
public class Exer9Resposta {
    
    /*
    9.4 Codifique e execute um método na classe Exercicio9 para criar cinco instâncias de PessoaEncapsulada. Em seguida adicione-as em uma lista e imprime-as na saída padrão os dados de cada aluno no formato " CPF: <cpf> - Nome: <nome> Idade: <idade>"
    */
    
    private List<PessoaEncapsulada>  list = new ArrayList();
    
    protected Exer9Resposta(){
        
        exercicio94();
        
    }
    
    private void exercicio94(){
        
        PessoaEncapsulada p1 = new PessoaEncapsulada();
        p1.setCpf("00001359070");
        p1.setNome("Fulano de Tal");
        Calendar dt = Calendar.getInstance();
        dt.set(Calendar.YEAR, 1983);
        p1.setDataNascimento(dt);
        
        list.add(p1);
        
        p1 = new PessoaEncapsulada();
        p1.setCpf("00001359077");
        p1.setNome("Siglano de Tal");

        
        list.add(p1);
        
        for(PessoaEncapsulada p : list){
            
            System.out.println(p);
            System.out.println("\tIdade: "+p.getIdade());
        }
        
    }
    
    public static void main(String args[]){
        
        new Exer9Resposta();
    }
    
    
}
