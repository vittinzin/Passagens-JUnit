package org.vitor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.vitor.model.*;

import static org.junit.jupiter.api.Assertions.*;

class BilheteTest {

    Bilhete bilhete1, bilhete2, bilhete3;

    @BeforeEach
    void criarBilhetes(){
        bilhete1 = new Bilhete(new Passageiro("",1,""),
                new Viagem(new Estacao(),new Estacao(),null,null,
                        new Trem("abc123", 100, 50)),
                100.00
        );

        bilhete2 = new Bilhete(new Passageiro("",40,""),
                new Viagem(new Estacao(),new Estacao(),null,null,
                        new Trem("abc123", 100, 50)),
                100.00
        );
        bilhete3 = new Bilhete(new Passageiro("",40,""),
                new Viagem(new Estacao(),new Estacao(),null,null,
                        new Trem("abc123", 100, 100)),
                100.00
        );
    }

    @Test
    void getPassageiro() {
    }

    @Test
    void getViagem() {
    }

    @Test
    void getPrecoBase() {
    }

    @Test
    void calcularPreco() throws Exception {
        assertEquals(50.00, bilhete1.calcularPreco());
        assertEquals(100.00,bilhete2.calcularPreco());
    }

    @Test
    void validarEmbarque() throws Exception {
        assertTrue(bilhete1.validarEmbarque());
        assertThrows(Exception.class,() -> bilhete3.validarEmbarque());
    }
}