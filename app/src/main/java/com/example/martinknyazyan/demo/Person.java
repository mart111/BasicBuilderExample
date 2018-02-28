package com.example.martinknyazyan.demo;

/**
 * Created by martinknyazyan on 2/28/18.
 */

public class Person {

    private String name;
    private String surname;

    public Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public static class Builder {

        private String name;
        private String surname;

        public Builder() {
        }


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
