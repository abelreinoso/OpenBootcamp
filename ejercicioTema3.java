package com.openbootcamp.ejerciciosTema3;

public class ejercicioTema3 {

    public static void main(String[] args) {

        String[] nombres = {"Abel", "Julian", "Violeta", "Julio"};
        String cnt = "";
        for (String nombre : nombres) {
            cnt += nombre + " ";
//            System.out.println(cnt);
        }
        System.out.println(cnt);
    }
}
