/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico3.util;

/**
 *
 * @author telmo
 */
public class Carro implements Comparable<Carro>{
    
    private String nome;
    private String modelo;
    private String fabricante;
    private String numChassi;
    private Float valor; 
    
    // Construtor público que recebe os parâmetros para a inicialização do carro
    public Carro(String nome, String modelo, String fabricante, String numChassi, Float valor){ 
        
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.numChassi = numChassi;
        this.valor = valor;
    }
    
    @Override
    public int compareTo(Carro c) {
        
        //ascendente pela matricula
        //return this.matricula.compareTo(t.matricula);
        
        //descendente pela matricula
        //return t.matricula.compareTo(this.matricula);
        
        //ascendente pelo nome
        return this.nome.compareTo(c.nome);
        
        //desccendente pelo nome
        //return t.nome.compareTo(this.nome);
        
    }
    
    @Override
    public String toString(){
        
        return nome + " - " + modelo;
    }
}
