package edu.dsw.pp2.dsw45634.ex_1.zad_2;

public class Citizen {

    private String pesel;
    private Person person;

    public Citizen(String pesel, Person person) {
        this.pesel = pesel;
        this.person = person;
    }

    // wywoływanie konstruktorów w konstruktorze raczej nie jest dobrą praktyką
    public Citizen(String pesel, String name, String surname) {
        this.pesel = pesel;
        this.person = new Person(name, surname);
    }

    // wywoływanie konstruktorów w konstruktorze raczej nie jest dobrą praktyką
    public Citizen(String pesel, String name, String surname, int bornYear) {
        this.pesel = pesel;
        this.person = new Person(name, surname, bornYear);
    }

    @Override
    public String toString() {
        String person = this.person.toString().replace("Person", "person");
        return String.format("Citizen: {pesel: %s, %s}", this.pesel, person);
    }
}
