package edu.dsw.pp2.dsw45634.ex_1.zad_5;

class ElectricGuitar extends Guitar {

    String name = "elektryczna gitara";

    @Override
    public String toString() {
        return String.format("ElectricGuitar {name: %s, strings: %d}", this.name, this.numOFStrings);
    }
}
