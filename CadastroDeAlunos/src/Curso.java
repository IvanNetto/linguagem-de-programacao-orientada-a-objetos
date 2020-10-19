public abstract class Curso {
	
	String sigla;
	String descricao;
	int duracao;
	
	public Curso(String sigla, String descricao, int duracao) {		
		this.sigla = sigla;
		this.descricao = descricao;
		this.duracao = duracao;		
		
		System.out.println("Curso " + this.sigla + " Criado com sucesso!");		
		System.out.println("Descri��o: " + this.descricao);
		System.out.println("Dura��o: " + this.duracao + " meses");

	}


	public String getSigla() {
		return sigla;
	}


	public void setSigla(String sigla) {
		this.sigla = sigla;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getDuracao() {
		return duracao;
	}


	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	

}
