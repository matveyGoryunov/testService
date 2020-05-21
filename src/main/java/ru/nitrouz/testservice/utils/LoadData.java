package ru.nitrouz.testservice.utils;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.nitrouz.testservice.data.PeopleRepository;
import ru.nitrouz.testservice.data.People;

@Configuration
@Slf4j
public class LoadData {
    @Bean
    CommandLineRunner initDatabase(PeopleRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new People("Павел", 25)));
            log.info("Preloading " + repository.save(new People("Дарья", 17)));
            log.info("Preloading " + repository.save(new People("Иван", 26)));
            log.info("Preloading " + repository.save(new People("Андрей", 30)));
            log.info("Preloading " + repository.save(new People("Сергей", 40)));
            log.info("Preloading " + repository.save(new People("Михаил", 15)));
            log.info("Preloading " + repository.save(new People("Анна", 20)));
            log.info("Preloading " + repository.save(new People("Юлия", 34)));
            log.info("Preloading " + repository.save(new People("Александр", 16)));
            log.info("Preloading " + repository.save(new People("Кристина", 19)));
            log.info("Preloading " + repository.save(new People("Степан", 45)));
            log.info("Preloading " + repository.save(new People("Кузьма", 60)));
            log.info("Preloading " + repository.save(new People("Алена", 38)));
            log.info("Preloading " + repository.save(new People("Евгений", 11)));
        };
    }
}