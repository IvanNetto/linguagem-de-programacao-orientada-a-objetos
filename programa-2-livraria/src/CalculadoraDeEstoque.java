
public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		
		// Define um tipo double
		double livroJava8;
		double livroTDD;
		
		livroJava8 = 100; // Tipo int é menor que um tipo double, então é aceita essa atribuição
		livroTDD = 59.90; // Se alterarmos o tipo de livroTDD para int, essa linha retornará um erro, pois não é
		                  // possível atribuir um valor de um tipo maior em um tipo menor (no caso double em int)
		
		double soma = livroJava8 + livroTDD;	
		
		
		System.out.println("O total em estoque é " + soma);

	}

}
