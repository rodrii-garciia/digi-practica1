package com.digi;

public class Main {
    public static double calcularAhorro(
            double horasAhorradas,
            double costePorHora) {

        return horasAhorradas * costePorHora;
    }

    public static void main(String[] args) {

        double ahorro = calcularAhorro(5, 20);

        System.out.println("Ahorro estimado: " + ahorro + " €");
    }
}
