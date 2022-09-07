package com.example.student.config;

import com.example.student.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student andrey = new Student(
                    "Andrey",
                    //LocalDate.of(1996, Month.SEPTEMBER, 1),
                    LocalDate.of(1996, Month.SEPTEMBER, 1),
                    "andrey@mail.ru");

            Student alex = new Student(
                    "Alex",
                    LocalDate.of(1994, Month.MARCH, 7),
                    "alex@mail.ru");

            repository.saveAll(
                    Arrays.asList(andrey, alex));

        };

    }
}
