package ru.nitrouz.testservice.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class People {

    private @Id @GeneratedValue Long id;
    private String name;
    private Integer age;

    public People() {}

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
