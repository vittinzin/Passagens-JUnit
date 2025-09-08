package org.vitor.model;

public class Estacao {

    private String nome;
    private String cidade;

    public Estacao(){
    }

    public Estacao(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }


}
