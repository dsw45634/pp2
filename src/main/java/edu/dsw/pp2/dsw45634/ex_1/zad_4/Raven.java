package edu.dsw.pp2.dsw45634.ex_1.zad_4;

class Raven extends Bird {

    @Override
    public String greeting() {
        String greeting = super.greeting();
        return String.format("Kruk - %s Kra, kra kra...", greeting);
    }
}
