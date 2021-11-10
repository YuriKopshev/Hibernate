package ru.netology.hibernate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persons implements Serializable {

    @Id
    private int id;

    @Id
    @Column(name = "NAME",nullable = false)
    private String name;

    @Id
    @Column(name = "SURNAME",nullable = false)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column
    private int phone_number;

    @Column
    private String city_of_living;
}

