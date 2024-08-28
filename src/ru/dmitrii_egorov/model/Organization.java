package ru.dmitrii_egorov.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;
import ru.dmitrii_egorov.util.DateUtil;

public class Organization {

  private final Link homePage;
  private final JobTitle jobTitle;

  public Organization(final String name, final String url, final JobTitle jobTitle) {
    this(new Link(name, url), jobTitle);

  }

  public Organization(Link homePage, JobTitle jobTitle) {
    this.homePage = homePage;
    this.jobTitle = jobTitle;
  }

  @Override
  public String toString() {
    return "Organization{" +
        "homePage=" + homePage +
        ", jobTitle=" + jobTitle +
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
    Organization that = (Organization) o;
    return Objects.equals(homePage, that.homePage) && Objects.equals(jobTitle,
        that.jobTitle);
  }


  @Override
  public int hashCode() {
    return Objects.hash(homePage, jobTitle);
  }

  public Link getHomePage() {
    return homePage;
  }

  public JobTitle getJobTitle() {
    return jobTitle;
  }

  public static class JobTitle {

    private final LocalDate startDate;
    private final LocalDate endDate;
    private final String nameTitle;
    private final String description;

    public JobTitle(
        final int startYear, final Month startMonth,
        final int endYear, final Month endMonth,
        final String nameTitle, final String description
    ) {
      this(DateUtil.of(startYear, startMonth),
          DateUtil.of(endYear, endMonth), nameTitle, description);
    }

    public JobTitle(
        final int startYear, final Month startMonth,
        final String nameTitle, final String description
    ) {
      this(DateUtil.of(startYear, startMonth),
          DateUtil.NOW, nameTitle, description);
    }

    public JobTitle(LocalDate startDate, LocalDate endDate, String nameTitle, String description) {
      this.startDate = startDate;
      this.endDate = endDate;
      this.nameTitle = nameTitle;
      this.description = description;
    }

    @Override
    public String toString() {
      return "JobTitle{" +
          "startDate=" + startDate +
          ", endDate=" + endDate +
          ", nameTitle='" + nameTitle + '\'' +
          ", description='" + description + '\'' +
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
      JobTitle jobTitle = (JobTitle) o;
      return Objects.equals(startDate, jobTitle.startDate) && Objects.equals(
          endDate, jobTitle.endDate) && Objects.equals(nameTitle, jobTitle.nameTitle)
          && Objects.equals(description, jobTitle.description);
    }

    @Override
    public int hashCode() {
      return Objects.hash(startDate, endDate, nameTitle, description);
    }
  }


}
