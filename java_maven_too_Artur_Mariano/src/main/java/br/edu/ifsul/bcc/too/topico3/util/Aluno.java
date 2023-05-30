
package br.edu.ifsul.bcc.too.topico3.util;

/**
 *
 * @author telmo
 */
public class Aluno implements Comparable<Aluno> {
    
    private String matricula;
    private String nome;
    
    //construtor protegido - somente acessível dentro do mesmo pacote.
    // impossível de ser acessado em uma outra pasta
    public Aluno(){
        
    }
    
    public Aluno(String matricula, String nome){
        
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno t) {
        
        //ascendente pela matricula
        //return this.matricula.compareTo(t.matricula);
        
        //descendente pela matricula
        //return t.matricula.compareTo(this.matricula);
        
        //ascendente pelo nome
        return this.nome.compareTo(t.nome);
        
        //desccendente pelo nome
        //return t.nome.compareTo(this.nome);
        
    }
    
    @Override
    public String toString(){
        
        return nome+" - "+matricula;
    }
    
}
