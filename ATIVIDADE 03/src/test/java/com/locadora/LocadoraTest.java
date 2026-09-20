package com.locadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LocadoraTest {

    private final Locadora locadora = new Locadora();

    @Test
    void deveCalcularValorBasico() {
        double resultado = locadora.calcularValorLocacao(3, 100, 300, false, 30);

        assertEquals(300.00, resultado, 0.001);
    }

    @Test
    void deveIgnorarQuilometragemAbaixoDaFranquia() {
        double resultado = locadora.calcularValorLocacao(3, 100, 299, false, 30);

        assertEquals(300.00, resultado, 0.001);
    }

    @Test
    void naoDeveCobrarQuilometragemNaFranquia() {
        double resultado = locadora.calcularValorLocacao(3, 100, 300, false, 30);

        assertEquals(300.00, resultado, 0.001);
    }

    @Test
    void deveCobrarPrimeiroQuilometroExcedente() {
        double resultado = locadora.calcularValorLocacao(3, 100, 301, false, 30);

        assertEquals(300.50, resultado, 0.001);
    }

    @Test
    void deveAdicionarValorDoSeguro() {
        double resultado = locadora.calcularValorLocacao(3, 100, 300, true, 30);

        assertEquals(405.00, resultado, 0.001);
    }

    @Test
    void deveAplicarDescontoEAdicionarSeguro() {
        double resultado = locadora.calcularValorLocacao(7, 100, 700, true, 30);

        assertEquals(910.00, resultado, 0.001);
    }

    @Test
    void naoDeveAplicarDescontoAteSeisDias() {
        double resultado = locadora.calcularValorLocacao(6, 100, 600, false, 30);

        assertEquals(600.00, resultado, 0.001);
    }

    @Test
    void deveAplicarDescontoDeCincoPorCentoAosSeteDias() {
        double resultado = locadora.calcularValorLocacao(7, 100, 700, false, 30);

        assertEquals(665.00, resultado, 0.001);
    }

    @Test
    void deveAplicarDescontoDeCincoPorCentoAosQuatorzeDias() {
        double resultado = locadora.calcularValorLocacao(14, 100, 1400, false, 30);

        assertEquals(1330.00, resultado, 0.001);
    }

    @Test
    void deveAplicarDescontoDeDezPorCentoAosQuinzeDias() {
        double resultado = locadora.calcularValorLocacao(15, 100, 1500, false, 30);

        assertEquals(1350.00, resultado, 0.001);
    }

    @Test
    void deveCobrarTaxaParaMotoristaComVinteAnos() {
        double resultado = locadora.calcularValorLocacao(3, 100, 300, false, 20);

        assertEquals(450.00, resultado, 0.001);
    }

    @Test
    void naoDeveCobrarTaxaParaMotoristaComVinteEUmAnos() {
        double resultado = locadora.calcularValorLocacao(3, 100, 300, false, 21);

        assertEquals(300.00, resultado, 0.001);
    }

    @Test
    void deveCombinarDescontoSeguroEQuilometragemExcedente() {
        double resultado = locadora.calcularValorLocacao(10, 120, 1200, true, 30);

        assertEquals(1590.00, resultado, 0.001);
    }

    @Test
    void deveLancarExcecaoParaZeroDias() {
        assertThrows(IllegalArgumentException.class, () ->
                locadora.calcularValorLocacao(0, 100, 0, false, 21)
        );
    }

    @Test
    void deveLancarExcecaoParaDiasNegativos() {
        assertThrows(IllegalArgumentException.class, () ->
                locadora.calcularValorLocacao(-1, 100, 0, false, 21)
        );
    }

    @Test
    void deveLancarExcecaoParaDiariaZero() {
        assertThrows(IllegalArgumentException.class, () ->
                locadora.calcularValorLocacao(1, 0, 0, false, 21)
        );
    }

    @Test
    void deveLancarExcecaoParaIdadeDezessete() {
        assertThrows(IllegalArgumentException.class, () ->
                locadora.calcularValorLocacao(1, 100, 0, false, 17)
        );
    }

    @Test
    void deveLancarExcecaoParaQuilometragemNegativa() {
        assertThrows(IllegalArgumentException.class, () ->
                locadora.calcularValorLocacao(1, 100, -1, false, 21)
        );
    }
}
