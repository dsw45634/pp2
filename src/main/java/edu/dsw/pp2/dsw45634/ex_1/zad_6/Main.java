package edu.dsw.pp2.dsw45634.ex_1.zad_6;

class Main {
    public static void main(String[] args) {

        Person jamesBond = Person.builder()
                .name("James")
                .surname("Bond")
                .email("007@sis.gov.uk")
                .telephone("501-007-007")
                .description("agent do zadań specjalnych")
                .build();

        System.out.println(jamesBond);
    }
}
