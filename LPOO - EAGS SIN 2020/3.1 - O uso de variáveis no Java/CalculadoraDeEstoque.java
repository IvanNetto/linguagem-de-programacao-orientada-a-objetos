public class CalculadoraDeEstoque {
	public static void main(String[] args) {
	
		
		double livroJava8;
		double livroTDD;			
		
		// Atribuir valor direto na declaração da variável também é possível 
		double livroJava9 = 60;
		// int numeroInteiro = livroJava9; // Atente-se para a capacidade do tipo da variável e o valor que está sendo atribuído a ela
		int numeroInteiro = (int)livroJava9; // Com o Casting passa a ser possível superar a capacidade do tipo da variável
		
		livroJava8 = 59.90;
		livroTDD = 59.90;
			
		double soma = livroJava8 + livroTDD;
		
		System.out.println("O total em estoque é " + soma); // O sinal de + nesse caso concatena uma String ao valor de uma variável
			
   
	}
}