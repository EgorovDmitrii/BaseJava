package ru.dmitrii_egorov.model;

public enum SectionType {
  PERSONAL("Личные качества"),
  OBJECTIVE("Позития"),
  OCHIVMENT("Достижения"),
  QUALIFICATION("Квалификация"),
  EXPERIANCE("Опыт работы"),
  EDUCATION("Образования");

  private final String title;

  public String getTitle() {
    return title;
  }

  SectionType(String title) {
    this.title = title;
  }
}
