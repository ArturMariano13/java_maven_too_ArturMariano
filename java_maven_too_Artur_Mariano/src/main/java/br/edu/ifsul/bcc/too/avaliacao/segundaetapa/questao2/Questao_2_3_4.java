package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao2;

import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Cliente;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Orcamento;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Pessoa;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Funcionario;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Veiculo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Questao_2_3_4 {
    
    public Questao_2_3_4(){
        List<Pessoa> lista_questao_2 = new ArrayList<Pessoa>();
        
        lista_questao_2 = inicializaListaPessoas();
        
        imprimeListaPessoas(lista_questao_2);
        
        List<Orcamento> lista_questao_4 = new ArrayList<Orcamento>();
        
        lista_questao_4 = inicializaListaOrcamentos();
        
        imprimeListaOrcamentos(lista_questao_4);
    }
    
    private List<Pessoa> inicializaListaPessoas(){
        List<Pessoa> listaRetorno = new ArrayList<Pessoa>();
        Calendar dataNasc = Calendar.getInstance();
        Calendar dataAdm = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dataNasc.set(1983, 04, 01);
        dataAdm.set(1999, 9, 20);
        Funcionario f = new Funcionario("11111357788", 
                                        "Zé Chaves", 
                                        dataNasc, 
                                        "99052250", 
                                        "apartamento 400", 
                                        "123", 
                                        dataAdm,
                                        null);
        
        
        
        
        dataNasc.set(1983, 04, 01);
        Veiculo v = new Veiculo();
        v.setPlaca("igd1903");
        v.setModelo("vectra");
        v.setAno(1997);
        Calendar data_u_s = Calendar.getInstance();
        data_u_s.set(2022, 01, 01);
        v.setData_ultimo_servico(data_u_s);
        Cliente cliente = new Cliente("11111357788", 
                                        "Zé Chaves", 
                                        dataNasc, 
                                        "99052250", 
                                        "apartamento 400", 
                                        "cliente que paga em dia",
                                        v);
        
        listaRetorno.add(f);
        listaRetorno.add(cliente);
        
        return listaRetorno;
    }
    
    private List<Orcamento> inicializaListaOrcamentos(){
        List<Orcamento> listaRetorno = new ArrayList<Orcamento>();
        Orcamento o = new Orcamento();
        Calendar c = Calendar.getInstance();
        c.set(2022, 11, 14);
        
        o.setId(1);
        o.setObservacoes("carro em pessimas condicoes");
        o.setData(c);
        Veiculo v = new Veiculo();
        v.setPlaca("igd1903");
        v.setModelo("vectra");
        v.setAno(1997);
        Calendar data_u_s = Calendar.getInstance();
        data_u_s.set(2022, 01, 01);
        v.setData_ultimo_servico(data_u_s);
        o.setVeiculo(v);
        c.set(1983, 04, 01);
        Cliente cliente = new Cliente("11111357788", 
                                        "Zé Chaves", 
                                        c, 
                                        "99052250", 
                                        "apartamento 400", 
                                        "cliente que paga em dia",
                                        v);
        o.setCliente(cliente);
        listaRetorno.add(o);
        o = new Orcamento();
        o.setId(2);
        o.setObservacoes("carro em pessimas condicoes");
        c.set(2022, 11, 15);
        o.setData(c);
        
        listaRetorno.add(o);
        
        return listaRetorno;
        
    }
    
    private void imprimeListaPessoas(List<Pessoa> lista){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Pessoa p : lista){
            int i = 0;
            if (i == 0 && p instanceof Funcionario){
                System.out.println("Funcionário(s)");
                System.out.println("CPF\t\tNome\t\tData de nascimento\tCep\t\tComplemento\t\tNumero_ctps\tData admissão\tData demissão");
                i++;
            }
            if (p instanceof Funcionario){
                Funcionario f = (Funcionario) p;
                System.out.print(p.getCpf() + "\t" +
                        p.getNome() + "\t" +
                        sdf.format(p.getData_nascimento().getTime()) + "\t\t" +
                        p.getCep() + "\t" +
                        p.getComplemento() + "\t\t" +
                        f.getNumero_ctps() + "\t\t" +
                        sdf.format(f.getData_admissao().getTime()) + "\t");
                if (f.getData_demissao() == null){
                    System.out.print("null");
                }
                else{
                    System.out.print(sdf.format(f.getData_demissao().getTime()));
                }
     
            }
            System.out.println();
        
        }
        
        for (Pessoa p : lista){
            int i = 0;
            if (i == 0 && p instanceof Cliente){
                System.out.println("Cliente(s)");
                System.out.println("CPF\t\tNome\t\tData de nascimento\tCep\t\tComplemento\t\tObservações\t\t\tVeículo\t");
                i++;
            }
            
            if (p instanceof Cliente){
                Cliente c = (Cliente) p;
                System.out.print(p.getCpf() + "\t" +
                        p.getNome() + "\t" +
                        sdf.format(p.getData_nascimento().getTime()) + "\t\t" +
                        p.getCep() + "\t" +
                        p.getComplemento() + "\t\t" +
                        c.getObservacoes() + "\t\t" +
                        c.getVeiculo(0).getPlaca());
                System.out.println();
            }
        }
        System.out.println();
    }
    
    private void imprimeListaOrcamentos(List<Orcamento> lista){
        System.out.println("Orçamentos");
        System.out.println("ID\tObservações\t\t\tData\t\tCliente\t\tVeículo");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Orcamento o : lista){
            System.out.print(o.getId() + "\t" +
                        o.getObservacoes()+ "\t" +
                        sdf.format(o.getData().getTime()) + "\t");
            
            if (o.getCliente() == null){
                System.out.print("null" + "\t\t");
            }
            else{
                System.out.print(o.getCliente().getNome() + "\t");
            }
            if (o.getVeiculo() == null){
                System.out.print("null");
            }  
            else{
                System.out.print(o.getVeiculo().getPlaca() + "\t");
            }      
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        new Questao_2_3_4();
    }
}
