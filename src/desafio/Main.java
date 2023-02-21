package desafio;

import desafio.dominio.Conteudo;
import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda o básico sobre Java.");
        curso1.setCargaHoraria(15);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Aprenda o básico sobre C#.");
        curso2.setCargaHoraria(15);
        System.out.println(curso2);


        //Conteudo conteudo = new Curso();  --> Polimorfismo

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Crie seu portfolio");
        mentoria1.setDescricao("Aprenda a criar seu portfólio para iniciar sua carreira como Dev.");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
    }
}