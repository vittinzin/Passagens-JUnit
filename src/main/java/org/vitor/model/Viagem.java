package org.vitor.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Viagem {

    private Estacao origem;
    private Estacao destino;
    private LocalDateTime partida;
    private LocalDateTime chegada;
    private Trem trem;

    public Viagem () {
    }

    public Viagem(Estacao origem, Estacao destino, LocalDateTime partida, LocalDateTime chegada, Trem trem) {
        this.origem = origem;
        this.destino = destino;
        this.partida = partida;
        this.chegada = chegada;
        this.trem = trem;
    }

    public Estacao getOrigem() {
        return origem;
    }

    public Estacao getDestino() {
        return destino;
    }

    public LocalDateTime getPartida() {
        return partida;
    }

    public LocalDateTime getChegada() {
        return chegada;
    }

    public Trem getTrem() {
        return trem;
    }

    public void estacaoCheck() throws Exception {
        if (origem == destino){
            throw new Exception("Estacoes iguais");
        }
    }

    public void horariosCheck() throws Exception {
        if (partida.isAfter(chegada)){
            throw new Exception("Horario de partida antes do de chegada");
        }
    }

    public String duracaoHoras(){
        Duration duracao = Duration.between(partida,chegada);

        return String.format("%d:%02d",
                duracao.toHours(),
                duracao.toMinutesPart());
    }
}
