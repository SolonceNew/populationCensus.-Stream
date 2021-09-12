package com.company.Netology;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private Sex sex;
    private Education education;

    public Person(String name, String surname, Integer age, Sex sex, Education education) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Education getEducation() {
        return education;
    }
    public String toString() {
        return "Person{" +
                "Имя:" + name +
                ", фамилия: " + surname +
                ", возраст: " + age +
                ", пол: " + sex.gender +
                ", образование: " + education.education +
                '}';
    }
}
