package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o primeiro valor:");
		double x = sc.nextDouble();
		System.out.println("digite o operador:");
		char operador = sc.next().charAt(0);
		
		double resultado=0;
		if (!Character.isLetterOrDigit(operador)) {
			System.out.println("digite o segundo valor:");
			double y = sc.nextDouble();
			switch(operador) {
				case '+': {
					resultado = x + y;
					break;
				}
				case '-': {
					resultado = x - y;
					break;
				}
				case '/': {
					resultado = x / y;
					break;
				}
				case '*':{
					resultado = x * y;
					break;
				}default: {
					System.out.println("Possivel erro com operador, tente novamente!");
				}
			}
			System.out.printf("O resultado da operação é %.2f%n", resultado);
		}else {
			System.out.println("operador invalido!!!");
			
		}
				
		sc.close();
	}
}
