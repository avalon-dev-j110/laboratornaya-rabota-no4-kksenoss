/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import java.time.LocalDate;

/**
 *
 * @author 1
 */
public class implPerson implements Person{
    private String name;
    private LocalDate birthDate;



    @Override
    public String toString() {

        return "Persons{" +
                "name='" + name + '\'' +
                ", birthDate: " + birthDate +
                '}';
    }

    public implPerson(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    @Override
    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Object o) {
        implPerson persons = (implPerson) o;
        if (name.compareTo(persons.name) == 0) {
            return birthDate.compareTo(persons.birthDate);
        }
        return name.compareTo(persons.name);
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }
}