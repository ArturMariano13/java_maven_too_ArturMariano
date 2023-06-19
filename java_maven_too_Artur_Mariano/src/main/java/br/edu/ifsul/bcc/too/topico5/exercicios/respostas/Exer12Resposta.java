
package br.edu.ifsul.bcc.too.topico5.exercicios.respostas;

import br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama.Arma;
import br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama.Artefato;
import br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama.Jogador;
import br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama.Municao;
import br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama.Patente;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Exer12Resposta {
    
    /*
    11.1 Codificar no pacote br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama 
    o diagrama de classe sobre o estudo de caso: Counter Strike
    
    11.1.1 Criar uma rotina para adicionar objetos (dois) do tipo Jogador em uma 
    lista. Cada jogador deverá ter uma lista (2 objetos) de Arma e Municao e  
    duas patentes. Em seguida, imprima na saída padrão, os jogadores
    com seus respectivos artefatos e patentes.
    */
    
    Exer12Resposta(){
        
        exercicio12();
    }
    
    
    private void exercicio12(){
        
        Jogador j = new Jogador();
            j.setNickname("teste@");
            Arma arm1 = new Arma();
                arm1.setNome("Revolver");
            Municao mnc = new Municao();
                mnc.setNome("bala");
                
            Collection<Artefato> listA = new ArrayList();
            listA.add(arm1);
            listA.add(mnc);
            
            j.setArtefatos(listA);
                
            Patente p = new Patente();
                p.setId(1);
                p.setNome("Ouro");
            
            j.setPatente(p);
                
            Patente p2 = new Patente();
                p2.setId(2);
                p2.setNome("bronze");
                
            j.setPatente(p2);
                
            for(Patente pt : j.getPatentes()){
                
                System.out.println(pt);
            }
            
            for(Artefato ar : j.getArtefatos()){
                
                System.out.println(ar);
            }
               
    }
    
    public static void main(String args[]){
        
        new Exer12Resposta();
    }
}
