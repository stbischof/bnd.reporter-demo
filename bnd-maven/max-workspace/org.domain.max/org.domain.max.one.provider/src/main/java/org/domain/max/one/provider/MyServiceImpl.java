package org.domain.max.one.provider;

import org.max.api.MyService;
import org.osgi.service.component.annotations.Component;

@Component(enabled = false, factory = "org.domain.max.one.provider.factory")
public class MyServiceImpl implements MyService {

  @Override
  public void doSomething() {
    // Nothing
  }
}
