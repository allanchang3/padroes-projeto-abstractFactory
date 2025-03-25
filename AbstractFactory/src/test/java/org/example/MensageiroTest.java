package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MensageiroTest {

    @Test
    void deveEmitirMensagemFormal() {
        FabricaAbstrata fabrica = new FabricaFormal();
        Mensageiro mensageiro = new Mensageiro(fabrica);
        Assertions.assertEquals("Prezado(a), segue a informação solicitada.", mensageiro.obterMensagem());
    }

    @Test
    void deveEmitirAssinaturaFormal() {
        FabricaAbstrata fabrica = new FabricaFormal();
        Mensageiro mensageiro = new Mensageiro(fabrica);
        Assertions.assertEquals("Atenciosamente,\nAllan Chang", mensageiro.obterAssinatura());
    }

    @Test
    void deveEmitirMensagemInformal() {
        FabricaAbstrata fabrica = new FabricaInformal();
        Mensageiro mensageiro = new Mensageiro(fabrica);
        Assertions.assertEquals("E aí, beleza? Aqui está o que você pediu!", mensageiro.obterMensagem());
    }

    @Test
    void deveEmitirDiplomaPosGraduacao() {
        FabricaAbstrata fabrica = new FabricaInformal();
        Mensageiro mensageiro = new Mensageiro(fabrica);
        Assertions.assertEquals("Abraço, Allan Chang", mensageiro.obterAssinatura());
    }
}

