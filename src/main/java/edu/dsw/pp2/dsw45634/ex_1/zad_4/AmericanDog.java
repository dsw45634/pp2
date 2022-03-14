package edu.dsw.pp2.dsw45634.ex_1.zad_4;

class AmericanDog extends Dog {

    @Override
    public String greeting() {
        String greeting = super.greeting();
        return String.format("Amerykański pies - %s Wow, wow wow...", greeting);
    }
}
