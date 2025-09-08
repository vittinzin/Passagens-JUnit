package org.vitor.model;

public class Trem {

    private String codigo;
    private int capacidade;
    private int ocupacao;

    public Trem(){
    }

    public Trem(String codigo, int capacidade, int ocupacao) {
        this.codigo = codigo;
        this.capacidade = capacidade;
        this.ocupacao = ocupacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(int ocupacao) {
        this.ocupacao = ocupacao;
    }

    public boolean temVaga(){
        if (capacidade == getOcupacao()){
            return false;
        }
        return true;
    }

    public boolean embarcarPassageiro() throws Exception {
        if (temVaga()) {
            this.ocupacao ++;
            return true;
        } else {
            throw new Exception("Nao tem vaga");
        }
    }

    public boolean desembarcarPassageiro() throws Exception {
        if (getOcupacao() > 0) {
            this.ocupacao --;
            return true;
        } else {
            throw new Exception("Trem vazio");
        }
    }
}
