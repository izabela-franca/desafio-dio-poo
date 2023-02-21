package desafio;

import desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda o básico sobre Java.");
        curso1.setCargaHoraria(15);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Aprenda o básico sobre C#.");
        curso2.setCargaHoraria(15);
        //System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Crie seu portfolio");
        mentoria1.setDescricao("Aprenda a criar seu portfólio para iniciar sua carreira como Dev.");
        mentoria1.setData(LocalDate.now());
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Do zero ao avançado em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devIzabela = new Dev();
        devIzabela.setNome("Izabela");
        devIzabela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Izabela: " + devIzabela.getConteudosInscritos());
        devIzabela.progredir();
        devIzabela.progredir();
        System.out.println("Conteúdos concluídos Izabela: " + devIzabela.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Izabela: " + devIzabela.getConteudosInscritos());
        System.out.println("XP: " + devIzabela.calcularTotalXP());

        System.out.println("-----------------------------------");

        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Diego: " + devDiego.getConteudosInscritos());
        devDiego.progredir();
        System.out.println("Conteúdos concluídos Diego: " + devDiego.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Izabela: " + devIzabela.getConteudosInscritos());
        System.out.println("XP: " + devDiego.calcularTotalXP());
    }
}