package com.github.MASTRIO.Dyphae.Core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface Selector {

  // Selector Info
  String name() default "Selector name";

  // Other
  String notes() default "Information about selector";
  boolean deprecated() default false;

}

