package br.edu.ifsul.bcc.too.topico3.exercicios;

import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class MediaInterfaceOptionPane {
        
    public MediaInterfaceOptionPane(){
    
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
        
        MediaInterfaceOptionPane t = new MediaInterfaceOptionPane();
        
        String x = JOptionPane.showInputDialog("Insira um número: ");
        String y = JOptionPane.showInputDialog("Insira outro número: ");
        
        // Outra forma: 
        // float x = Float.parseFloat(JOptionPane.showInputDialog("Insira um número: "));
        
        float a = Float.valueOf(x).floatValue();
        float b = Float.valueOf(y).floatValue();
        
        float resultado = t.funcaoMedia(a, b);
                
        System.out.println("Chamou a main");
        
        System.out.println("Media: " + resultado);
    }
}
