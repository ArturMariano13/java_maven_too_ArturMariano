package br.edu.ifsul.bcc.too.topico3.exercicios;

import java.util.Scanner;
// IMPORTAÇÃO DA BIBLIOTECA PARA INTERFACE

/**
 *
 * @author Usuario
 */

public class MediaInterfaceScanner {
        
    public MediaInterfaceScanner(){
    
}
    public float funcaoMedia(float v1, float v2){
        
        return (v1 + v2) / 2.0f;
    }
    
    public Float funcaoMedia(Float v1, Float v2){
        
        Float resultado = v1 + v2;
        resultado = resultado / 2f;
        
        return resultado;
    }
    
    public static void main(String args[]){
        
        MediaInterfaceScanner t = new MediaInterfaceScanner();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        String x = sc.nextLine();
        
        System.out.println("Informe outro valor: ");
        String y = sc.nextLine();
        
        float a = Float.valueOf(x).floatValue();
        float b = Float.valueOf(y).floatValue();
        
        float resultado = t.funcaoMedia(a, b);
        
        System.out.println("Media de " + x + " e " + y + " = " + resultado);
    }
}
