package com.refactorizando;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.refactorizando.domain.Holiday;
import com.refactorizando.repository.HolidayRepository;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public CommandLineRunner fillHoliday(HolidayRepository repository) {
    return (args) -> {

      Holiday holiday = new Holiday();
      holiday.setDay(LocalDate.now());
      repository.save(holiday);
    };
  }
}
