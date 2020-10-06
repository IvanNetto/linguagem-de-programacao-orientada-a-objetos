
public class TipagemDeDados {

	public static void main(String[] args) {

		int numeroInteiro;
		double numeroDouble;
		
		
		numeroInteiro = 18; // Se alterarmos esse valor de 18 para 18.50 dá erro, pois um tipo inteiro aloca menos espaço em memória que um tipo double
		numeroDouble = 58.15; // Em contrapartida, um tipo double aloca mais espaço em memória do que um tipo inteiro, então, se mudarmos 58.10 para 58, nenhum erro ocorreria.
		                      // Mas, se alterarmos o tipo de numeroDouble para int, já não poderiamos mais atribuir 58.15 para a variável
		
		int outroNumeroInteiro = (int) numeroDouble; // Nesse caso, estamos realizando um casting de valores. O (int) converte automaticamente o valor double para int. 
		System.out.println("O valor de numeroDouble é: " + numeroDouble );
		System.out.println("O valor de outroNumeroInteiro é: " + outroNumeroInteiro );
		

	}

}
