package org.example;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;

    protected String adress;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean hasAdress() {
        return !adress.isEmpty();
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder(this.name);
        personBuilder.setName(this.name).setSurname(this.surname);
        return personBuilder;

    }

    @Override
    public String toString() {
        if (age != 0 && !this.adress.isEmpty()) {
            return "Person " + name + " " + surname + " is " + age + " age old and live at " + adress;
        } else {
            return "Person " + name + " " + surname;
        }
    }
}
