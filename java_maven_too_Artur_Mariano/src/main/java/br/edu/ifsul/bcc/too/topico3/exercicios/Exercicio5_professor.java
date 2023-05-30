
package br.edu.ifsul.bcc.too.topico3.exercicios;

/**
 *
 * @author telmo
 */
public class Exercicio5_professor {
    
    static String strDados = "A classe String é utilizada por toda a API do Java "
            + "e por diversas vezes precisaremos dela em nossos códigos. Isso faz "
            + "com que o domínio dessa classe seja fundamental para todo aquele que "
            + "deseja se tornar um programador Java. Aqui neste artigo falaremos sobre "
            + "as principais características dessa classe com exemplos de código e comentários.";
    
    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma 
           rotina para utilizar os métodos da classe java.lang.String utilizando a 
           variável estática strDados:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim, compareto.
    
    */
    
    //constutor da classe.
    public Exercicio5_professor(){
              System.out.println("executou o construtor da classe");
    }
    
    private void manipulaString(){//metodo da classe
        
        System.out.println("1 - Método CONCAT: ");
        String strconcat = "\t<<".concat(strDados); //PARÁGRAFO E CONCATENAÇÃO ANTES 
               strconcat = strconcat.concat(">>"); //CONCATENAÇÃO DEPOIS DA FRASE
        System.out.println(strconcat);
        
        System.out.println("\n2 - Método STRING.VALUEOF: ");
        int x = 123456789;
                System.out.println(String.valueOf(x));
                
        System.out.println("\n3 - Métodos STARTSWITH / ENDSWITH: ");
        if (strDados.startsWith("A"))
        {
            System.out.println("INICIA COM 'A'!");
        }
        if (!strDados.endsWith("a"))
        {
            System.out.println("NÃO TERMINA COM 'a'!");
        }
        
        System.out.println("\n4 - Método INDEXOF");
        String a = "artur";
        System.out.printf("Primeiro 'r' da palavra: %d", a.indexOf('r'));
        
            System.out.println("\n5 - Método SUBSTRING");
        String b = "banana";
             
        
        
    }
    
    public static void main(String args[]){//metodo main
        
        Exercicio5_professor e5 = new Exercicio5_professor();//objeto da classe
        e5.manipulaString();//chamada do metodo a partir do objeto.
        
    } 
    
}
