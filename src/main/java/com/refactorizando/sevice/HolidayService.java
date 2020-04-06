package com.refactorizando.sevice;

import java.util.List;

import com.refactorizando.domain.Holiday;

public interface HolidayService {

  List<Holiday> findAll();
}
