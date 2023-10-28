package DTO;

import INTER.DadosBasicosINTER;

public class PessoaDTO implements DadosBasicosINTER{
    
    protected int id = 0;
    protected int bairro = 0;
    protected String nome = "";
    protected String senha = "";
    protected String nomebairro = "";

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getBairro() {
        return bairro;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public String getNomeBairro() {
        return nomebairro;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
        
    }

    @Override
    public void setBairro(int bairro) {
        this.bairro = bairro;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void setNomeBairro(String nomebairro) {
        this.nomebairro = nomebairro;
    }
 
}
