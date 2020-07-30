
public class Livro {
	
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;	
	
	//construtor
	public Livro() {
		System.out.println("novo livro criado!");
	}
	
	public static void main(String[] args) {}
	
	// sobrescrita do método toString
	@Override
	public String toString() {
		
		return "Eu sou um Ebook";
		
	}
	
}

