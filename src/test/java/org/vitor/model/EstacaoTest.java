package org.vitor.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.vitor.model.Estacao;

import static org.junit.jupiter.api.Assertions.*;

class EstacaoTest {

    Estacao estacao;

    @BeforeEach
    void criarEstacao(){
        estacao = new Estacao("Grand Central Terminal", "New York");
    }

    @Test
    void getNome() {
        assertEquals("Grand Central Terminal", estacao.getNome());
    }

    @Test
    void getCidade() {
        assertEquals("Grand Central Terminal", estacao.getNome());
    }
}