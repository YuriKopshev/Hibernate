package ru.netology.hibernate.repository;

import org.springframework.stereotype.Component;
import ru.netology.hibernate.Persons;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private EntityManager manager;

    public List<Object> getPersonsByCity(String city) {
        Query query = manager.createQuery("select p from Persons p where p.city_of_living = :city_of_living", Persons.class);
        query.setParameter("city_of_living", city);
        return query.getResultList();
    }
}
