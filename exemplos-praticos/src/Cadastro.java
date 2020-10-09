
public class Cadastro {

	public static void main(String[] args) {

		// A variável alunoBizurado possui um tipo igual as demais variáveis. Esse tipo diz que "alunoBiruzado" é um "Aluno"
		Aluno alunoBizurado = new Aluno(); 

		
		/* #################################################
		 * ### COMPARANDO OBJETOS POR ENDEREÇO DE MEMÓRIA###
		 * #################################################
		 */ 
		/*
		 * A variável alunoBizurado não armazena o valor de "nome", "idade" ou
		 * "dataDeNascimento", ela armazena uma referência a esses atributos. Dessa
		 * forma, os atributos de classe são procurados no momento em que digitamos o
		 * ponto (.)
		 */
		alunoBizurado.nome = "Everton Ribeiro do Flamengo";
		alunoBizurado.dataDeNascimento = "15/01/1986";

		/*
		 * Toda vez que um objeto é instanciado, uma nova referência é criada para ele.
		 * Ou seja, um novo endereço de memória. Dessa forma, mesmo que os valores dos
		 * atributos sejam os mesmos, o objeto nunca será o mesmo.
		 */
		
		Aluno alunoEnrolado = new Aluno();
		alunoEnrolado.nome = "Everton Ribeiro do Flamengo";
		alunoEnrolado.dataDeNascimento = "15/01/1986";
				
		/*
		 * Quando estamos comparando objetos utilizando o == estamos comparando os
		 * endereços de memória, que logicamente, são diferentes, pois são objetos
		 * (variáveis) diferentes
		 */
		
		if (alunoBizurado == alunoEnrolado) {
			System.out.println("Iguais, mesmo aluno!");
		} else {
			System.out.println("Hein?! Por que diferentes?");
		}

		
		/* #######################################################################
		 * ### USANDO A ASSOCIAÇÃO POR AGREGAÇÃO ENTENDER REFERÊNCIAS A OBJETOS###
		 * #######################################################################
		 */ 		
		
		/*
		 * Uma classe pode conter um atributo que remete a outra classe, como é o caso
		 * de Turma na classe Aluno e Esquadrão na classe Turma. Entende-se então que
		 * "Aluno" tem uma "Turma" e "Turma" tem um "Esquadrao". Associações por
		 * Agregação Para entendermos como as referências podem ser manipuladas nesse
		 * caso, observe abaixo:
		 * 
		 */
		Esquadrao esquadrao = new Esquadrao();
		esquadrao.cor = "Prata";
		Turma turma = new Turma();
		turma.esquadrao = esquadrao;
		turma.esquadrao.cor = "Azul";
		// Será impresso "C". Na linha 45 estamos fazendo uma cópia da referência do
		// objeto armario2B para o atributo "armario" de "alunoPerdidao".
		System.out.println(esquadrao.cor);
        
		
		/* #########################################################################
		 * ### USANDO SOBRESCRITA DO MÉTODO OBJECT EQUALS() PARA COMPARAR OBJETOS###
		 * #########################################################################
		 */ 
		
		Esquadrao esquadrao2 = new Esquadrao();
		esquadrao2.cor = "Prata";
		
		//Comparando referência com ==. Essa comparação se dá através da leitura do endereço de memóra de cada objeto.
		if (esquadrao == turma.esquadrao) {			
			System.out.println("é igual");
		}
		// O equals() usa o == para a comparação. Nesse caso, estamos comparando as referências de memória dos objetos também
		if (esquadrao.equals(turma.esquadrao)) {			
			System.out.println("é igual");
		}
		// Nesse caso, não há equivalência de endereço de memória dos objetos. O equals não sabe como deve ser feita essa comparação de valores, ele só reconhece referência.
		// É preciso então sobrescrever o método equals() para dizer como deverá ser feita essa comparação
		if (esquadrao.equals(esquadrao2)) {			
			System.out.println("é igual");
		}else {
			System.out.println("é diferente");
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
		
		
		
	}

}
