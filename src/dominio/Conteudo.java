package dominio;

public abstract class Conteudo {
    /* Atributos */
    protected static final double XP_PADRAO = 10d;
    protected String titulo;
    protected String descricao;

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

    /* Metodos especificos */
    public abstract double calcularXp();
}
