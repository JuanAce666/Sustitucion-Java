package org.example;


public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("cualquiera","cualquiera");

        Automovil automovil = new Automovil("Toyota","corolla",4);

        Motocicleta motocicleta = new Motocicleta("pulsar","as",180);

        vehiculo = automovil;
        vehiculo.conducir();

        vehiculo = motocicleta;
        vehiculo.conducir();

    }
}
