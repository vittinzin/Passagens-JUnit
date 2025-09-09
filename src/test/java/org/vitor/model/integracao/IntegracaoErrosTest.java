package org.vitor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.vitor.model.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegracaoErrosTest {

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

        trem = new Trem("1234abc", 150, 150);

        viagem = new Viagem(
                estacaoOrigem,
                estacaoOrigem,
                LocalDateTime.parse("01-02-2024 19:00", formatter),
                LocalDateTime.parse("01-02-2024 10:00", formatter),
                trem);

        passageiro = new Passageiro("Vitor", 60, "123.123.123-12");

        bilhete = new Bilhete(
                passageiro,
                viagem,
                1000.00);
    }

    @Test
    void embarcarPassageiro(){
        assertThrows(Exception.class, () -> trem.embarcarPassageiro());
    }

    @Test
    void estacaoCheck(){
        assertThrows(Exception.class,() -> viagem.horariosCheck());
    }

    @Test
    void horariosCheck(){
        assertThrows(Exception.class,() -> viagem.horariosCheck());
    }
}
