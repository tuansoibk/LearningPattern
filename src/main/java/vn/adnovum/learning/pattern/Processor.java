package vn.adnovum.learning.pattern;

import java.util.ArrayList;
import java.util.List;

public class Processor {

  private IWriter writer;
  private List<IPostProcessor> postProcessors;

  public Processor(IWriter writer) {
    this.writer = writer;
    postProcessors = new ArrayList<>();
  }

  public void process(SchoolData schoolData) {
    writer.write(schoolData);
    for (IPostProcessor postProcessor : postProcessors) {
      try {
        postProcessor.doPostProcess(schoolData);
      }
      catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }

  public void registerPostProcessor(IPostProcessor postProcessor) {
    postProcessors.add(postProcessor);
  }
}
