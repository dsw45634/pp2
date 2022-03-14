package edu.dsw.pp2.dsw45634.ex_1.zad_4;

class PolishDog extends Dog {

    @Override
    public String greeting() {
        String greeting = super.greeting();
        return String.format("Polski pies - %s Hau, hau hau...", greeting);
    }
}
