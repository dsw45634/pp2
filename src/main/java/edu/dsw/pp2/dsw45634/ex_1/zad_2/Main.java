package edu.dsw.pp2.dsw45634.ex_1.zad_2;

class Main {
    public static void main(String[] args) {

        Person annaKraus = new Person("Anna", "Kraus");
        Person tomaszRakowski = new Person("Tomasz", "Rakowski", 1965);

        Citizen citizenAnnaKraus = new Citizen("22031354322", annaKraus);
        Citizen citizenTomaszRakowski = new Citizen("65042732355", tomaszRakowski);

        Citizen citizenWieslawSzydlo = new Citizen("22031383216", "Wiesław", "Szydło");
        Citizen citizenKunegundaTomczak = new Citizen("44040420668", "Kunegunda", "Tomczak", 1944);

        System.out.println(annaKraus);
        System.out.println("===========================================================================");
        System.out.println(tomaszRakowski);
        System.out.println("===========================================================================");
        System.out.println(citizenAnnaKraus);
        System.out.println("===========================================================================");
        System.out.println(citizenTomaszRakowski);
        System.out.println("===========================================================================");
        System.out.println(citizenWieslawSzydlo);
        System.out.println("===========================================================================");
        System.out.println(citizenKunegundaTomczak);
    }
}
