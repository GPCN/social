package org.exoplatform.social.webui.composer;

import org.exoplatform.social.webui.composer.UIComposer.PostContext;
import org.exoplatform.webui.application.WebuiRequestContext;
import org.exoplatform.webui.config.annotation.ComponentConfig;
import org.exoplatform.webui.config.annotation.EventConfig;
import org.exoplatform.webui.core.UIComponent;
import org.exoplatform.webui.core.lifecycle.UIApplicationLifecycle;
import org.exoplatform.webui.event.Event;

/**
 * Created by IntelliJ IDEA.
 * User: zun
 * Date: Jun 21, 2010
 * Time: 3:15:19 PM
 * To change this template use File | Settings | File Templates.
 */
@ComponentConfig(
  lifecycle = UIApplicationLifecycle.class,
  template = "app:/groovy/social/composer/UILinkComposer.gtmpl",
  events = {
   @EventConfig(listeners = UIActivityComposer.CloseActionListener.class),
   @EventConfig(listeners = UIActivityComposer.SubmitContentActionListener.class),
   @EventConfig(listeners = UIActivityComposer.ActivateActionListener.class)
  }
)
public class UILinkActivityComposer extends UIActivityComposer {

  @Override
  public void postActivity(PostContext postContext, UIComponent source, WebuiRequestContext requestContext, String postedMessage) throws Exception {

  }

  @Override
  protected void onClose(Event<UIActivityComposer> event) {
    System.out.println("onClose");
  }

  @Override
  protected void onSubmit(Event<UIActivityComposer> event) {
    UILinkActivityComposer linkActivityComposer = (UILinkActivityComposer) event.getSource();
    System.out.println("onSubmit");
  }

  @Override
  protected void onActivate(Event<UIActivityComposer> event) {
    System.out.println("onActivate");
  }
}