//////////////////////////////////////////////
// Estela Alves de Moraes
// DS1BIT - A
// 25/08/2023
// Calculadora em Java com 4 instâncias
/////////////////////////////////////////////

package br.senai.sp.jandira;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestarCalculadora {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double valor1, valor2, resultado;
		char sinal;

		System.out.println("C A L C U L A D O R A");
		System.out.println();
		System.out.println("Digite o sinal correspondente para cada operação");
		System.out.println("soma (+)   subtração (-)   multiplicação (*)   divisão (/) ");
		System.out.println();
		
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = new Calculadora();
		Calculadora c4 = new Calculadora();

		try {

			System.out.println("--- Cálculo 1");
			System.out.println("Valor 1: ");
			valor1 = input.nextDouble();
			System.out.println("Valor 2: ");
			valor2 = input.nextDouble();
			System.out.println("Operação: ");
			sinal = input.next().charAt(0);

			if (sinal == '/' && valor2 == 0) {
				System.out.println("Não é possível dividir por 0");
			} else if (sinal != '+' && sinal != '-' && sinal != '*' && sinal != '/') {
				System.out.println("O sinal não corresponde à nenhuma operação.");
			} else {
				resultado = c1.exibirResultado(valor1, valor2, sinal);
				System.out.println(
						"Resultado 1 = " + valor1 + " " + sinal + " " + valor2 + " = " + resultado);
				System.out.println();

				System.out.println("--- Cálculo 2");
				System.out.println("Valor 1: ");
				valor1 = input.nextDouble();
				System.out.println("Valor 2: ");
				valor2 = input.nextDouble();
				System.out.println("Operação: ");
				sinal = input.next().charAt(0);
				System.out.println("");

				if (sinal == '/' && valor2 == 0) {
					System.out.println("Não é possível dividir por 0");
				} else if (sinal != '+' && sinal != '-' && sinal != '*' && sinal != '/') {
					System.out.println("O sinal não corresponde à nenhuma operação.");
				} else {

					resultado = c2.exibirResultado(valor1, valor2, sinal);
					System.out.println("Resultado 2 = " + valor1 + " " + sinal + " " + valor2 + " = "
							+ resultado);
					System.out.println();

					System.out.println("--- Cálculo 3");
					System.out.println("Valor 1: ");
					valor1 = input.nextDouble();
					System.out.println("Valor 2: ");
					valor2 = input.nextDouble();
					System.out.println("Operação: ");
					sinal = input.next().charAt(0);
					System.out.println("");

					if (sinal == '/' && valor2 == 0) {
						System.out.println("Não é possível dividir por 0");
					} else if (sinal != '+' && sinal != '-' && sinal != '*' && sinal != '/') {
						System.out.println("O sinal não corresponde à nenhuma operação.");
					} else {

						resultado = c3.exibirResultado(valor1, valor2, sinal);
						System.out.println("Resultado 3 = " + valor1 + " " + sinal + " " + valor2
								+ " = " + resultado);
						System.out.println();

						System.out.println("--- Cálculo 4");
						System.out.println("Valor 1: ");
						valor1 = input.nextDouble();
						System.out.println("Valor 2: ");
						valor2 = input.nextDouble();
						System.out.println("Operação: ");
						sinal = input.next().charAt(0);
						System.out.println("");

						if (sinal == '/' && valor2 == 0) {
							System.out.println("Não é possível dividir por 0");
						} else if (sinal != '+' && sinal != '-' && sinal != '*' && sinal != '/') {
							System.out.println("O sinal não corresponde à nenhuma operação.");
						} else {
							resultado = c4.exibirResultado(valor1, valor2, sinal);
							System.out.println("Resultado 4 = " + valor1 + " " + sinal + " " + valor2
									+ " = " + resultado);
							System.out.println();
						}

					}

				}

			}

		} catch (InputMismatchException exc1) {
			System.out.println("Os valores inseridos devem ser números.");
		} finally {
		}
		
		input.close();

	}
}
