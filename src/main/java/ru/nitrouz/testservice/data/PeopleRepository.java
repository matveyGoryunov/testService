package ru.nitrouz.testservice.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepository extends JpaRepository<People, Long> {

    List<People> findAllByAgeBetween(Integer from, Integer to);

}
