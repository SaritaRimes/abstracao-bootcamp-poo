import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /* Instanciando cursos */
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java iniciante");
        curso1.setDescricao("Curso de Java para iniciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(
            "Curso Java intermediário",
            "Curso de Java intermediário",
            8
        );

//        System.out.println(curso1);
//        System.out.println(curso2);

        /* Instanciando mentorias */
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Conteudo mentoria2 = new Mentoria(
                "Mentoria C#",
                "Mentoria de C#",
                LocalDate.now()
        );

//        System.out.println(mentoria1);
//        System.out.println(mentoria2);

        /* Instanciando Conteudo */
        Conteudo conteudo1 = new Curso();

        // ----------------------------------------------------------

        /* Criando um Bootcamp */
        Bootcamp bootcamp = new Bootcamp("Java Developer", "Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev julia = new Dev("Julia");
        Dev joao = new Dev("João");

        julia.inscreverBootcamp(bootcamp);
        joao.inscreverBootcamp(bootcamp);

        julia.progredir();
        joao.progredir();

        System.out.println("Dev " + julia.getNome() + ":");
        System.out.println("Conteúdos inscritos: " + julia.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + julia.getConteudosConcluidos());
        System.out.println("XP: " + julia.calcularTotalXp());
        System.out.println("---------------------------------");

        System.out.println("Dev " + joao.getNome() + ":");
        System.out.println("Conteúdos inscritos " + joao.getNome() + ": " + joao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + joao.getNome() + ": " + joao.getConteudosConcluidos());
        System.out.println("XP: " + joao.calcularTotalXp());
        System.out.println("---------------------------------");

    }
}
