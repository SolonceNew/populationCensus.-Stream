package com.company.Netology;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> surnames = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    surnames.get(new Random().nextInt(surnames.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        long count = persons.stream()
                .filter(p -> p.getAge() < 18)
                .count();
        System.out.println("Количество несовершеннолетних: " + count);

        List<String> recruit = persons.stream()
                .filter(r -> r.getAge() >= 18 && r.getAge() < 27)
                .filter(r -> r.getSex().equals(Sex.MAN))
                .map(r -> r.getSurname())
                .collect(Collectors.toList());
        System.out.println("Фамилии лиц, подпадающих под призыв: ");
        for(String recruitPerson : recruit) {
            System.out.println(recruitPerson);
        }

        List<Person> workablePeople = persons.stream()
                .filter(v -> v.getEducation().equals(Education.HIGHER))
                .filter(v ->  v.getAge() > 17)
                .filter(v -> (v.getAge() < 66 && v.getSex().equals(Sex.MAN)) || (v.getAge() < 61 && v.getSex().equals(Sex.WOMEN)))
                .sorted(Comparator.comparing(Person::getSurname))
                .collect(Collectors.toList());
        System.out.println("Работоспособное население: ");
        for(Person workablePerson : workablePeople) {
            System.out.println(workablePerson);
        }
    }
}
