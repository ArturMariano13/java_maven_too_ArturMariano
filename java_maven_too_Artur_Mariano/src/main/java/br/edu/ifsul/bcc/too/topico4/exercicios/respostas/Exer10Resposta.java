
package br.edu.ifsul.bcc.too.topico4.exercicios.respostas;

import br.edu.ifsul.bcc.too.topico4.exercicios.respostas.util.ClientePessoaFisica;
import br.edu.ifsul.bcc.too.topico4.exercicios.respostas.util.ClientePessoaJuridica;
import br.edu.ifsul.bcc.too.topico4.exercicios.respostas.util.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Exer10Resposta {
    
    Exer10Resposta(){
        
        exercicio10_3();
    }
    
    /*
        10. Implemente no pacote br.edu.ifsul.bcc.too.base.topico4.exercicios.util o diagrama localizado no diretorio
        src/main/resources/imagens/diagrama_heranca_cliente.jpg. Sendo assim, crie as classes: Cliente, ClientePessoaFisica e ClientePessoaJuridica.
        Na classe Cliente defina os atributos protegidos: endereco, bairro, telefone, ultimaCompra.
        Na classe ClientePessoaFisica defina os atributos privados: cpf, nome e nascimento.
        Por fim, na classe ClientePessoaJuridica defina os atributos privados: cnpj, nomeFantasia e razaoSocial.    
    */
    
    /*
        10.1 Implemente a herança conforme o diagrama. Portanto, ClientePessoaFisica deverá herdar de Cliente. Ex:
                ...
                    public class ClientePessoaFisica extends Cliente {
                ... 
    
            ClientePessoaJuridica também deverá herdar de Cliente, ex: 
                ...
                    public class ClientePessoaJuridica extends Cliente {
    */
    
    /*
    
        10.2 Encapsule os atributos das classes Cliente, ClientePessoaFisica e ClientePessoaJuridica
    */
    
    /*
        10.3 Codifique e execute um método na classe Exercicio10 para criar duas instâncias de ClientePessoaFisica e duas de ClientePessoaJuridica.
             Essas 4 instâncias deverão conter dados e ser adicionadas em uma lista de Cliente. Em seguida imprime-as na saída padrão os seus dados e a indicação do tipo da instância. ex:
                
                - Nome         : Fulano     (Pessoa Fisica)
                - Nome fantasia: Bar do Zé (Pessoa Juridica)
    
    */
    
    private void exercicio10_3(){
        
        List<Cliente> listaClientes = new ArrayList();
    
        ClientePessoaFisica clientePF;
            clientePF = new ClientePessoaFisica();
                clientePF.setEndereco("rua das camelias");
                clientePF.setNome("Zezinho");
            
        listaClientes.add(clientePF);        
            
        ClientePessoaJuridica clientePJ;
            clientePJ = new ClientePessoaJuridica();
            clientePJ.setNomeFantasia("Bar do Zé");
            
        listaClientes.add(clientePJ);    
            
        
        for(Cliente c : listaClientes){
            
            if(c instanceof ClientePessoaFisica){
                //    - Nome         : Fulano     (Pessoa Fisica)
                System.out.println("Nome: "+((ClientePessoaFisica) c).getNome() + " (Pessoa Fisica)");
                
            }else if(c instanceof ClientePessoaJuridica){
                
                // - Nome fantasia: Bar do Zé (Pessoa Juridica)
                System.out.println("Nome fantasia: "+((ClientePessoaJuridica) c).getNomeFantasia() + " (Pessoa Jurídica)" );
            }
        }
        
    }
    
    public static void main(String args[]){
        
        new Exer10Resposta();
    }
            
            
    
}
