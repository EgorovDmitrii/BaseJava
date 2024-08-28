package ru.dmitrii_egorov.util;

import java.time.LocalDate;
import java.time.Month;

public class DateUtil {

  public static final LocalDate NOW = LocalDate.of(3000, Month.SEPTEMBER, 3);
  public static LocalDate of(int year, Month month){
    return LocalDate.of(year, month, 1);

  }
}
