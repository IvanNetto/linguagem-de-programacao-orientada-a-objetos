
public class Autor {

	String nome;
	String email;
	String cpf;	
	
	public static void main(String[] args) {}
	
	// public Autor(String nome) {}
	
	public boolean equals (Object obj) {
		Autor outro = (Autor) obj;
		return this.nome.equals(outro.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
