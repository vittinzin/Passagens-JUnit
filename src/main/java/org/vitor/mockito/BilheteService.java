package org.vitor.mockito;

import org.vitor.model.Passageiro;
import org.vitor.model.Viagem;

public interface BilheteService {

    void comprarBilhete(Passageiro passageiro, Viagem viagem, Double precoBase);
}
