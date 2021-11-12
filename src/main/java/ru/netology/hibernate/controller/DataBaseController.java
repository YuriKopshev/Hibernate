package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.Persons;
import ru.netology.hibernate.service.PersonService;

import java.util.List;

@RestController
public class DataBaseController {
    private final PersonService service;

    public DataBaseController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    private List<Persons> getPersons(@RequestParam String city) {
        return service.getPersonsByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age")
    private List<Persons> getPersonsByAge(@RequestParam String age) {
        return service.getPersonsByAge(Integer.parseInt(age));
    }

    @GetMapping("/persons/by-name-surname")
    private Persons getPersonsByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return service.getPersonsByNameAndSurname(name, surname);
    }
}
