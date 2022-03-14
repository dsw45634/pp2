package edu.dsw.pp2.dsw45634.ex_1.zad_6;

class Person {

    private String name;
    private String surname;
    private String telephone;
    private String email;
    private String description;

    private Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.telephone = personBuilder.telephone;
        this.email = personBuilder.email;
        this.description = personBuilder.description;
    }

    static PersonBuilder builder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return String.format("Person: {\n\tname: %s\n\tsurname: %s\n\ttelephone: %s\n\temail: %s\n\tdescription: %s\n}",
                this.name, this.surname, this.telephone, this.email, this.description);
    }

    static class PersonBuilder {

        private String name;
        private String surname;
        private String telephone;
        private String email;
        private String description;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder description(String description) {
            this.description = description;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
