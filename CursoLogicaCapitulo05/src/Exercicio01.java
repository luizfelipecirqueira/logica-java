import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota de Português da pessoa: ");
		
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota de Matemática da pessoa: ");
		
		Double notaMatematica= scanner.nextDouble();
		
		Double media = (notaPortugues + notaMatematica) / 2;
		
		if(media >= 150 && notaPortugues >= 60 && notaMatematica >= 60) {
			System.out.println("Aprovado no concurso");
		}
		else {
			System.out.println("Não foi aprovado no concurso!");
		}
	}
	
}
