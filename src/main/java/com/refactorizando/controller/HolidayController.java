package com.refactorizando.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.refactorizando.domain.Holiday;
import com.refactorizando.sevice.HolidayService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HolidayController {

  private final HolidayService holidayService;

  @GetMapping
  public ResponseEntity<List<Holiday>> getHolidays() {

    return new ResponseEntity<>(holidayService.findAll(), HttpStatus.OK);
  }
}
