package org.vitor.mockito;

import org.vitor.model.Bilhete;
import org.vitor.model.Passageiro;
import org.vitor.model.Trem;

public interface EmailService {

    void enviarConfirmacao(Passageiro passageiro, Bilhete bilhete);

    void enviarAlertaLotacao(Trem trem);
}
