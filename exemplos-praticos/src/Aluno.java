public class Aluno {

	String nome;
	int idade;
	String dataDeAniversario;
	Armario armario; // Um atributo pode também ser do tipo de outra classe. 

	public static void main(String[] args) {
		
		// Variáveis dentro de métodos não são reconhecidas como atributos da classe
		String nome;
		int idade;
		String dataDeAniversario;
		
		Aluno alunoBizurado = new Aluno(); // A variável alunoBizurado possui um tipo igual as demais variáveis. Esse tipo diz que "alunoBiruzado" é um "Aluno"
		
		// A variável alunoBizurado não armazena o valor de "nome", "idade" ou "dataDeAniversario", ela armazena uma referência a esses atributos. Dessa forma, os atributos de classe
		// são procurados no momento em que digitamos o ponto (.)
		
		alunoBizurado.nome = "Everton Ribeiro do Flamengo";
		alunoBizurado.idade = 34;
		alunoBizurado.dataDeAniversario = "15/01/1986";
		
		// Toda vez que um objeto é instanciado, uma nova referência é criada para ele. Ou seja, um novo endereço de memória. Dessa forma, mesmo que os valores
		// dos atributos sejam os mesmos, o objeto nunca será o mesmo.
		Aluno alunoEnrolado = new Aluno();
		
		alunoEnrolado.nome = "Everton Ribeiro do Flamengo";
		alunoEnrolado.idade = 34;
		alunoEnrolado.dataDeAniversario = "15/01/1986";
		
		// Quando estamos comparando objetos utilizando o == estamos comparando os endereços de memória, que logicamente, são diferentes, pois são objetos (variáveis) diferentes
		if (alunoBizurado == alunoEnrolado) {
			System.out.println("Iguais, mesmo aluno!");
		} else {
			System.out.println("Hein?! Por que diferentes?");
		}
		
		//Uma classe pode conter um atributo que remete a outra classe, como é o caso de Armário. Entende-se então que "Aluno" tem um "Armario".
		//Para entendermos como as referências podem ser manipuladas nesse caso, observe abaixo:
		Armario armario39 = new Armario();
		armario39.corredor = "5B";
		
		Aluno alunoPerdidao = new Aluno();
		alunoPerdidao.armario = armario39;
		
		alunoPerdidao.armario.corredor = "1B";
		
		// Será impresso "1B". Na linha 45 estamos fazendo uma cópia da referência do objeto armario39 para o atributo "armario" de "alunoPerdidao".
		System.out.println(armario39.corredor);
		

	}

}
