import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Digite a operação: [1 = +, 2 = -, 3 = *, 4 = /]");
		
		Double operacao = scanner.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		
		Double segundoNumero = scanner.nextDouble();
		
		if(operacao == 1) {
			System.out.println("Operação Soma escolhida, resultado: " + (primeiroNumero + segundoNumero)); 
		}
		
		else if(operacao == 2) {
			System.out.println("Operação Subtração escolhida, resultado: " + (primeiroNumero - segundoNumero));
		}
		
		else if(operacao == 3) {
			System.out.println("Operação Multiplicação escolhida, resultado: " + (primeiroNumero * segundoNumero));
		}
		
		else {
			System.out.println("Operação Divisão escolhida, resultado: " + (primeiroNumero / segundoNumero));
		}
		
		scanner.close();
	}

}
