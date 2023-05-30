package br.edu.ifsul.bcc.too.topico3.exercicios;

/**
 *
 * @author Prof. Telmo Júnior
 */


import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Exercicio1_professor {        
    
    public static void main(String[] args) {
        
        int[][] rgDados1 = new int[3][3];
    
        int[][] rgDados2 = new int[3][3];
        
        int[][] rgDados3 = new int[3][3];
    
        /*
            1) Com base no método hasNext da classe Scanner obtenha informações do console e inicializar as matrizes rgDados 1 e rgDados2.
               Em seguida finalize a rotina para somar os dados das matrizes (rgDados1 e rgDados2) e armazene em rgDados3. Por fim imprima no console os dados gerados (rgDados3).
        
               Documentação: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
        */
        
        Scanner sc = new Scanner(System.in);
        
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
                
                System.out.println("Mat1[" + linha + "][" + coluna + "]: ");
                if(sc.hasNext()){
                    rgDados1[linha][coluna] = parseInt(sc.next());
                }                
            }                        
        }      
        
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
                
                System.out.println("Mat2[" + linha + "][" + coluna + "]: ");
                if(sc.hasNext()){
                    rgDados2[linha][coluna] = parseInt(sc.next());
                }                
            }                        
        }      

        for (int linha=0; linha < rgDados3.length; linha++){
            
            for(int coluna=0; coluna < rgDados3[linha].length; coluna++){
                rgDados3[linha][coluna] = rgDados1[linha][coluna] + rgDados2[linha][coluna];
                }                
            }                              
        
        System.out.println("MATRIZ 3");
        for (int linha=0; linha < rgDados3.length; linha++){
            
            for(int coluna=0; coluna < rgDados3[linha].length; coluna++){
                    System.out.print(rgDados3[linha][coluna] + "  ");   
                }                
            System.out.print("\n");
            }                        
        }     
    }
    
