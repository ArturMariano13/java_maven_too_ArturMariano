/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.bcc.too.topico3.util;

public class Pneu implements Comparable<Pneu> {
    
    private int codigo;
    private String modelo;
    private String posicao;
    private Float medida;
    private String fabricante;
    private Float valor;
    
    public Pneu(int codigo, String modelo, String posicao, Float medida, String fabricante, Float valor){
        
        this.codigo = codigo;
        this.modelo = modelo; 
        this.posicao = posicao;
        this.medida = medida;
        this.fabricante = fabricante;
        this.valor = valor;
    }
    
    @Override
    public int compareTo(Pneu p) {
        
        //ascendente pela matricula
        //return this.matricula.compareTo(t.matricula);
        
        //descendente pela matricula
        //return t.matricula.compareTo(this.matricula);
        
        //ascendente pelo nome
        //return this.modelo.compareTo(p.modelo);
        
        //desccendente pelo nome
        return p.modelo.compareTo(this.modelo);
        
    }
    
    @Override
    public String toString(){
        
        return codigo + " - " + modelo;
    }
    
}
