package com.ikasgela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num_entrada = Integer.MIN_VALUE;

        do {
            System.out.print("Ingrese el numero: ");
            try {
                num_entrada = Integer.parseInt(br.readLine());
                if (num_entrada > 0) {

                    System.out.println("El factorial de " + num_entrada + " es "
                            + factorial(BigInteger.valueOf(num_entrada)).toString() + "\n");

                } else if (num_entrada < 0) {
                    System.out.println("Error: El número ingresado no es positivo intente nuevamente.\n");
                } else {
                    System.out.println("Programa Terminado");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada invalida.\n");

            }

        } while (num_entrada != 0);
    }

    private static BigInteger factorial(BigInteger num) {

        BigInteger factor;
        if (num.equals(BigInteger.ZERO)) {
            factor = BigInteger.ONE;
        } else {
            factor = num.multiply(factorial(num.subtract(BigInteger.ONE)));
        }

        return factor;
    }
}

