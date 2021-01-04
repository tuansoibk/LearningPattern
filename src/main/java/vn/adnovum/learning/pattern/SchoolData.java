package vn.adnovum.learning.pattern;

import java.util.List;

public class SchoolData {

  private List<Clazz> classes;

  private List<Student> students;

  public SchoolData(List<Clazz> classes, List<Student> students) {
    this.classes = classes;
    this.students = students;
  }
}
