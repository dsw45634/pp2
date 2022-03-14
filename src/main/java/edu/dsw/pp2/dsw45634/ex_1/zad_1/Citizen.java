package edu.dsw.pp2.dsw45634.ex_1.zad_1;

class Citizen extends Person {

    private String pesel;

    public Citizen(String name, String surname, String pesel) {
        super(name, surname);
        this.pesel = pesel;
    }

    public Citizen(String name, String surname, int bornYear, String pesel) {
        super(name, surname, bornYear);
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        String person = super.toString().replace("Person", "Citizen");
        return String.format("%s, pesel: %s", person, this.pesel);
    }
}
