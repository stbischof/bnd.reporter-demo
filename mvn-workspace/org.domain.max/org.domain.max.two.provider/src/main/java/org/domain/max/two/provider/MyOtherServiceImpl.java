package org.domain.max.two.provider;

import org.domain.max.two.provider.MyOtherServiceImpl.Config2;
import org.max.api.MyService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Designate(ocd = Config2.class)
@Component(configurationPolicy = ConfigurationPolicy.OPTIONAL)
public class MyOtherServiceImpl implements MyService {

  @ObjectClassDefinition
  public @interface Config2 {

    String prop1();
  }

  @Override
  public void doSomething() {
    // Nothing
  }
}
