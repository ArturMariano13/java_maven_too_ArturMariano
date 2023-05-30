/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.bcc.too.topico3.exercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MediaTratamentoExcecoesScan {
        
    // EXERCÍCIO: Cálculo da média, recebendo dois valores inteiros por parâmetros
    
    // Método especial: construtor da classe Teste
    // O nome do método construtor deve ser o mesmo da classe
    // É possível ter mais do que um método construtor na mesma classe
    // Contudo, devem ter assinaturas diferentes
    
    public MediaTratamentoExcecoesScan(){
        int a = 0;
        Float v1 = recebeValorGUI();
        Float v2 = recebeValorGUI();
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
    
    public Float recebeValorGUI()
    {
        Scanner sc = new Scanner(System.in);
        String x = null; //NECESSITA INICIALIZAR A VARIÁVEL x STRING
        float valor = 0f; 
        boolean erro = false;
        
        do{
        try{
        System.out.println("Informe o valor: ");
        x = sc.nextLine();
        valor = Float.parseFloat(x);
        erro = false;
        }
        catch (NumberFormatException e){
            erro = true;
            System.out.println("Erro! INSIRA OUTRO VALOR!");
            
            e.printStackTrace();
        }
        }while(erro);
        return valor;
    }
    //Acima foi somente a chamada dos métodos, não serão executados se não forem chamados no programa
    
    //metodo main: método especial (primeiro a ser executado)
    public static void main(String args[]){
        
        MediaTratamentoExcecoesScan t = new MediaTratamentoExcecoesScan();
        System.out.println("Chamou a main");       
    }
}
// IMPLEMENTAÇÃO DA CLASSE MÉDIA COM TRATAMENTO DE EXCEÇÕES
