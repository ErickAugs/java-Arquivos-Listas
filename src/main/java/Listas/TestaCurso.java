package Listas;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo");

        //javaColecoes.getAulas().add(new Aula("Trabalhando com aulas", 21));

        javaColecoes.setAdcAulas(new Aula("Trabalhando com aulas", 21));

        System.out.println(javaColecoes.getAulas());

    }

}
