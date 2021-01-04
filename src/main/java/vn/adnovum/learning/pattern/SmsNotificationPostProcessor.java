package vn.adnovum.learning.pattern;

public class SmsNotificationPostProcessor implements IPostProcessor {

  @Override
  public void doPostProcess(SchoolData schoolData) {
    System.out.println("Send SMS: " + schoolData);
  }
}
