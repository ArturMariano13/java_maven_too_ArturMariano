package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca;

import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Pessoa;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Aluno;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Funcionario;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Emprestimo;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Exemplar;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Parcelamento;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Biblioteca {
        
    // construtor padrão: protegido e sem parâmetros
    
    /* 
        Exercício 1: criar um método que retorne uma coleção de Pessoas.
        Essa coleção deve ter 3 alunos e 2 funcionarios
        No construtor da classe Biblioteca chame o método criado anteriormente e imprima
        na saída padrão todas as Pessoas, ordenadas pela data de nascimento.
        Dica: implementar o implements Comparable<Pessoa> e sobrescrever o método compareTo em Pessoa.

        Exercício 2: resolver o problema de sintaxe "new Pessoa()", criando um construtor na classe Aluno, que receba
        os parâmetros(String cpf, String rg, String nome... e matricula). Os primeiros 9 parâmetros deverão ser encaminhados
        para o construtor de Pessoa, utilizando o comando "super".
        O décimo parâmetro deverá ser atribuído para o atributo da instância.
    
        Exercício 3: criar um método que retorne uma coleção de Empréstimo. Esse método deverá receber por 
        parâmetro uma lista de Funcionario, Aluno e Exemplar. Cada elemento recebido por parâmetro deverá
        ser vinculado a um Emprestimo.
    
        Exercício 4: testar o método da questão 3.
    
        Exercício 5: criar um método que receba por pârametro um Funcionario, Aluno e Exemplar.
        Defina através de constantes as demais informações.
        Calcule o valor do emprestimo em cinco vezes e adicione na lista de parcelamento.
        Esse método deverá retornar uma instância de Emprestimo.
    
        Exercício 6: testar o método criado na questão 5 (chamar e imprimir o retorno).
    
    */
    
    Biblioteca(){
        Collection<Pessoa> lista = exer1();
        int i = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\nEXERCÍCIO 1 - PESSOAS");
        for (Pessoa p : lista){
            i++;
            System.out.println("Pessoa " + i + ": " + p.getNome() + " | " + sdf.format(p.getDataNascimento().getTime()));
        }
        //System.out.println(lista);
        List<Exemplar> listaExemplar = new ArrayList();
        Exemplar ex1 = new Exemplar(1, 
                                    true);
        Exemplar ex2 = new Exemplar(2, 
                                    false);
        
        listaExemplar.add(ex1);
        listaExemplar.add(ex2);
        
        List<Funcionario> listaFuncionario = new ArrayList();
        Funcionario f1 = new Funcionario("4", 
                                        "4", 
                                        "Paulo", 
                                        "Rua 4", 
                                        "4", 
                                        4, 
                                        "444", 
                                        Calendar.getInstance(), 
                                        Calendar.getInstance(), 
                                        "4");
        Funcionario f2 = new Funcionario("5", 
                                        "5", 
                                        "João", 
                                        "Rua 5", 
                                        "5", 
                                        5, 
                                        "555", 
                                        Calendar.getInstance(), 
                                        Calendar.getInstance(), 
                                        "5");
        
        listaFuncionario.add(f1);
        listaFuncionario.add(f2);
        
        
        List<Aluno> listaAluno = new ArrayList();
        Aluno a1 = new Aluno("1", 
                            "1", 
                            "Artur", 
                            "Rua 1", 
                            "1", 
                            1, 
                            "111", 
                            Calendar.getInstance(), 
                            Calendar.getInstance(), 
                            "1");
        Aluno a2 = new Aluno("2",
                            "2", 
                            "Natthan", 
                            "Rua 2", 
                            "2", 
                            2, 
                            "222", 
                            Calendar.getInstance(), 
                            Calendar.getInstance(), 
                            "2");
        
        listaAluno.add(a1);
        listaAluno.add(a2);
        Collection<Emprestimo> listaEmprestimos = exer3(listaFuncionario, listaAluno, listaExemplar);
        System.out.println("\nEXERCÍCIO 3 - EMPRÉSTIMOS");
        i = 0;
        for (Emprestimo e : listaEmprestimos){
            i++;
            System.out.print("Empréstimo " + i + ": " + "Data de devolução: " + sdf.format(e.getData_devolucao().getTime())+ "| Situação: ");
            if (e.getSituacao() == false)
                System.out.println("pendente");
            else
                System.out.println("devolvido| Data devolvido: " + e.getData_devolvido());
        }
        Emprestimo emp = exer5(f1, a1, ex1);
        System.out.println("\nEXERCÍCIO 5 - PARCELAMENTO");
        
            System.out.print("Data de devolução: " + sdf.format(emp.getData_devolucao().getTime())+ "| Situação: ");
            
            if (emp.getSituacao() == false)
                System.out.println("pendente");
            else
                System.out.println("devolvido| Data devolvido: " + sdf.format(emp.getData_devolvido().getTime()));
            
            Collection <Parcelamento> parcLista = emp.getParcelamento();
            
            System.out.println("\nParcelamento: ");
            for (Parcelamento p : parcLista){
                System.out.println("Número da parcela: " + p.getNumero_parcela()
                + "|Situação: " + p.getSituacao());
            }
        
    }
    
    private List<Pessoa> exer1(){
        List<Pessoa> lista = new ArrayList();

        Calendar dataNasc = Calendar.getInstance();
        dataNasc.set(Calendar.DAY_OF_MONTH, 13);
        dataNasc.set(Calendar.MONTH, 2);
        dataNasc.set(Calendar.YEAR, 2004);

        Aluno a1 = new Aluno("1", 
                            "1", 
                            "Artur", 
                            "Rua 1", 
                            "1", 
                            1, 
                            "111", 
                            Calendar.getInstance(), 
                            dataNasc, 
                            "1");
        
        dataNasc = Calendar.getInstance();
        dataNasc.set(Calendar.DAY_OF_MONTH, 10);
        dataNasc.set(Calendar.MONTH, 1);
        dataNasc.set(Calendar.YEAR, 2002);
        Aluno a2 = new Aluno("2", 
                "2", 
                "Manoel", 
                "Rua 2", 
                "2", 
                2, 
                "222", 
                Calendar.getInstance(), 
                dataNasc, 
                "2");
        
        dataNasc = Calendar.getInstance();
        dataNasc.set(Calendar.DAY_OF_MONTH, 1);
        dataNasc.set(Calendar.MONTH, 12);
        dataNasc.set(Calendar.YEAR, 2000);
        Aluno a3 = new Aluno("3", "3", "João", "Rua 3", "3", 3, "333", Calendar.getInstance(), dataNasc, "3");
        
        dataNasc = Calendar.getInstance();
        dataNasc.set(Calendar.DAY_OF_MONTH, 5);
        dataNasc.set(Calendar.MONTH, 1);
        dataNasc.set(Calendar.YEAR, 2010);
        
        Funcionario f1 = new Funcionario("4", "4", "Paulo", "Rua 4", "4", 4, "444", Calendar.getInstance(), dataNasc, "4");
        
        dataNasc = Calendar.getInstance();
        dataNasc.set(Calendar.DAY_OF_MONTH, 8);
        dataNasc.set(Calendar.MONTH, 9);
        dataNasc.set(Calendar.YEAR, 2000);
        Funcionario f2 = new Funcionario("5", "5", "Pedro", "Rua 5", "5", 5, "555", Calendar.getInstance(), dataNasc, "5");
        
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(f1);
        lista.add(f2);
        
        Collections.sort(lista); // classifica por data de nascimento
        
        return lista;
    }
    
    private Collection<Emprestimo> exer3(List<Funcionario> listaFunc, List<Aluno> listaAl, List<Exemplar> listaExemp){
        Collection<Emprestimo> listaRetorno = new ArrayList();
        Emprestimo emp = new Emprestimo();
        
        for(Exemplar ex : listaExemp){
            emp.setExemplar(ex);
            emp.setData(Calendar.getInstance());
            Calendar c = Calendar.getInstance();
            c.set(Calendar.DAY_OF_MONTH, 1);
            c.set(Calendar.MONTH, 1);
            c.set(Calendar.YEAR, 2000);
            emp.setData_devolucao(c);
            emp.setData_devolvido(null);
            emp.setSituacao(emp.getSituacao());
            listaRetorno.add(emp);
        }
        int i = 0;
        for (Emprestimo e : listaRetorno){
            if (listaAl.get(i) != null)
                e.setAluno(listaAl.get(i));
            else
                break;
            i++;
        }
        i = 0;
        for (Emprestimo e : listaRetorno){
            if (listaFunc.get(i) != null)
                e.setFuncionario(listaFunc.get(i));
            else
                break;
            i++;
        }
        
        //PODE-SE FAZER UM TESTE PARA DESCOBRIR O TAMANHO DAS LISTAS
           
        return listaRetorno;
    }
    
    private Emprestimo exer5(Funcionario funcionario, Aluno aluno, Exemplar exemplar){
        Emprestimo emprestimo = new Emprestimo();
        Collection listaParcelamento = new ArrayList();
        
        emprestimo.setAluno(aluno);
        emprestimo.setFuncionario(funcionario);
        emprestimo.setExemplar(exemplar);
        emprestimo.setData(Calendar.getInstance());
        Calendar c = Calendar.getInstance();
        c.set(2023, 11, 5);        
        emprestimo.setData_devolucao(c);
        //c.set(2023, 11, 31);
        emprestimo.setData_devolvido(null);
        c.set(2023, 0, 1);
        Parcelamento parc1 = new Parcelamento(1,
                                    1,
                                    c,
                                    c,
                                    1000.00,
                                    200.00);
        parc1.setSituacao();
        c.set(2023, 1, 1);
        Parcelamento parc2 = new Parcelamento(1,
                                    2,
                                    c,
                                    c,
                                    1000.00,
                                    200.00);
        parc2.setSituacao();
        c.set(2023, 2, 1);
        Parcelamento parc3 = new Parcelamento(1,
                                    3,
                                    c,
                                    null,
                                    1000.00,
                                    null);
        parc3.setSituacao();
        c.set(2023, 3, 1);
        Parcelamento parc4 = new Parcelamento(1,
                                    4,
                                    c,
                                    null,
                                    1000.00,
                                    null);
        parc4.setSituacao();
        c.set(2023, 4, 1);
        Parcelamento parc5 = new Parcelamento(1,
                                    5,
                                    c,
                                    null,
                                    1000.00,
                                    null);
        parc5.setSituacao();
        listaParcelamento.add(parc1);
        listaParcelamento.add(parc2);
        listaParcelamento.add(parc3);
        listaParcelamento.add(parc4);
        listaParcelamento.add(parc5);
        emprestimo.setParcelamento(listaParcelamento);
        
        return emprestimo;
    }
    public static void main(String args[]){
        /*método estático (alto consumo de memória)*/
        new Biblioteca(); // criação de uma instância (chamada do construtor)
    }    
}
