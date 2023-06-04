package org.example;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder("Maria")
                .setName("Maria")
                .setSurname("Di Cavaro")
                .setAge(32)
                .setAdress("12, Lui Sanches str., San Paolo, Brazil")
                .build();
        Person son = mom.newChildBuilder().setName("Antonio").build();
        System.out.println("Mom " + mom + " has the son " + son);
        try {
            new PersonBuilder("Santhiago").build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            new PersonBuilder("Marcus").setAge(20).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}