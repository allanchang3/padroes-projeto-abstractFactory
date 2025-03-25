package org.example;

public class FabricaInformal implements FabricaAbstrata{

    public Mensagem criarMensagem() {
        return new MensagemInformal();
    }

    public Assinatura criarAssinatura() {
        return new AssinaturaInformal();
    }
}
