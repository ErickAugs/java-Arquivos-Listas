package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo");

        //javaColecoes.getAulas().add(new Aula("Trabalhando com aulas", 21));

        javaColecoes.setAdcAulas(new Aula("Trabalhando com aulas", 21));
        javaColecoes.setAdcAulas(new Aula("Trabalhando com Collections", 10));
        javaColecoes.setAdcAulas(new Aula("Trabalhando com list<>", 19));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);

        System.out.println(aulas);

        System.out.println(javaColecoes.getTotalTempo());

    }

}
