public class Esquadrao {	
	String cor;	
	
	@Override
	public String toString() {
		return this.cor; 
	}
	
	// Recebe um object que logo ser� "casteado" para o tipo Esquadrao. Ou seja. esquadrao2 recebe a refer�ncia de mem�ria do obj recebido como argumento
	// Ent�o, por fim, dizemos ao equals() como a copara��o deve ser feita. Comparando "cor" do objeto Esquadrao com cor do objeto Esquadrao2
	@Override
	public boolean equals(Object obj) {
		Esquadrao esquadrao2 = (Esquadrao) obj;
		return this.cor.equals(esquadrao2.cor);
	}

}

