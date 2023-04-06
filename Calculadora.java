package fundamentos;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("informe o numero: ");
		double num1 = sc.nextDouble();
		
		System.out.println("informe o numero: ");
		double num2 = sc.nextDouble();
		
		System.out.println("informe a operação: ");
		String operacao = sc.next();
		
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		
		
		sc.close();
	}

}
