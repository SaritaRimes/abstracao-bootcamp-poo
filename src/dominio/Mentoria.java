package dominio;

import java.time.LocalDate;

public class Mentoria {
    /* Atributos */
    private String titulo;
    private String descricao;
    private LocalDate data;

    /* Construtores */
    public Mentoria() { }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    /* Metodos uteis */
    @Override
    public String toString() {
        return "Mentoria {" +
                "titulo = '" + titulo + '\'' +
                ", descricao = '" + descricao + '\'' +
                ", data = " + data +
                " }";
    }
}
