package org.example;

public class Mensageiro {
    private Mensagem mensagem;
    private Assinatura assinatura;

    public Mensageiro(FabricaAbstrata fabrica) {
        this.mensagem = fabrica.criarMensagem();
        this.assinatura = fabrica.criarAssinatura();
    }

    public String obterMensagem() { return this.mensagem.obterConteudo();}

    public String obterAssinatura() { return this.assinatura.obterAssinatura(); }
}
