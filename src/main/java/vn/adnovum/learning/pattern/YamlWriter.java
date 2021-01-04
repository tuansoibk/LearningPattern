package vn.adnovum.learning.pattern;

public class YamlWriter implements IWriter {

  @Override
  public void write(SchoolData schoolData) {
    System.out.println("YAML data: " + schoolData);
  }
}
