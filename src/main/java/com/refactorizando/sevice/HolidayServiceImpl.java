package com.refactorizando.sevice;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.refactorizando.domain.Holiday;
import com.refactorizando.repository.HolidayRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Service
public class HolidayServiceImpl implements HolidayService {

  private final HolidayRepository holidayRepository;


  @Cacheable("holidays")
  public List<Holiday> findAll() {
    return holidayRepository.findAll();
  }
}