package br.com.eagssin2020.livraria.testes;
import java.io.IOException;
import java.util.Random;

import br.com.eagssin2020.livraria.produtos.Autor;

public class ComparandoReferencias {

	public static void main(String[] args) throws IOException {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Autor autor2 = new Autor();
		autor2.setNome("Rodrigo Turini");
	
		if (autor.equals("Rodrigo")) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}
		

		boolean parseBoolean = Boolean.parseBoolean("false");

		byte parseByte = Byte.parseByte("1");
		short parseShort = Short.parseShort("10");
		int parseInt = Integer.parseInt("10");
		long parseLong = Long.parseLong("10");
		float parseFloat = Float.parseFloat("10.0");
		double parseDouble = Double.parseDouble("10.0");
		
		String numeroEmTexto = String.valueOf(10);
		
	}
}
