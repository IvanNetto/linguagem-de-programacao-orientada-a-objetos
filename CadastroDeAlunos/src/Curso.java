public abstract class Curso {
	
	String sigla;
	String descricao;
	int duracao;
	
	public Curso(String sigla, String descricao, int duracao) {		
		this.sigla = sigla;
		this.descricao = descricao;
		this.duracao = duracao;		
		
		System.out.println("Curso " + this.sigla + " Criado com sucesso!");		
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Duração: " + this.duracao + " meses");

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
