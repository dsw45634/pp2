package edu.dsw.pp2.dsw45634.ex_1.zad_4;

class Main {

    public static void main(String[] args) {

        Animal polishDog = new PolishDog();
        Animal americanDog = new AmericanDog();

        Animal raven = new Raven();
        Animal sparrow = new Sparrow();

        System.out.println(polishDog.greeting());
        System.out.println("===============================================================");
        System.out.println(americanDog.greeting());
        System.out.println("===============================================================");
        System.out.println(raven.greeting());
        System.out.println("===============================================================");
        System.out.println(sparrow.greeting());
    }
}
