package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.hibernate.Persons;

import java.util.List;
import java.util.Optional;

public interface PersonsRepository extends JpaRepository<Persons,Integer> {

    List<Persons> findByCity_of_living(String city);

    List<Persons> findByAgeLessThanOrderByAge(int age);

    Optional<Persons>findByNameNotNullAndSurnameNotNull(String name,String surname);
}
