package ru.dmitrii_egorov.model;

import java.util.Objects;

public class Link {
  private final String name;
  private final String url;

  public Link(String name, String url) {
    Objects.requireNonNull(name, "name must not be null");
    this.name = name;
    this.url = url;
  }

  @Override
  public String toString() {
    return "Link{" +
        "name='" + name + '\'' +
        ", url='" + url + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(name, link.name) && Objects.equals(url, link.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  public String getName() {
    return name;
  }

  public String getUrl() {
    return url;
  }
}
