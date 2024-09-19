package edu.dio.desafio.contador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean numerosValidos = false;

        do {
            System.out.println("Digite o primeiro numero inteiro como parâmetro:");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo numero inteiro como parâmetro:");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
                numerosValidos = true;
                terminal.close();
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        } while (!numerosValidos);
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Parametros invalidos. O parametro um não pode ser maior que o parametro dois.");
        } else {
            int contagem = parametroDois - parametroUm;
            for (int numero = 0; numero < contagem; numero++) {
                System.out.println("Imprimindo o número " + numero);
            }
        }
    }
}