package ru.netology.hibernate.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.Persons;
import ru.netology.hibernate.PersonsId;

import java.util.List;
import java.util.Optional;


public interface PersonsRepository extends JpaRepository<Persons,PersonsId> {

    List<Persons> findByAgeLessThanOrderByAge(int age);

    Optional<Persons> findByNameAndSurname(String name,String surname);

    List<Persons>findByCity(String city);
}