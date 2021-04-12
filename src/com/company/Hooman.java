package com.company;

public class Hooman {
    private String name;
    private String city;
    private int age;

    public Hooman (String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String greeting() {
        return String.format("Witaj %s w %s.", name, city);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, City: %s, Age: %d", name, city, age);
    }
}
