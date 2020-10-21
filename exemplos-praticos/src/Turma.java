public class Turma {
    private String nome;
    private String dataFormatura;

    public Turma(String nome, String dataFormatura) {
        this.nome = nome;
        this.dataFormatura = dataFormatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFormatura() {
        return dataFormatura;
    }

    public void setDataFormatura(String dataFormatura) {
        this.dataFormatura = dataFormatura;
    }
}
