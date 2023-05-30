
package br.edu.ifsul.bcc.too.topico3.exercicios;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author Prof. Telmo Júnior
 */
public class Exercicio2_professor {
    
    static  int[][] rgDados1 = new int[3][3];
    
    static  int[][] rgDados2 = new int[3][3];
        
    static  int[][] rgDados3 = new int[3][3];
    
    static String x = null;
    
    static boolean erro = false;
    
    public static void main(String[] args) {
        
        /*
            1) Com base no código fonte produzido no exercicio 1, 
        implemente um tratamento de exceção para tratar possível erro na conversão de 
               string para integer no comando "Integer.parseInt(sc.next())".
        
               Documentação: https://www.devmedia.com.br/blocos-try-catch/7339
        */
        
        for (int linha=0; linha < rgDados1.length; linha++){

             for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
              
                do{
                    try{
                        x = JOptionPane.showInputDialog("Mat1[" + linha + "][" + coluna + "]: ");
                        rgDados1[linha][coluna] = Integer.parseInt(x);
                        erro = false;
                    }
                    catch(NumberFormatException e){
                        erro = true;
                        JOptionPane.showMessageDialog(null, "ERRO! INSIRA OUTRO VALOR!");
                    }
                }while (erro);
                }                
            }                              
        
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
                
                do{
                    try{
                        x = JOptionPane.showInputDialog("Mat2[" + linha + "][" + coluna + "]: ");
                        rgDados2[linha][coluna] = Integer.parseInt(x);
                        erro = false;
                    }
                    catch(NumberFormatException e){
                        erro = true;
                        JOptionPane.showMessageDialog(null, "ERRO! INSIRA OUTRO VALOR!");
                    }
                }while (erro);
            }                        
        }      

        for (int linha=0; linha < rgDados3.length; linha++){
            
            for(int coluna=0; coluna < rgDados3[linha].length; coluna++){
                rgDados3[linha][coluna] = rgDados1[linha][coluna] + rgDados2[linha][coluna];
                }                
            }                              
        
        System.out.println("MATRIZ 3:");
        for (int linha=0; linha < rgDados3.length; linha++){
            
            for(int coluna=0; coluna < rgDados3[linha].length; coluna++){
                    System.out.print(rgDados3[linha][coluna] + "  ");   
                }                
            System.out.print("\n");
            }                        
        }     

}                        
        
