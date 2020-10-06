
public class TipagemDeDados {

	public static void main(String[] args) {

		int numeroInteiro;
		double numeroDouble;
		
		
		numeroInteiro = 18; // Se alterarmos esse valor de 18 para 18.50 d� erro, pois um tipo inteiro aloca menos espa�o em mem�ria que um tipo double
		numeroDouble = 58.15; // Em contrapartida, um tipo double aloca mais espa�o em mem�ria do que um tipo inteiro, ent�o, se mudarmos 58.10 para 58, nenhum erro ocorreria.
		                      // Mas, se alterarmos o tipo de numeroDouble para int, j� n�o poderiamos mais atribuir 58.15 para a vari�vel
		
		int outroNumeroInteiro = (int) numeroDouble; // Nesse caso, estamos realizando um casting de valores. O (int) converte automaticamente o valor double para int. 
		System.out.println("O valor de numeroDouble �: " + numeroDouble );
		System.out.println("O valor de outroNumeroInteiro �: " + outroNumeroInteiro );
		

	}

}
