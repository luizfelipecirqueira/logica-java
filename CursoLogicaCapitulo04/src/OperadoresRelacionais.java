
public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2? " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2? " + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		Boolean tresMenorOuIgualATres = 3 <= 3;
		System.out.println("3 <= 3? " + tresMenorOuIgualATres);
		
		Boolean doisIgualADois = 2 == 2;
		System.out.println("2 == 2? " + doisIgualADois);
		
		Boolean doisDiferenteDeDois = 2 != 7;
		System.out.println("2 != 7? " + doisDiferenteDeDois);
		
		Integer quatro = 4;
		
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		
		System.out.println("Quatro é maior que quatro? " + quatroMaiorQueQuatro);
		
		Boolean quatroMaiorMaiorOuIgualAQuatro = quatro >= quatro;
		
		System.out.println("Quatro é maior ou igual a quatro? " + quatroMaiorMaiorOuIgualAQuatro);
		
		System.out.println("Quatro é maior que quatro? (usando equals) " + quatroMaiorQueQuatro.equals(quatro));
		
	}

}
