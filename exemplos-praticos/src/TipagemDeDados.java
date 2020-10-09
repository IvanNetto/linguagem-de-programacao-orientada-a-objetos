
public class TipagemDeDados {

	public static void main(String[] args) {

		/* ########################
		 * ### TIPAGEM DE DADOSA###
		 * ########################
		 */ 
		
		int numeroInteiro;
		double numeroDouble;		
		
		// Se alterarmos esse valor de 18 para 18.50 dá erro, pois um tipo inteiro aloca menos espaço em memória que um tipo double
		numeroInteiro = 18;   
		// Em contrapartida, um tipo double aloca mais espaço em memória do que um tipo inteiro, então, se mudarmos 58.10 para 58, nenhum erro ocorreria.
		// Mas, se alterarmos o tipo de numeroDouble para int, já não poderiamos mais atribuir 58.15 para a variável
		numeroDouble = 58.15;		                      
		
		// Nesse caso, estamos realizando um casting de valores. O (int) converte automaticamente o valor double para int.
		int outroNumeroInteiro = (int) numeroDouble;  
		System.out.println("O valor de numeroDouble é: " + numeroDouble );
		System.out.println("O valor de outroNumeroInteiro é: " + outroNumeroInteiro );
		

		/* ####################################
		 * ### WRAPPERS DOS TIPOS PRIMITIVOS###
		 * ####################################
		 */ 	

		/*
		 * A partir do java 1.4 o código abaixo compila, por causa do autoboxing que a linguagem faz. 
		 * Ou seja, tratar um tipo primitivo como objeto. Como se fosse um cast de um tipo para objeto.
		 */		
		Object objetoInt = 10.00;
		/*
		 * Sem o autoboxing, o casting do tipo primitivo para um tipo object precisaria ser feito através
		 * de uma classe wrapper. Essa classe embrulha o tipo primitivo e o passa a tratar como uma referência (um Objetc)
		 */		
		Object objetoIntComWrapper = new Double(10.00);		
		// É possivel, além de embrulhar um tipo primitivo em um tip Object, desembrulhar. Ou seja, deixar de tratá-lo como um Object para tratá-lo como tipo primitivo.		
		Integer integer = new Integer(10);
		int valor = integer.intValue();
		
		/* ###########################
		 * ### CONVERSÃO DE VALORES###
		 * ###########################
		 */
		
		/*
		 * Converter ("parsear") um valor em outro. No exemplo abaixo, utilizamos um  método que existe em todas 
		 * as classes wrapper que recebe uma string por parâmetro e o converte ("parseia") para um tipo primitivo
		 */
		boolean resultado = Boolean.parseBoolean("false");
		
		// Agora para converter tipo primitivo em String, temos o método valueOf de String para essa tarefa
		String numeroEmTexto = String.valueOf(10);
		
		
	}
	
	

}
