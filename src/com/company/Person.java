package com.company;

public class Person {
//    in order to use this. we have to declare the variables at the beginning of the class.
    private final String firstName;
    private final String surname;

//    create method to return full name

    public String fullName(String firstName, String surname) {
        return firstName + " " + surname;

    }
//    Create a constructor to feed in the information above to create the instance and because its creating the object (instance) of the person class, it has the same name as the class.
    public Person(String firstName, String surname){
        this.firstName = firstName;
        this.surname = surname;
        String fullName = fullName(firstName, surname);

    }


}
