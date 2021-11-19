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

//    List<Persons> findByAgeLessThanOrderByAge(int age);
//
//    Optional<Persons> findByNameAndSurname(String name,String surname);
//
//    List<Persons>findByCity(String city);

    @Query("select p from Persons p where p.city = :city")
    List<Persons> findAllPersonsWithCity_of_living(@Param("city") String city);

    @Query("select p from Persons p where p.age < :age")
    List<Persons> findAllPersonsWhereAgeLess(@Param("age") int age, Sort sort);

    @Query("select p from Persons p where p.name = :name and p.surname = :surname")
    Optional<Persons> findAllPersonsWithNameAndSurname(@Param("name") String name, @Param("surname") String surname);
}