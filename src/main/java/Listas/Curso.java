package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }
    private List<Aula> aulas = new ArrayList<>();

//Não permite ações fora do padrão de adição ou remoção
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setAdcAulas(Aula aula){
        this.aulas.add(aula);
    }


}
