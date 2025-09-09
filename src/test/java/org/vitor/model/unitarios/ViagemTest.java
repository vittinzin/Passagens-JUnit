package org.vitor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.vitor.model.Estacao;
import org.vitor.model.Trem;
import org.vitor.model.Viagem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class ViagemTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    Viagem viagem1, viagem2;

    @BeforeEach
    void criarViagens(){
        viagem1 = new Viagem(
                new Estacao(),
                new Estacao(),
                LocalDateTime.parse("01-02-2024 13:00", formatter),
                LocalDateTime.parse("01-02-2024 18:30", formatter),
                new Trem()
        );

        viagem2 = new Viagem(
                new Estacao(),
                new Estacao(),
                LocalDateTime.parse("01-02-2024 20:00", formatter),
                LocalDateTime.parse("02-02-2024 02:00", formatter),
                new Trem()
        );
    }

    @Test
    void getOrigem() {
    }

    @Test
    void getDestino() {
    }

    @Test
    void getPartida() {
    }

    @Test
    void getChegada() {
    }

    @Test
    void getTrem() {
    }

    @Test
    void duracaoHoras() {
        assertEquals("5:30", viagem1.duracaoHoras() );
        assertEquals("6:00", viagem2.duracaoHoras() );
    }
}