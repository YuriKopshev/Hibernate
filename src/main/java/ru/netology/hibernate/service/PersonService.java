package ru.netology.hibernate.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.netology.hibernate.Persons;
import ru.netology.hibernate.repository.PersonsRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PersonService {
    private final PersonsRepository repository;

    public PersonService(PersonsRepository repository) {
        this.repository = repository;
    }

    public List<Persons> getPersonsByCityOfLiving(String city) {
        return repository.findByCity(city);
    }

    public List<Persons> getPersonsByAge(int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Persons getPersonsByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname).
                orElseThrow(() -> new EntityNotFoundException("Persons with " + name + " and " + surname + " not found!"));
    }

}
