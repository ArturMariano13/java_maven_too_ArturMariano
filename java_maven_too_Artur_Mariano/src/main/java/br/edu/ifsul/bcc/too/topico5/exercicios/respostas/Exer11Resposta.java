
package br.edu.ifsul.bcc.too.topico5.exercicios.respostas;

import br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_biblioteca.classes.Aluno;
import br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_biblioteca.classes.Emprestimo;
import br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_biblioteca.classes.Exemplar;
import br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_biblioteca.classes.Funcionario;
import br.edu.ifsul.bcc.too.topico5.exercicios.estudocaso_biblioteca.classes.Pessoa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author telmo
 */
public class Exer11Resposta {
    
       /*
    Exercício 11.1: criar um método que retorne uma coleção de Pessoas.       
    Essa coleção deve ter 3 Alunos e 2 Funcionarios.
    No construtor da classe Biblioteca chame o método criado anteriormente e
    imprima na saída padrão todas as Pessoas, ordenadas pela
    Data de nascimento (ordem desc).
    Dica: implementar o implements Comparable<Pessoa> e sobrescrever o método
    compareTo em Pessoa. 
    */
    private Collection<Pessoa> exercicio11_1(){  
        
        List<Pessoa> listagem = new ArrayList();        
        //adicionar 3 alunos e 2 funcionarios.
        Aluno a1 = new Aluno("123", null, null, null, null, 0, null, null, Calendar.getInstance(), "123");                    
            Calendar c = Calendar.getInstance();
            c.set(Calendar.YEAR, 1999);
            a1.setDataNascimento(c);
            
        Aluno a2 = new Aluno("4123", null, null, null, null, 0, null, null, Calendar.getInstance(), "4123");
            c = Calendar.getInstance();
            c.set(Calendar.YEAR, 1990);
            a2.setDataNascimento(c);
            
        Aluno a3 = new Aluno("789", null, null, null, null, 0, null, null, Calendar.getInstance(), "789");
            c = Calendar.getInstance();
            c.set(Calendar.YEAR, 1983);
            a3.setDataNascimento(c);
        
        Funcionario f1 = new Funcionario("123456");
            c = Calendar.getInstance();
            c.set(Calendar.YEAR, 2022);
            f1.setDataNascimento(c);
            
        Funcionario f2 = new Funcionario("123456");
            c = Calendar.getInstance();
            c.set(Calendar.YEAR, 2021);
            f2.setDataNascimento(c);
            
        Funcionario f3 = new Funcionario("123456");
            c = Calendar.getInstance();
            c.set(Calendar.YEAR, 2020);
            f3.setDataNascimento(c);
        
        listagem.add(a1);
        listagem.add(a2);
        listagem.add(a3);
        listagem.add(f1);
        listagem.add(f2);
        listagem.add(f3);
        
        Collections.sort(listagem);//classifica por data de nascimento (testar se vai classificar por odem asc ou desc.)
        
        return listagem;
    }
    
     /*
        Exercício 11.2: resolver o problema de sintaxe "new Pessoa()", criando
        um construtor na classe Aluno, que receba os parâmetros(String cpf, 
        String rg, String nome, String logradouro, String cep, Integer numero,
        String telefone,Calendar data_cadastro, Calendar data_nascimento e matricula)
        Os primeiros 9 parâmetros deverão ser encaminhados para o construtor
        de Pessoa, utilizando o comando super(cpf, rg, ...).
        O décimo parâmetro deverá ser atribuido para o atributo da instância.
    */    
    /*
        Exercício 11.3: criar um método que retorne uma coleção de Empréstimo. Esse método deverá
        receber por parâmetro uma lista de Funcionario, Aluno e Exemplar. Cada elemento recebido
        por parâmetro deverá ser vinculado a um Empréstimo.   
    */
    private Collection<Emprestimo> questao3(List<Funcionario> listFunc, List<Aluno> listAluno, List<Exemplar> listExemp){
        
        Collection<Emprestimo> listRetorno = new ArrayList();
        int i=0;
        for(Exemplar e : listExemp){
            
            Emprestimo emp = new Emprestimo();
          
            //emp.setId(i);
            emp.setExemplar(listExemp.get(i));
            emp.setAluno(listAluno.get(i));
            emp.setFuncionario(listFunc.get(i));
            emp.setData(Calendar.getInstance());
            emp.setSituacao(Boolean.TRUE);
            
            i++;
            
            listRetorno.add(emp);
        }
       
                
        return listRetorno;
    }
    
    
    
    /*
        Exercicio 11.4: testar o método criado na questão 3 (chamar e imprimir o retorno).
    */
    
    
    
    /*
        Exercicio 11.5: 
        Implementar o relacionamento de agregação por composição. 
        Criar a classe Parcelamento, a enum Situacao.
        Criar um método que receba por pârametro um Funcionario, Aluno e Exemplar
        e um inteiro para representar a quantidade de parcelas.
    
        Definir através de constantes as demais informações.
        
        Calcule o valor do emprestimo em X vezes e adicione na lista de parcelamento.
        Esse método deverá retornar uma instância de Emprestimo.
        
    */
    
    /*
        Exercicio 11.6: testar o método criado na questão 5 (chamar e imprimir o retorno).
    */

    public Exer11Resposta() {
    
        Collection<Pessoa> ret = new ArrayList();
        ret = exercicio11_1();
        
        //questao 11.1
        
        for(Pessoa pes : ret){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            System.out.println("Pessoa: "+sdf.format(pes.getDataNascimento().getTime()));
        }
        
        //questao 11.2.
        /*definir/setar/guardar valores para os demais atributos do objeto p*/
        /*alternativa 1 : atraves do construtor*/
        
        Aluno p = new Aluno("abc123", "00123", 
                              "123",
                              "fulano",
                              "rua das flores",
                              123,
                              "99010000",
                              Calendar.getInstance(),
                              Calendar.getInstance(),
                              "5430130000"
        );        
        System.out.println("Nome: "+p.getNome()+" CPF: "+p.getCpf());
        
        p.setDataNascimento(Calendar.getInstance());        
        //p.idade = 22;        
        System.out.println("Idade da pessoa: "+p.getIdade());
        
        
        //questao 11.4
        
        System.out.println("Questão 11.4::");
        
        Exemplar exm = new Exemplar();
            exm.setId(1);
        List<Exemplar> listE = new ArrayList();
            listE.add(exm);
            
        Aluno a = new Aluno();
            a.setNome("aluno teste");
        List<Aluno> listA = new ArrayList();
            listA.add(a);
       
        Funcionario f = new Funcionario("123");
            f.setNome("teste funcionario");
        List<Funcionario> listF = new ArrayList();
            listF.add(f);
            
        
        Collection<Emprestimo> retorno =  questao3(listF, listA, listE);
        
        System.out.println(retorno);
    
    }

    
      /* métod estático*/
    public static void main(String args[]){
       
        new Exer11Resposta();
        //https://plantuml.com/ie-diagram
    }
}
