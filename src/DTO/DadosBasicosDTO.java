package DTO;

import INTER.DadosBasicosINTER;

public class DadosBasicosDTO implements DadosBasicosINTER{
    
    protected int id = 0;
    protected int bairro = 0;
    protected String nome = "";
    protected String senha = "";

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
 
}
