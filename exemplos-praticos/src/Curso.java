import java.util.ArrayList;

public abstract class Curso {
    private String sigla;
    private String descricao;
    private int duracao;
    private String ano;
    private ArrayList<Especialidade> especialidades;

    public Curso(String sigla, String descricao, int duracao, String ano, ArrayList<Especialidade> especialidades ) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.duracao = duracao;
        this.ano = ano;
        this.especialidades = especialidades;

        System.out.println("Curso " + sigla + " criado com sucesso! \n Descrição: " + descricao
                + "\n Duração: " + duracao + "\n Ano: " + ano + "\n");
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
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
