package org.example;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String adress;
    public PersonBuilder(String name) {
        this.name = name;
    }

    public PersonBuilder setName(String name) {
        boolean hasDigits = false;
        for (int i = 0; i < name.length() && !hasDigits; i++) {
            if(Character.isDigit(name.charAt(i))) {
                hasDigits = true;
            }
        }
        if (hasDigits) {
            throw new IllegalArgumentException("Name can't consist the digits");
        }
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        boolean hasDigits = false;
        for (int i = 0; i < surname.length() && !hasDigits; i++) {
            if(Character.isDigit(surname.charAt(i))) {
                hasDigits = true;
            }
        }
        if (hasDigits) {
            throw new IllegalArgumentException("Surname can't consist the digits");
        }
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age){
        if(age <= 0) {
            throw new IllegalArgumentException("Age must be more than 0");
        }
        this.age = age;
        return this;
    }
    public PersonBuilder setAdress(String adress) {
        this.adress = adress;
        return this;
    }
    public Person build() {
        Person person = new Person(name, surname, age, adress);
        return person;
    }

}
