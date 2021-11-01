package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.repository.Repository;

import java.util.List;

@RestController
public class DataBaseController {
    private Repository repository;

    public DataBaseController(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    private List<Object> getPersons(@RequestParam String city) {
        return repository.getPersonsByCity(city);
    }
}
