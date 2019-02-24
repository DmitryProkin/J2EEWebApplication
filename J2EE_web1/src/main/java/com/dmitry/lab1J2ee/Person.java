package com.dmitry.lab1J2ee;

public class Person {

    private long id;
    private  String secondname;
    private String name;
    private String surname;
    private int age;
    public Person() {
    }


    public Person(long id, String name, String surname, String secondname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.secondname = secondname;
        this.age = age;

    }

    public long getId() {
        return id;
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
    public void setId(long id) {
        this.id = id;
    }
    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "com.dmitry.lab1J2ee.Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }
}