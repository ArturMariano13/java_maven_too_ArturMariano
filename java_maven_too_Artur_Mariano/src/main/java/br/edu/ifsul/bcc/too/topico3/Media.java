/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.bcc.too.topico3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Media {
        
    // EXERCÍCIO: Cálculo da média, recebendo dois valores inteiros por parâmetros
    
    // Método especial: construtor da classe Teste
    // O nome do método construtor deve ser o mesmo da classe
    // É possível ter mais do que um método construtor na mesma classe
    // Contudo, devem ter assinaturas diferentes
    
    public Media(){
        Float v1 = Float.parseFloat(recebeValorGUI());
        Float v2 = Float.parseFloat(recebeValorGUI());
        Float e = funcaoMedia(v1, v2);
        System.out.println("Media: " + e);
    }
    

    
    //definicao de um metodo (funcao) em java
    //assinatura do metodo: retorno, nome e parametros
    public float funcaoMedia(float v1, float v2){
        
        return (v1 + v2) / 2.0f;        
    }
    
    
    public Float funcaoMedia(Float v1, Float v2){
        
        Float resultado = v1 + v2;
        resultado = resultado / 2f;
        
        return resultado;
       //Float com letra maiuscula trabalha com valores por referencia, é derivado
    }
    
    public String recebeValorGUI()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        String x = sc.nextLine();
        return x;
    }
    //Acima foi somente a chamada dos métodos, não serão executados se não forem chamados no programa
    
    //metodo main: método especial (primeiro a ser executado)
    public static void main(String args[]){
        
        //Criação de variável --> OBJETO
        // Nesse caso, o tipo da variável t é Teste.
        //O objeto t está sendo inicializado com uma nova instância da classe Teste.
        Media t = new Media();
        
        // Chamada do métodoo funcaoMedia através do objeto t.
        //O retorno do método é armazanado na variável resultado.        
        // float r = funcaoMedia(10f, 15f); --> não se pode acessar dessa maneira
        
        System.out.println("Chamou a main");
        
        // Para concatenar, basta utilizar o "+"
        
        
        //System.out.println(resultado);
         
    }
}

// IMPLEMENTAÇÃO TANTO COM TUDO PELA MAIN, QUANTO POR MÉTODOS FORA DELA
