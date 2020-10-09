
public class Cadastro {

	public static void main(String[] args) {

		// A vari�vel alunoBizurado possui um tipo igual as demais vari�veis. Esse tipo diz que "alunoBiruzado" � um "Aluno"
		Aluno alunoBizurado = new Aluno(); 

		
		/* #################################################
		 * ### COMPARANDO OBJETOS POR ENDERE�O DE MEM�RIA###
		 * #################################################
		 */ 
		/*
		 * A vari�vel alunoBizurado n�o armazena o valor de "nome", "idade" ou
		 * "dataDeNascimento", ela armazena uma refer�ncia a esses atributos. Dessa
		 * forma, os atributos de classe s�o procurados no momento em que digitamos o
		 * ponto (.)
		 */
		alunoBizurado.nome = "Everton Ribeiro do Flamengo";
		alunoBizurado.dataDeNascimento = "15/01/1986";

		/*
		 * Toda vez que um objeto � instanciado, uma nova refer�ncia � criada para ele.
		 * Ou seja, um novo endere�o de mem�ria. Dessa forma, mesmo que os valores dos
		 * atributos sejam os mesmos, o objeto nunca ser� o mesmo.
		 */
		
		Aluno alunoEnrolado = new Aluno();
		alunoEnrolado.nome = "Everton Ribeiro do Flamengo";
		alunoEnrolado.dataDeNascimento = "15/01/1986";
				
		/*
		 * Quando estamos comparando objetos utilizando o == estamos comparando os
		 * endere�os de mem�ria, que logicamente, s�o diferentes, pois s�o objetos
		 * (vari�veis) diferentes
		 */
		
		if (alunoBizurado == alunoEnrolado) {
			System.out.println("Iguais, mesmo aluno!");
		} else {
			System.out.println("Hein?! Por que diferentes?");
		}

		
		/* #######################################################################
		 * ### USANDO A ASSOCIA��O POR AGREGA��O ENTENDER REFER�NCIAS A OBJETOS###
		 * #######################################################################
		 */ 		
		
		/*
		 * Uma classe pode conter um atributo que remete a outra classe, como � o caso
		 * de Turma na classe Aluno e Esquadr�o na classe Turma. Entende-se ent�o que
		 * "Aluno" tem uma "Turma" e "Turma" tem um "Esquadrao". Associa��es por
		 * Agrega��o Para entendermos como as refer�ncias podem ser manipuladas nesse
		 * caso, observe abaixo:
		 * 
		 */
		Esquadrao esquadrao = new Esquadrao();
		esquadrao.cor = "Prata";
		Turma turma = new Turma();
		turma.esquadrao = esquadrao;
		turma.esquadrao.cor = "Azul";
		// Ser� impresso "C". Na linha 45 estamos fazendo uma c�pia da refer�ncia do
		// objeto armario2B para o atributo "armario" de "alunoPerdidao".
		System.out.println(esquadrao.cor);
        
		
		/* #########################################################################
		 * ### USANDO SOBRESCRITA DO M�TODO OBJECT EQUALS() PARA COMPARAR OBJETOS###
		 * #########################################################################
		 */ 
		
		Esquadrao esquadrao2 = new Esquadrao();
		esquadrao2.cor = "Prata";
		
		//Comparando refer�ncia com ==. Essa compara��o se d� atrav�s da leitura do endere�o de mem�ra de cada objeto.
		if (esquadrao == turma.esquadrao) {			
			System.out.println("� igual");
		}
		// O equals() usa o == para a compara��o. Nesse caso, estamos comparando as refer�ncias de mem�ria dos objetos tamb�m
		if (esquadrao.equals(turma.esquadrao)) {			
			System.out.println("� igual");
		}
		// Nesse caso, n�o h� equival�ncia de endere�o de mem�ria dos objetos. O equals n�o sabe como deve ser feita essa compara��o de valores, ele s� reconhece refer�ncia.
		// � preciso ent�o sobrescrever o m�todo equals() para dizer como dever� ser feita essa compara��o
		if (esquadrao.equals(esquadrao2)) {			
			System.out.println("� igual");
		}else {
			System.out.println("� diferente");
		}		
		
		
		/* ##########################################################
		 * ### USANDO CONSTRUTOR PARA IMPRIMIR OBJETOS COMO STRING###
		 * ##########################################################
		 */ 
		
		/*
		 * Esquadrao esquadrao = new Esquadrao(); esquadrao.setCor("Prata");
		 * 
		 * Turma turma = new Turma(esquadrao); turma.setEsquadrao(esquadrao);
		 * turma.setNome("Chivunk");
		 * 
		 * 
		 * Aluno aluno = new Aluno(); aluno.setNome("Ivan Netto"); aluno.turma = turma;
		 * 
		 * System.out.println(aluno.toString());
		 */
		
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
		
		
		
	}

}
