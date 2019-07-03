package examples.x;

import org.max.api.MyService;
import org.osgi.service.component.annotations.Reference;

/**
 * ${snippet parentGroup=print, includeDeclaration=false, title=Using the MyService,
 * description="Seleucia opus Seleuci regis, et Claudiopolis quam deduxit coloniam Claudius
 * Caesar."}
 */
public class MyExample1 {

  @Reference
  private MyService myService;

  public void myMethod() {
    myService.doSomething();
  }
}
