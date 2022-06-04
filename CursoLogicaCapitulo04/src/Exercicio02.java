import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		
		Double valorProduto = scanner.nextDouble();
		
		Boolean cobrarFrete = valorProduto < 100;
		
		Double valorFinal = valorProduto;
		
		if(cobrarFrete) {
			valorFinal = valorProduto += 15.0;
			System.out.println("Valor final da compra: " + valorFinal);
		}
		else {
			valorFinal = valorProduto;
			System.out.println("Valor final da compra: " + valorFinal);
		}

	}

}
