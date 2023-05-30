
package br.edu.ifsul.bcc.too.topico3.exercicios;

import br.edu.ifsul.bcc.too.topico3.util.Carro;
import br.edu.ifsul.bcc.too.topico3.util.Pneu;
import br.edu.ifsul.bcc.too.topico3.Colecoes;
import java.util.ArrayList;
import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author telmo
 */


public class Exercicio7_professor {
        
    Exercicio7_professor(){
        
        exer71();// chama o método exer71.
       
        criarPneu();
        exer72();//chama o método exer72.
        
        
        exer73();
    }
    
    private void exer71(){
       
        /*
        7.1) Codifique uma classe chamada: Carro. Essa classe deve ter os seguintes atributos: nome, modelo, fabricante, numero do chassi  e valor de mercado. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes
             procedimentos: criar e inicializar cinco objetos da 
            classe Carro. 
           Adicione-os em uma lista da interface Map ordenada. Ao adicionar defina uma chave sequencial. Imprima na tela a listagem de carros.
    */
        SortedMap<String, Carro> map = new TreeMap();
        
        map.put("5" , new Carro("Gol","2007", "Volkswagen", "0001", 20000.0f));
        map.put("1" , new Carro("Corsa","2009", "Chevrolet", "0002", 25000.0f));
        map.put("2" , new Carro("Uno","2001", "Fiat", "0003", 16000.0f));
        map.put("4" , new Carro("Focus","2011", "Ford", "0004", 32000.0f));
        map.put("3" , new Carro("Sandero","2013", "Renault", "0005", 35000.0f));
        
        
        for (Map.Entry<String, Carro> m : map.entrySet()) {
        
            System.out.println("Código: " + m.getKey() + " Modelo - Ano: "+ m.getValue());    
        }         
        
      }    
    
    /*        
        7.2) Codifique uma classe chamada: Pneu. Essa classe deve ter os seguintes atributos: codigo, modelo, posição, medida, fabricante e valor. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos: criar e inicializar quatro objetos da classe Pneu. 
           Adicione-os em uma lista. Implemente um mescanismo para classificar os objetos contidos nessa lista pelo modelo (descendente).
           Imprima na tela dos Pneus.
    */
    
    private void criarPneu(){
        
        List<Pneu> list = new ArrayList();
        
        Pneu a = new Pneu(1, "Off-Road", "Frente", 12.0f, "Pirelli", 150.0f);
        list.add(a);
        
        Pneu b = new Pneu(2,"Esportivo", "Traseiro", 14.0f, "Michelin", 300.0f);
        list.add(b);
        
        Pneu c = new Pneu(3, "Simples", "Frente", 12.0f, "Dunlop", 100.0f);
        list.add(c);
        
        Pneu d = new Pneu(4, "Esportivo", "Frente", 12.0f, "Pirelli", 200.0f);
        list.add(d);
        
        Collections.sort(list);
        System.out.println(list);
    }
    
    private void exer72(){
              
    }
  
        
    /*        
        7.3) Altere a classe Carro incluindo um atributo para armazenar uma lista de Pneus. Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos:
             criar e inicializar três objetos do tipo Carro. Para cada objeto do tipo Carro, adicione outros 4 objetos do tipo Pneu. Imprima na tela a lista de Carros e os seus respectivos Pneus.        
    */
    
      private void exer73(){
          
      }
    

    public static void main(String[] args) {
        
         new Exercicio7_professor();
    }
    
}
