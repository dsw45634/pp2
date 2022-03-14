package edu.dsw.pp2.dsw45634.ex_1.zad_5;

class Guitar {

    String name = "gitara";
    int numOFStrings = 6;

    @Override
    public String toString() {
        return String.format("Guitar {name: %s, strings: %d }", this.name, this.numOFStrings);
    }
}
