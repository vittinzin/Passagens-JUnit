package org.vitor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.vitor.model.Trem;

import static org.junit.jupiter.api.Assertions.*;

class TremTest {

    Trem trem1, trem2;

    @BeforeEach
    void criarTrens(){
        trem1 = new Trem("abc123", 100, 100);
        trem2 = new Trem("123abc", 100, 0);
    }
    @Test
    void getCodigo() {
    }

    @Test
    void getCapacidade() {
    }

    @Test
    void getOcupacao() {
    }

    @Test
    void temVaga() {
        assertFalse(trem1.temVaga());
        assertTrue(trem2.temVaga());
    }

    @Test
    void embarcarPassageiro() throws Exception {
        assertThrows(Exception.class,() -> trem1.embarcarPassageiro());
        assertTrue(trem2.embarcarPassageiro());
    }

    @Test
    void desembarcarPassageiro() throws Exception {
        assertTrue(trem1.desembarcarPassageiro());
        assertThrows(Exception.class,() -> trem2.desembarcarPassageiro());
    }
}