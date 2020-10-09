public class Aluno {

	String nome;		
	String dataDeNascimento;	
	Turma turma; // Um atributo pode também ser do tipo de outra classe. 

	public static void main(String[] args) {
		
		// Variáveis dentro de métodos não são reconhecidas como atributos da classe
		// String nome;
		// int idade;
		// String dataDeNascimento;		
	
	}
	
	// Construção de objetos: Nos referenciamos a "instancia" de uma classe o momento em que uma referência em memória é criada para um objeto, ou seja, a materialização de uma classe é criada no programa
	// O "construtor" é um método que é executado toda a vez em que instanciamos um objeto. o comando javap Aluno dentro da pasta bin do projeto mostrará nossa classe Aluno compilada e com o construtor nela, mesmo que vazio
	public Aluno() {		
		System.out.println("Um novo aluno acaba de ser criado!"); // Perceba que essa mensagem será impressa 3 vezes no terminal, pois foram instanciados 3 objetos Alunos neste arquivo.		
	}
	
	public Aluno(Turma turma) {			
		this.turma = turma;		
	}
		
	@Override
	public String toString() {
		return "Oi eu sou o aluno " + this.nome + " da turma " + this.turma + " esquadrão " + this.turma.esquadrao.cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
	
	
}
