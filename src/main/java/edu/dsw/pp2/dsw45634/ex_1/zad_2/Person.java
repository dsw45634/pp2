package edu.dsw.pp2.dsw45634.ex_1.zad_2;

import java.time.LocalDate;

class Person {

    {
        this.bornYear = LocalDate.now().getYear();
    }

    private String name;
    private String surname;
    private int bornYear;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int bornYear) {
        this(name, surname);
        this.bornYear = bornYear;
    }

    @Override
    public String toString() {
        return String.format("Person: {name: %s, surname: %s, born year: %d}", this.name, this.surname, this.bornYear);
    }
}
