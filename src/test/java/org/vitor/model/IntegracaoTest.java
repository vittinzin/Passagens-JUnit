package org.vitor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.vitor.model.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class IntegracaoTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    Estacao estacaoOrigem, estacaoDestino;
    Trem trem;
    Viagem viagem;
    Passageiro passageiro;
    Bilhete bilhete;

    @BeforeEach
    void criacaoObj() {
        estacaoOrigem = new Estacao("Estacao A", "Uberlandia");
        estacaoDestino = new Estacao("Estacao B", "Sao Paulo");

        trem = new Trem("1234abc", 150, 100);

        viagem = new Viagem(
                estacaoOrigem,
                estacaoDestino,
                LocalDateTime.parse("01-02-2024 10:00", formatter),
                LocalDateTime.parse("01-02-2024 19:00", formatter),
                trem);

        passageiro = new Passageiro("Vitor", 18, "123.123.123-12");

        bilhete = new Bilhete(
                passageiro,
                viagem,
                1000.00);
    }

    @Test
    void embarcarPassageiro() throws Exception {
        assertTrue(trem.embarcarPassageiro());
    }

    @Test
    void getOcupacao() throws Exception {
        assertTrue(trem.embarcarPassageiro());
        assertEquals(101, trem.getOcupacao());
    }

    @Test
    void calcularPreco() throws Exception {
        assertEquals(1000.00, bilhete.calcularPreco());
    }
}
