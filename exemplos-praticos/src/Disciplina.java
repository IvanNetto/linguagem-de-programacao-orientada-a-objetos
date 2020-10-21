public class Disciplina {
    private String sigla;
    private String descricao;
    private int cargaHoraria;

    public Disciplina(String sigla, String descricao, int cargaHoraria) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return this.sigla + " - " + this.descricao;
    }
}
