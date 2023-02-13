package com.openbootcamp.ejerciciosTema2;

import java.util.Scanner;

public class ejercicioTema2 {
    public static void main(String[] args) {

//        METODO 1
        double precio1 = calcularIva1(500, 21);
        System.out.println("El total es: " + precio1);


//        METODO 2
        double precio2 = calcularIva2();
    }


//        METODO 1
    static double calcularIva1(double price, double iva) {
        double totalIva = price * (iva / 100);
        return price + totalIva;
    }


    //        METODO 2
    public static double calcularIva2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        double price =  scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de IVA: ");
        double porcentajeIva = scanner.nextDouble();

        double totalIva = price * (porcentajeIva / 100);
        System.out.println("El IVA es: $" + totalIva);

        double totalPrecio = price + totalIva;
        System.out.println("El precio total es: $" + totalPrecio);
        return totalPrecio;
    }
}

