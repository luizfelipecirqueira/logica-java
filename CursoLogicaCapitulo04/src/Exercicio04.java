import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a idade da pessoa: ");
		
		Double idade = scanner.nextDouble();
		
		System.out.print("Agora digite o tempo de contribuição: ");
		
		Double contribuicao = scanner.nextDouble();
		String aposentar = "Pode se aposentar";
		String naoaposentar = "Não pode se aposentar";
		
		if(idade >= 55 && contribuicao >= 25) {
			System.out.println(aposentar);
		}
		else {
			System.out.println(naoaposentar);
		}
		
		scanner.close();
	}

}
