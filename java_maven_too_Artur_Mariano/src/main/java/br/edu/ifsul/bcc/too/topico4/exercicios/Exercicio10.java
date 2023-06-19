
package br.edu.ifsul.bcc.too.topico4.exercicios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.edu.ifsul.bcc.too.topico4.exercicios.util.Cliente;
import br.edu.ifsul.bcc.too.topico4.exercicios.util.ClientePessoaFisica;
import br.edu.ifsul.bcc.too.topico4.exercicios.util.ClientePessoaJuridica;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author telmo
 */
public class Exercicio10 {
    
    
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
    
    Exercicio10(){
        exercicio10_3();     
        
    }
    
    private void exercicio10_3(){
        List<Cliente> lista = new ArrayList();
        
        ClientePessoaFisica pf = new ClientePessoaFisica();
        pf.setCpf("00000000000");
        pf.setEndereco("Rua 1");
        pf.setNome("Artur");
        pf.setBairro("Bairro 1");
        Date data_util_date = new java.util.Date();
        pf.setNascimento(data_util_date);
        pf.setTelefone("123");
        pf.setUltimaCompra(data_util_date);
        
        lista.add(pf);
        
        pf = new ClientePessoaFisica();
        pf.setCpf("11111111111");
        pf.setEndereco("Rua 2");
        pf.setNome("João");
        pf.setBairro("Bairro 2");
        pf.setNascimento(data_util_date);
        pf.setTelefone("12345");
        pf.setUltimaCompra(data_util_date);
        
        lista.add(pf);
        
        ClientePessoaJuridica pj = new ClientePessoaJuridica();
        pj.setCnpj("2222222222222");
        pj.setEndereco("Rua 3");
        pj.setNomeFantasia("AaSul");
        pj.setBairro("Bairro 2");
        pj.setRazaoSocial("Alcoólicos Anônimos do Sul");
        pj.setTelefone("12345");
        pj.setUltimaCompra(data_util_date);
        
        lista.add(pj);
        
        pj = new ClientePessoaJuridica();
        pj.setCnpj("333333333333333");
        pj.setEndereco("Rua 4");
        pj.setNomeFantasia("BBB");
        pj.setBairro("Bairro 3");
        pj.setRazaoSocial("Big Brother Brasil");
        pj.setTelefone("123456789");
        pj.setUltimaCompra(data_util_date);
        
        lista.add(pj);
        
        for (Cliente c : lista){
            if (c instanceof ClientePessoaFisica){
                System.out.println("- Nome: " + ((ClientePessoaFisica) c).getNome() + " (Pessoa Fisica)");
            }
            else if (c instanceof ClientePessoaJuridica){
                System.out.println("- Nome fantasia: " + ((ClientePessoaJuridica) c).getNomeFantasia() + " (Pessoa Juridica)");
            }
        }
        
    }
    
    public static void main(String args[]){
        
        
        new Exercicio10();
    }
            
}
