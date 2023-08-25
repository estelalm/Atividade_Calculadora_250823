package br.senai.sp.jandira;

public class Calculadora {

	private static double somar(double valor1, double valor2) {
		
		return valor1 + valor2;
	}
	private static double subtrair(double valor1, double valor2) {
		
		return valor1 - valor2;
	}
	private static double multiplicar(double valor1, double valor2) {
		
		return valor1 * valor2;
	}
	private static double dividir(double valor1, double valor2) {
		
		return valor1 / valor2;
	}
	
	public static double exibirResultado(double valor1, double valor2, char sinal) {
		
		double resultado = 0;

		if (sinal == '+') {
			resultado = somar(valor1, valor2);
		}
		else if (sinal == '-') {
			resultado = subtrair(valor1, valor2);
		}
		else if (sinal == '*') {
			resultado = multiplicar(valor1, valor2);
		}
		else if(sinal == '/') {
		resultado = dividir(valor1, valor2);
		}
		
	   return resultado;
	}
	
	
}
