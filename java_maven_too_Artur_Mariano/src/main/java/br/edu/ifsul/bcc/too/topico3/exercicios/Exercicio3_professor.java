
package br.edu.ifsul.bcc.too.topico3.exercicios;
import javax.swing.JOptionPane;

/**
 * @author Telmo Júnior
 */
public class Exercicio3_professor {
    
    public static void main(String[] args) {

        int[][] rgDados1 = new int[2][3];//linha e coluna - se a quantidade de coluna da primeira

        int[][] rgDados2 = new int[3][2];//for igual a quantidade de linhas da segunda.

        int[][] rgDados3 = new int[2][2];

        /*
            1) Com base nos métodos da classe JOptionPane obtenha informações do console e inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para multiplicar os dados das matrizes (rgDados1 e rgDados2) e armazene em rgDados3. Por fim imprima no console os dados gerados (rgDados3).

               Documentação: https://www.devmedia.com.br/introducao-a-interface-gui-no-java/25646
                             https://brasilescola.uol.com.br/matematica/multiplicacao-matrizes.htm
        */
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
                                
                String d = JOptionPane.showInputDialog(null, "MAT1: Informe um valor inteiro:", "Informe", JOptionPane.PLAIN_MESSAGE);
                                
                rgDados1[linha][coluna] = Integer.parseInt(d);
                                
            }                        
        } 
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
                                
                String d = JOptionPane.showInputDialog(null, "MAT2: Informe um valor inteiro:", "Informe", JOptionPane.PLAIN_MESSAGE);
                                
                rgDados2[linha][coluna] = Integer.parseInt(d);
                                
            }                        
        } 
        //int guardacol;
        //int guardalin;
        
        for (int linha = 0; linha < 2; linha++){
            
            for (int coluna = 0; coluna < 2; coluna++){
                
                int soma = 0;                
                for (int l = 0; l < 3; l++){
                
                    soma += rgDados1[linha][l] * rgDados2[l][coluna];
                }
                rgDados3[linha][coluna] = soma;
                
            }
        }
           System.out.println("MULTIPLICAÇÃO MAT1 E MAT2:");
           
        for (int linha=0; linha < rgDados3.length; linha++){
            
            for(int coluna=0; coluna < rgDados3[linha].length; coluna++){
                                
                System.out.printf(rgDados3[linha][coluna] + " ");
                                
            }      
            System.out.println(" ");
        } 
}
}
    

