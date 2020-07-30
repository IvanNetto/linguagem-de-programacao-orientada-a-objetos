
public class Processamento {
	
	public static void main(String[] args) {
		
		/*3.2.5 - CONSTRUÇÃO DE OBJETOS*/
		Livro livro1 = new Livro();
		
		/*3.2.6 - PACOTES*/
		Date date1 = new Date();
		java.util.Date date2 = new java.util.Date();		
		
		/*3.2.7 - MÉTODO toString() - SOBRESCRITA*/		
		System.out.println(livro1);
		
		/*3.2.7 - MÉTODO equals()*/
		Autor autor2 = new Autor();
		autor2.setNome("Rodrigo Turini");
		
		Autor autor3 = new Autor();
		autor2.setNome("Rodrigo Turini");
		
		if (autor2 == autor3) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferente");
		}
		
		if (autor2.equals(autor3)) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferente");
		}
		
	/*3.2.8 - WRAPPER DOS TIPOS PRIMITIVOS*/
		
		// Object objeto = new Autor("Rodrigo"); //Só funciona se tiver construtor esperando receber uma String
	       Object objeto1 = "Uma String"; // uma String é um Objeto, por isso compila
		   Object objeto2 = 10; //autoboxing
		   Object objeto3 = new Integer(10); //wrapping
		   Integer integer = new Integer(10);
		   int valor = integer.intValue(); // desembrulhando os valores primiticos das classes wrappers
	}

}
