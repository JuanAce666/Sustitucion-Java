package org.example;

public class Motocicleta extends Vehiculo {

    private int cilindraje;

    public Motocicleta() {
    }

    public Motocicleta(String marca, String modelo, int cilindraje) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
    }

    @Override
    public void conducir(){
        System.out.println("conducioendo una motocicleta de" +this.cilindraje + "sin manos");
    }
}

