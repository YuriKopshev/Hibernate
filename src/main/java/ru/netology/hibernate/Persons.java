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
@IdClass(PersonsId.class)
public class Persons implements Serializable {

    @Id
    private int id;

    @Id
    private String name;

    @Id
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column
    private int phone_number;

    @Column
    private String city;

}

