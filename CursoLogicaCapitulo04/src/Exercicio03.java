import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Double total = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("PROGRAMA DE CALCULO DE GASTOS FAMILIAR");
		
		System.out.print("Informe o valor da conta de luz: ");
		
		Double contaLuz = scanner.nextDouble();
		
		System.out.print("Informe o valor da conta de agua: ");
		
		Double contaAgua = scanner.nextDouble();
		
		System.out.print("Informe o valor da conta de telefone: ");
		
		Double contaTelefone = scanner.nextDouble();
		
		System.out.print("Informe o valor da escola: ");
		
		Double contaEscola = scanner.nextDouble();
		
		System.out.print("Informe o valor da fatura do cartao: ");
		
		Double contaCartao = scanner.nextDouble();
		
		System.out.print("Informe o valor da compras do mercado: ");
		
		Double contaMercado = scanner.nextDouble();
		
		Double resultado = contaLuz + contaAgua + contaTelefone + contaEscola + contaCartao + contaMercado;
		
		total += resultado;
		
		System.out.println("Resultado final das contas do mes: " + total);
	}

}
