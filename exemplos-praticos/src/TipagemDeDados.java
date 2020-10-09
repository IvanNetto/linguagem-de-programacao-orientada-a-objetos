
public class TipagemDeDados {

	public static void main(String[] args) {

		/* ########################
		 * ### TIPAGEM DE DADOSA###
		 * ########################
		 */ 
		
		int numeroInteiro;
		double numeroDouble;		
		
		// Se alterarmos esse valor de 18 para 18.50 d� erro, pois um tipo inteiro aloca menos espa�o em mem�ria que um tipo double
		numeroInteiro = 18;   
		// Em contrapartida, um tipo double aloca mais espa�o em mem�ria do que um tipo inteiro, ent�o, se mudarmos 58.10 para 58, nenhum erro ocorreria.
		// Mas, se alterarmos o tipo de numeroDouble para int, j� n�o poderiamos mais atribuir 58.15 para a vari�vel
		numeroDouble = 58.15;		                      
		
		// Nesse caso, estamos realizando um casting de valores. O (int) converte automaticamente o valor double para int.
		int outroNumeroInteiro = (int) numeroDouble;  
		System.out.println("O valor de numeroDouble �: " + numeroDouble );
		System.out.println("O valor de outroNumeroInteiro �: " + outroNumeroInteiro );
		

		/* ####################################
		 * ### WRAPPERS DOS TIPOS PRIMITIVOS###
		 * ####################################
		 */ 	

		/*
		 * A partir do java 1.4 o c�digo abaixo compila, por causa do autoboxing que a linguagem faz. 
		 * Ou seja, tratar um tipo primitivo como objeto. Como se fosse um cast de um tipo para objeto.
		 */		
		Object objetoInt = 10.00;
		/*
		 * Sem o autoboxing, o casting do tipo primitivo para um tipo object precisaria ser feito atrav�s
		 * de uma classe wrapper. Essa classe embrulha o tipo primitivo e o passa a tratar como uma refer�ncia (um Objetc)
		 */		
		Object objetoIntComWrapper = new Double(10.00);		
		// � possivel, al�m de embrulhar um tipo primitivo em um tip Object, desembrulhar. Ou seja, deixar de trat�-lo como um Object para trat�-lo como tipo primitivo.		
		Integer integer = new Integer(10);
		int valor = integer.intValue();
		
		/* ###########################
		 * ### CONVERS�O DE VALORES###
		 * ###########################
		 */
		
		/*
		 * Converter ("parsear") um valor em outro. No exemplo abaixo, utilizamos um  m�todo que existe em todas 
		 * as classes wrapper que recebe uma string por par�metro e o converte ("parseia") para um tipo primitivo
		 */
		boolean resultado = Boolean.parseBoolean("false");
		
		// Agora para converter tipo primitivo em String, temos o m�todo valueOf de String para essa tarefa
		String numeroEmTexto = String.valueOf(10);
		
		
	}
	
	

}
