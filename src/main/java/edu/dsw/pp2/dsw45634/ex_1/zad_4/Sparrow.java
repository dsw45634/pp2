package edu.dsw.pp2.dsw45634.ex_1.zad_4;

class Sparrow extends Bird {

    @Override
    public String greeting() {
        String greeting = super.greeting();
        return String.format("Wróbel - %s Ćwir, ćwir ćwir...", greeting);
    }
}
