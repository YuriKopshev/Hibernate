package ru.netology.hibernate;



import java.io.Serializable;
import java.util.Objects;


public class PersonsId implements Serializable {
    private final int id;
    private final String name;
    private final String surname;

    public PersonsId(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonsId personsId = (PersonsId) o;
        return id == personsId.id && name.equals(personsId.name) && surname.equals(personsId.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }
}
