
package br.edu.ifsul.bcc.too.topico5.exercicios.respostas.estudocaso_csgo.diagrama;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Jogador {
    
    private String nickname;
    private String senha;
    private Integer pontos;
    private Calendar data_cadastro;
    private Calendar data_ultimo_login;
    private Endereco endereco;
    private Collection<Patente> patentes;
    private Collection<Compra> compras;
    private Collection<Artefato> artefatos;
    
    public Jogador(){
        
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the pontos
     */
    public Integer getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    /**
     * @return the data_cadastro
     */
    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    /**
     * @return the data_ultimo_login
     */
    public Calendar getData_ultimo_login() {
        return data_ultimo_login;
    }

    /**
     * @param data_ultimo_login the data_ultimo_login to set
     */
    public void setData_ultimo_login(Calendar data_ultimo_login) {
        this.data_ultimo_login = data_ultimo_login;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the patentes
     */
    public Collection<Patente> getPatentes() {
        return patentes;
    }

    /**
     * @param patentes the patentes to set
     */
    public void setPatentes(Collection<Patente> patentes) {
        this.patentes = patentes;
    }
    
    public void setPatente(Patente patente) {
        if(this.patentes == null)
            this.patentes = new ArrayList();
        
        this.patentes.add(patente);
    }
        

    /**
     * @return the compras
     */
    public Collection<Compra> getCompras() {
        return compras;
    }

    /**
     * @param compras the compras to set
     */
    public void setCompras(Collection<Compra> compras) {
        this.compras = compras;
    }

    /**
     * @return the artefatos
     */
    public Collection<Artefato> getArtefatos() {
        return artefatos;
    }

    /**
     * @param artefatos the artefatos to set
     */
    public void setArtefatos(Collection<Artefato> artefatos) {
        this.artefatos = artefatos;
    }
    
    
}
