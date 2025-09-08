package org.vitor.model;

public class Bilhete {

    private Passageiro passageiro;
    private Viagem viagem;
    private Double precoBase;

    public Bilhete(Passageiro passageiro, Viagem viagem, Double precoBase) {
        this.passageiro = passageiro;
        this.viagem = viagem;
        this.precoBase = precoBase;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public Double calcularPreco() throws Exception {
        if (!viagem.getTrem().temVaga()) {
            throw new Exception("Trem nao tem vaga!");

        } else if (passageiro.temDesconto()) {
            return precoBase /= 2;
        }
        return precoBase;
    }

    public boolean validarEmbarque() throws Exception {
        if (!viagem.getTrem().temVaga()){
            throw new Exception("Trem nao tem vaga!");
        } else {
            viagem.getTrem().embarcarPassageiro();
            return true;
        }
    }
}
