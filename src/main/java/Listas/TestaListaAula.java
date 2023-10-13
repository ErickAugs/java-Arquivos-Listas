package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class TestaListaAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("Revisando arrays", 15);
        Aula a2 = new Aula("Revisando métodos", 30);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 45);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);

    }
}
