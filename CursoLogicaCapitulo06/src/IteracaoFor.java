
public class IteracaoFor {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + ": Teste for");
		}
		
		Integer[] produtos = new Integer[]{ 100, 225, 300 };
		
		for(int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			
			System.out.println("Produto de código: " + produto);
			
			if (produto.equals(225)) {
				System.out.println("Produto encontrado!");
				break;
			}
		}

	}

}
