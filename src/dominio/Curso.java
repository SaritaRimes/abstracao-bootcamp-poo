package dominio;

public class Curso extends Conteudo {
    /* Atributos */
    private int cargaHoraria;

    /* Construtores */
    public Curso() { }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    /* Metodos de acesso */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    /* Metodos uteis */
    @Override
    public String toString() {
        return "Curso {" +
                "titulo = '" + titulo + '\'' +
                ", descricao = '" + descricao + '\'' +
                ", cargaHoraria = " + cargaHoraria +
                " }";
    }

    /* Metodos especificos */
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
