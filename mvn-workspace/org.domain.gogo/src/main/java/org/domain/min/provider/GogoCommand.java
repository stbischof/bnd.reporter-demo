package org.domain.min.provider;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.osgi.service.component.annotations.ComponentPropertyType;

@ComponentPropertyType
@Retention(CLASS)
@Target(TYPE)
public @interface GogoCommand {

    String PREFIX_ = "osgi.command.";


    String scope();


    String[] function();

}