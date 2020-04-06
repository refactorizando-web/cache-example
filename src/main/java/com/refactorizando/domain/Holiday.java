package com.refactorizando.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Holiday {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private LocalDate day;

}
