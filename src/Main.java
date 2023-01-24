import dominio.Curso;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /* Instanciando cursos */
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java iniciante");
        curso1.setDescricao("Curso de Java para iniciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(
            "Curso C# iniciante",
            "Curso de C# para iniciantes",
            8
        );

        System.out.println(curso1);
        System.out.println(curso2);

        /* Instanciando mentorias */
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria(
                "Mentoria C#",
                "Mentoria de C#",
                LocalDate.now()
        );

        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
