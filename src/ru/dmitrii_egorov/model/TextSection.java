package ru.dmitrii_egorov.model;

import java.util.Objects;

public class TextSection extends Section{
  private final String content;

  public TextSection(String content) {
    Objects.requireNonNull(content, "Content mast not be null");
    this.content = content;
  }

  @Override
  public String toString() {
    return "TextSection{content='%s'}".formatted(content);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextSection that = (TextSection) o;
    return Objects.equals(content, that.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  public String getContent() {
    return content;
  }
}
