package com.locadora;

public class Locadora {

    public double calcularValorLocacao(
            int dias,
            double valorDiaria,
            int quilometrosPercorridos,
            boolean possuiSeguro,
            int idadeMotorista) {

        if (dias <= 0) {
            throw new IllegalArgumentException("Quantidade de dias inválida");
        }

        if (valorDiaria <= 0) {
            throw new IllegalArgumentException("Valor da diária inválido");
        }

        if (idadeMotorista <= 17) {
            throw new IllegalArgumentException("Idade inválida");
        }

        if (quilometrosPercorridos < 0) {
            throw new IllegalArgumentException("Quilometragem inválida");
        }

        double valorDiarias = dias * valorDiaria;

        double desconto = 0;

        if (dias >= 7 && dias <= 14) {
            desconto = valorDiarias * 0.05;
        } else if (dias > 14) {
            desconto = valorDiarias * 0.10;
        }

        double valorDiariasComDesconto = valorDiarias - desconto;

        double valorSeguro = 0;

        if (possuiSeguro) {
            valorSeguro = dias * 35;
        }

        int franquia = dias * 100;
        int quilometrosExcedentes = Math.max(0, quilometrosPercorridos - franquia);
        double valorQuilometros = quilometrosExcedentes * 0.50;

        double taxaIdade = 0;

        if (idadeMotorista < 21) {
            taxaIdade = 150;
        }

        return valorDiariasComDesconto + valorSeguro + valorQuilometros + taxaIdade;
    }
}
