package br.edu.ifsul.bcc.too.topico5.exercicios.estudo_caso_agenciabilhetes.classes;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class CiaAerea {
    
    private Long id;
    private String nome;
    
    private List<Rota> rotas;
    
    private List<Aviao> avioes;
    
    private List<Papel> papeis;
    
    CiaAerea(){
        
    }
    
    public CiaAerea(Long id, 
            String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public void adicionarRota(Rota rota){
        rotas.add(rota);
    }
    
    public void adicionarAviao(Aviao aviao){
        avioes.add(aviao);
    }
    
    public void adicionarPapel(Papel papel){
        papeis.add(papel);
    }
    
    public int quantidadeRotas(){
        return rotas.size();
    }
    
    public int quantidadeAvioes(){
        return avioes.size();
    }
    
    public int quantidadePapeis(){
        return papeis.size();
    }
    
    public void excluirRota(Rota rota){
        rotas.remove(rota);
    }
    
    public void excluirAviao(Aviao aviao){
        avioes.remove(aviao);
    }
    
    public void excluirPapel(Papel papel){
        papeis.remove(papel);
    }
    
    public Rota getRota(int posicao){
        return rotas.get(posicao);
    }
    
    public Aviao getAviao(int posicao){
        return avioes.get(posicao);
    }
    
    public Papel getPapel (int posicao){
        return papeis.get(posicao);
    }
}
