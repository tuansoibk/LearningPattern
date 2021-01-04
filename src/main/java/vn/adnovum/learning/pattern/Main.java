package vn.adnovum.learning.pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//    IWriter writer = new YamlWriter();
    IWriter writer = new JsonWriter();
    Processor processor = new Processor(writer);
    List<Clazz> clazzes = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    SchoolData schoolData = new SchoolData(clazzes, students);

    IPostProcessor emailPostProcessor = new SendEmailPostProcessor();
    processor.registerPostProcessor(emailPostProcessor);
    IPostProcessor smsPostProcessor = new SmsNotificationPostProcessor();
    processor.registerPostProcessor(smsPostProcessor);

    processor.process(schoolData);
  }
}
