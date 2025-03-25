package org.example;

public class FabricaFormal implements FabricaAbstrata{
    public Mensagem criarMensagem(){
        return new MensagemFormal();
    }
    public Assinatura criarAssinatura() {
        return new AssinaturaFormal();
    }
}
