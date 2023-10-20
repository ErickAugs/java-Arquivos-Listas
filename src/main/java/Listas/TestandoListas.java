package Listas;

import java.util.*;

public class TestandoListas {
    public static void main(String[] args) {

        String carro1 = "Voyage 1.6";
        String carro2 = "Palio Weekden 1.8";
        String carro3 = "AirCross 1.6 - 2011";
        String carro4 = "Amarok";

        List<String> colecaoCarros = new ArrayList<>();
        colecaoCarros.add(carro1);
        colecaoCarros.add(carro2);
        colecaoCarros.add(carro3);
        colecaoCarros.add(carro4);

        //System.out.println(colecaoCarros);

//        colecaoCarros.removeAll(colecaoCarros);
//
//        System.out.println(colecaoCarros);

//        for (String carro: colecaoCarros) {
//         System.out.println(carro);
//        }

        Collections.sort(colecaoCarros);
        System.out.println(colecaoCarros);
    }
}
