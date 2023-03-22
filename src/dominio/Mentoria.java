package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    /* Atributos */
    private LocalDate data;

    /* Construtores */
    public Mentoria() { }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    /* Metodos de acesso */
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

    /* Metodos especificos */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

}
