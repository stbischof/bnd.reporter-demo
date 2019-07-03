package org.domain.max.one.provider;

import org.domain.max.one.provider.MyServiceImpl2.Config;
import org.max.api.MyService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Designate(ocd = Config.class, factory = true)
@Component(name = "org.domain.max.one.basic", immediate = true,
    configurationPolicy = ConfigurationPolicy.OPTIONAL)
public class MyServiceImpl2 implements MyService {

  public enum Opt {
    ONE, TWO
  }

  @ObjectClassDefinition
  public @interface Config {

    @AttributeDefinition(min = "0", max = "45")
    int prop1() default 4;

    @AttributeDefinition(required = false)
    String prop2();

    @AttributeDefinition(name = "Et hanc quidem",
        description = "Et est admodum mirum videre plebem innumeram mentibus ardore quodam infuso cum dimicationum")
    Opt prop3();
  }

  @Override
  public void doSomething() {
    // Nothing
  }
}
