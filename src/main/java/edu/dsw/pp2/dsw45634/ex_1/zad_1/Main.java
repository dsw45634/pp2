package edu.dsw.pp2.dsw45634.ex_1.zad_1;

class Main {

    public static void main(String[] args) {

        Person annaPrzybysz = new Person("Anna", "Przybysz");
        Person dominikJajko = new Person("Dominik", "Jajko", 1990);

        Citizen adamKubala = new Citizen("Adam", "Kubala", 1999, "99020234255");
        Citizen weronikaSzum = new Citizen("Weronika", "Szum", "97051234258");

        System.out.println(annaPrzybysz);
        System.out.println("================================================================");
        System.out.println(dominikJajko);
        System.out.println("================================================================");
        System.out.println(adamKubala);
        System.out.println("================================================================");
        System.out.println(weronikaSzum);
    }
}
