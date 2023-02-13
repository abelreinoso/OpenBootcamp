package com.openbootcamp.ejerciciosTema1;

public class ejercicio1 {
    public static void main(String[] args) {

        // Numericos Enteros

        byte number1 = 1;   // 1 byte
        short number2 = 2;  // 2 byte
        int number3 = 3;    // 4 byte
        long number4 = 4;   // 8 byte

        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + "");

        // Numericos Decimales
        float decimal1 = 4.9f;
        double decimal2 = 9.9d;

        System.out.println(decimal1 + " // " + decimal2 + "");

        // Texto
        char caracter1 = 'a';
        String nombre = "Abel";

        System.out.println(caracter1 + " // " + nombre);

        // booleanos
        boolean verdadero = true;
        boolean falso = false;

        System.out.println(verdadero + " // " + falso);

        // tipos envoltorios
        Integer numero = null;
        Long numero2 = 2L;

        System.out.println(numero + " // " + numero2);

    }
}
