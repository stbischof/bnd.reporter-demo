package org.domain.max.two.provider;

import org.max.api.MyService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

@Component(configurationPolicy = ConfigurationPolicy.IGNORE)
public class MyOtherServiceImpl2 implements MyService {

  @Override
  public void doSomething() {
    // Nothing
  }
}
