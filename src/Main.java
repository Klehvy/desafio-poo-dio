import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main (String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKleverson = new Dev();
        devKleverson.setNome("Kleverson");
        devKleverson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Kleverson:" + devKleverson.getConteudosInscritos());
        devKleverson.progredir();
        System.out.println(".");
        System.out.println("Conteudos Inscritos Kleverson:" + devKleverson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Kleverson:" + devKleverson.getConteudosConcluidos());
        System.out.println("XP:" + devKleverson.calcularTotalXp());


        System.out.println(".........");


        Dev devKevin = new Dev();
        devKevin.setNome("Kevin");
        devKevin.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Kevin:" + devKevin.getConteudosInscritos());
        devKevin.progredir();
        System.out.println(".");
        System.out.println("Conteudos Inscritos Kevin:" + devKevin.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Kevin:" + devKevin.getConteudosConcluidos());
        System.out.println("XP:" + devKevin.calcularTotalXp());
    }

}

