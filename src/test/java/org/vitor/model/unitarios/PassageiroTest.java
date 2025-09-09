package org.vitor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.vitor.model.Passageiro;

import static org.junit.jupiter.api.Assertions.*;

class PassageiroTest {

    Passageiro passageiro1, passageiro2, passageiro3;

    @BeforeEach
    void criarPassageiros(){
        passageiro1 = new Passageiro("", 10, "");
        passageiro2 = new Passageiro("", 50, "");
        passageiro3 = new Passageiro("", 70, "");
    }

    @Test
    void getNome() {
    }

    @Test
    void getIdade() {
    }

    @Test
    void getDocumento() {
    }

    @Test
    void temDesconto() {
        assertTrue(passageiro1.temDesconto());
        assertFalse(passageiro2.temDesconto());
        assertTrue(passageiro3.temDesconto());
    }
}