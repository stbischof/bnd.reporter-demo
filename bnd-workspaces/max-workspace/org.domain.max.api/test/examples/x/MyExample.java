package examples.x;

import org.domain.max.api.MyService;
import org.osgi.service.component.annotations.Reference;

/**
 * ${snippet groupName=print, title=MyService Examples, description=Et est admodum mirum videre
 * plebem innumeram mentibus ardore quodam infuso cum dimicationum curulium eventu pendentem. haec
 * similiaque memorabile nihil vel serium agi Romae permittunt. ergo redeundum ad textum.}
 * 
 * ${snippet parentGroup=print, includeDeclaration=false, title=Getting MyService, description="Et
 * hanc quidem praeter oppida multa duae civitates exornant."}
 */
public class MyExample {

  @Reference
  private MyService myService;

}
