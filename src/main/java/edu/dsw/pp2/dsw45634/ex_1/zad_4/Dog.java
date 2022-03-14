package edu.dsw.pp2.dsw45634.ex_1.zad_4;

class Dog extends Animal {

    @Override
    public String greeting() {
        String greeting = super.greeting();
        return String.format("%s Jestem psem.", greeting);
    }
}
