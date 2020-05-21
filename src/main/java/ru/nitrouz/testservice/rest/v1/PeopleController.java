package ru.nitrouz.testservice.rest.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.nitrouz.testservice.data.People;
import ru.nitrouz.testservice.data.PeopleRepository;
import ru.nitrouz.testservice.exceptions.PeopleNotFoundException;

import java.util.List;

@RestController
public class PeopleController {

    private final PeopleRepository repository;

    PeopleController(PeopleRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/v1/people")
    List<People> all(@RequestParam(value = "ageMin", required = false, defaultValue = "0") Integer ageMin, @RequestParam(value = "ageMax", required = false, defaultValue = "999") Integer ageMax) {
        return repository.findAllByAgeBetween(ageMin,ageMax);
    }

    @GetMapping("/api/v1/people/{id}")
    People one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new PeopleNotFoundException(id));
    }

}
