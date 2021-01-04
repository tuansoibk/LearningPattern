package vn.adnovum.learning.pattern;

public class JsonWriter implements IWriter {

  @Override
  public void write(SchoolData schoolData) {
    System.out.println("JSON data: " + schoolData);
  }
}
