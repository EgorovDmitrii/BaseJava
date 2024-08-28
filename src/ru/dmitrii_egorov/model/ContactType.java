package ru.dmitrii_egorov.model;

public enum ContactType {
  PHONE("Тел."),
  MOBILE("Мобильный Тел."),
  HOME_PHOME("Домашний Тел."),
  SKYPE("skype"),
  TELEGRAM("telegram"),
  EMAIL("Почта"),
  LINKEDIN("likedIn"),
  GITHUB("github"),
  STACKOVERFLOW("stackoverFlow"),
  HOME_PAGE("Домашная Страница");

  private final String title;

  ContactType(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }
}
