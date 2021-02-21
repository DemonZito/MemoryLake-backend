package com.example.memorylake.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            // Add students here
            Student student = new Student(
              "Test",
              "Test@hotmail.com",
              LocalDate.of(1990,11,3)
            );

            repository.save(student);
        };
    }
}
