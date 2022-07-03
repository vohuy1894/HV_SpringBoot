package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
			Student john = new Student(1L,"John","john@gmail.com",LocalDate.of(2000,1,1));
            Student mint = new Student(1L,"Mint","Mint@gmail.com",LocalDate.of(1999,1,1));
            studentRepository.saveAll(List.of(john, mint));
        };
    }
}
