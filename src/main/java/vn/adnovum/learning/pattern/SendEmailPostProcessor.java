package vn.adnovum.learning.pattern;

public class SendEmailPostProcessor implements IPostProcessor {

  @Override
  public void doPostProcess(SchoolData schoolData) {
    System.out.println("Send email: " + schoolData);
  }
}
