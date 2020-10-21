import java.util.ArrayList;

public class Especialidade {
    private String sigla;
    private String descricao;

    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Especialidade(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
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

    public void listarDisciplinas() {
        System.out.println(this.sigla + " - " + this.descricao);
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.toString());
        }
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
}
