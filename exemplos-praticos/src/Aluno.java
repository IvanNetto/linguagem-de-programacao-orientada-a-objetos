public class Aluno {

	String nome;
	int idade;
	String dataDeAniversario;
	Armario armario; // Um atributo pode tamb�m ser do tipo de outra classe. 

	public static void main(String[] args) {
		
		// Vari�veis dentro de m�todos n�o s�o reconhecidas como atributos da classe
		String nome;
		int idade;
		String dataDeAniversario;
		
		Aluno alunoBizurado = new Aluno(); // A vari�vel alunoBizurado possui um tipo igual as demais vari�veis. Esse tipo diz que "alunoBiruzado" � um "Aluno"
		
		// A vari�vel alunoBizurado n�o armazena o valor de "nome", "idade" ou "dataDeAniversario", ela armazena uma refer�ncia a esses atributos. Dessa forma, os atributos de classe
		// s�o procurados no momento em que digitamos o ponto (.)
		
		alunoBizurado.nome = "Everton Ribeiro do Flamengo";
		alunoBizurado.idade = 34;
		alunoBizurado.dataDeAniversario = "15/01/1986";
		
		// Toda vez que um objeto � instanciado, uma nova refer�ncia � criada para ele. Ou seja, um novo endere�o de mem�ria. Dessa forma, mesmo que os valores
		// dos atributos sejam os mesmos, o objeto nunca ser� o mesmo.
		Aluno alunoEnrolado = new Aluno();
		
		alunoEnrolado.nome = "Everton Ribeiro do Flamengo";
		alunoEnrolado.idade = 34;
		alunoEnrolado.dataDeAniversario = "15/01/1986";
		
		// Quando estamos comparando objetos utilizando o == estamos comparando os endere�os de mem�ria, que logicamente, s�o diferentes, pois s�o objetos (vari�veis) diferentes
		if (alunoBizurado == alunoEnrolado) {
			System.out.println("Iguais, mesmo aluno!");
		} else {
			System.out.println("Hein?! Por que diferentes?");
		}
		
		//Uma classe pode conter um atributo que remete a outra classe, como � o caso de Arm�rio. Entende-se ent�o que "Aluno" tem um "Armario".
		//Para entendermos como as refer�ncias podem ser manipuladas nesse caso, observe abaixo:
		Armario armario39 = new Armario();
		armario39.corredor = "5B";
		
		Aluno alunoPerdidao = new Aluno();
		alunoPerdidao.armario = armario39;
		
		alunoPerdidao.armario.corredor = "1B";
		
		// Ser� impresso "1B". Na linha 45 estamos fazendo uma c�pia da refer�ncia do objeto armario39 para o atributo "armario" de "alunoPerdidao".
		System.out.println(armario39.corredor);
		

	}

}
