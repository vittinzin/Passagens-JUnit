package org.vitor.model;

public class Passageiro {

    private String nome;
    private int idade;
    private String documento;

    public Passageiro(){
    }
    public Passageiro(String nome, int idade, String documento) {
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getDocumento() {
        return documento;
    }

    public boolean temDesconto(){
        if (idade < 12 || idade >= 60){
            return true;
        }
        return false;
    }
}
