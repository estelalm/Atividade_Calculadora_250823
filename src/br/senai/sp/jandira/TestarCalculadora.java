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

		double valor1c1, valor2c1, resultadoc1;
		double valor1c2, valor2c2, resultadoc2;
		double valor1c3, valor2c3, resultadoc3;
		double valor1c4, valor2c4, resultadoc4;
		char sinalc1, sinalc2, sinalc3, sinalc4;

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
			valor1c1 = input.nextDouble();
			System.out.println("Valor 2: ");
			valor2c1 = input.nextDouble();
			System.out.println("Operação: ");
			sinalc1 = input.next().charAt(0);

			if (sinalc1 == '/' && valor2c1 == 0) {
				System.out.println("Não é possível dividir por 0");
			} else if (sinalc1 != '+' && sinalc1 != '-' && sinalc1 != '*' && sinalc1 != '/') {
				System.out.println("O sinal não corresponde à nenhuma operação.");
			} else {
				resultadoc1 = c1.exibirResultado(valor1c1, valor2c1, sinalc1);
				System.out.println(
						"Resultado 1 = " + valor1c1 + " " + sinalc1 + " " + valor2c1 + " = " + resultadoc1);
				System.out.println();

				System.out.println("--- Cálculo 2");
				System.out.println("Valor 1: ");
				valor1c2 = input.nextDouble();
				System.out.println("Valor 2: ");
				valor2c2 = input.nextDouble();
				System.out.println("Operação: ");
				sinalc2 = input.next().charAt(0);
				System.out.println("");

				if (sinalc2 == '/' && valor2c2 == 0) {
					System.out.println("Não é possível dividir por 0");
				} else if (sinalc2 != '+' && sinalc2 != '-' && sinalc2 != '*' && sinalc2 != '/') {
					System.out.println("O sinal não corresponde à nenhuma operação.");
				} else {

					resultadoc2 = c2.exibirResultado(valor1c2, valor2c2, sinalc2);
					System.out.println("Resultado 2 = " + valor1c2 + " " + sinalc2 + " " + valor2c2 + " = "
							+ resultadoc2);
					System.out.println();

					System.out.println("--- Cálculo 3");
					System.out.println("Valor 1: ");
					valor1c3 = input.nextDouble();
					System.out.println("Valor 2: ");
					valor2c3 = input.nextDouble();
					System.out.println("Operação: ");
					sinalc3 = input.next().charAt(0);
					System.out.println("");

					if (sinalc3 == '/' && valor2c3 == 0) {
						System.out.println("Não é possível dividir por 0");
					} else if (sinalc3 != '+' && sinalc3 != '-' && sinalc3 != '*' && sinalc3 != '/') {
						System.out.println("O sinal não corresponde à nenhuma operação.");
					} else {

						resultadoc3 = c3.exibirResultado(valor1c3, valor2c3, sinalc3);
						System.out.println("Resultado 3 = " + valor1c3 + " " + sinalc3 + " " + valor2c3
								+ " = " + resultadoc3);
						System.out.println();

						System.out.println("--- Cálculo 4");
						System.out.println("Valor 1: ");
						valor1c4 = input.nextDouble();
						System.out.println("Valor 2: ");
						valor2c4 = input.nextDouble();
						System.out.println("Operação: ");
						sinalc4 = input.next().charAt(0);
						System.out.println("");

						if (sinalc4 == '/' && valor2c4 == 0) {
							System.out.println("Não é possível dividir por 0");
						} else if (sinalc4 != '+' && sinalc4 != '-' && sinalc4 != '*' && sinalc4 != '/') {
							System.out.println("O sinal não corresponde à nenhuma operação.");
						} else {
							resultadoc4 = c4.exibirResultado(valor1c4, valor2c4, sinalc4);
							System.out.println("Resultado 4 = " + valor1c4 + " " + sinalc4 + " " + valor2c4
									+ " = " + resultadoc4);
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
