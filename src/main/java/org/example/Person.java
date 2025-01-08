package org.example;

import java.util.Arrays;

public class Person{
    String firstName;
    String lastName;
    int age;
    String location;
    String[] languages;
    boolean isBald;
/*------------------*    CONSTRUCTORS    *-------------------*/
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String[] languages, String location, boolean isBald) {
        this.location = location;
        this.languages = languages;
        this.isBald = isBald;
    }

    public Person(String lastName, String firstName, int age, String location) {
        this(lastName, firstName, age);
        this.location = location;
    }


    public Person(String firstName) {
        this.firstName = firstName;
    }
    public Person(String[] languages) {
        this.languages = languages;
    }

    public Person(boolean isBald, String[] languages, String location, int age, String lastName, String firstName) {
        this.isBald = isBald;
        this.languages = languages;
        this.location = location;
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person() {}
    /*------------------*    METHODS    *-------------------*/
    public String getFirstName() {
        return firstName;
    }

    public String getLastName ( ) {
        return lastName;
    }

    public int getAge () {
        return age;
    }

    public boolean isTeen() {
        if (age >= 13 && age <=19) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Person info: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", languages=" + Arrays.toString(languages) +
                ", isBald=" + isBald;

    }
}

