package org.vitor.mockito;

import org.vitor.model.Trem;

import java.util.Optional;

public interface TremRepository {
    Optional<Trem> buscarPorCodigo(String codigo);

    void salvar(Trem trem);

    boolean existeTrem(String codigo);
}