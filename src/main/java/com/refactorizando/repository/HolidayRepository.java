package com.refactorizando.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.refactorizando.domain.Holiday;

@Repository
public interface HolidayRepository extends JpaRepository<Holiday, Long> {

}
