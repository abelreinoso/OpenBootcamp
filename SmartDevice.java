package com.openbootcamp.Ejercitacion.ejerciciosTema4;

public class SmartDevice {
    String marca;
    String modelo;
    String color;

    public SmartDevice() {}
    public SmartDevice(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public static class SmartPhone extends SmartDevice {
        String sisOp;
        int ram;
        boolean nfc;

        public SmartPhone(){}
        public SmartPhone(String marca, String modelo, String color, String sisOp, int ram, boolean nfc) {
            super(marca, modelo, color);
            this.sisOp = sisOp;
            this.ram = ram;
            this.nfc = nfc;
        }
        @Override
        public String toString() {
            return "SmartPhone{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    ", sisOp='" + sisOp + '\'' +
                    ", ram=" + ram +
                    ", nfc=" + nfc +
                    '}';
        }
    }

    public static class SmartWatch extends SmartDevice {
        String conectividad;
        double pulgadas;
        boolean sumergible;

        public SmartWatch() {}
        public SmartWatch(String marca, String modelo, String color, String conectividad, double pulgadas, boolean sumergible) {
            super(marca, modelo, color);
            this.conectividad = conectividad;
            this.pulgadas = pulgadas;
            this.sumergible = sumergible;
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    ", conectividad='" + conectividad + '\'' +
                    ", pulgadas=" + pulgadas +
                    ", sumergible=" + sumergible +
                    '}';
        }
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Motorola", "Edge 30", "Gris", "Android", 6, true);
        SmartWatch smartWatch = new SmartWatch("Samsung", "Galaxy Watch4", "Blanco", "Bluetooth", 1.2, true);
        System.out.println(smartPhone);
        System.out.println(smartWatch);
    }
}
