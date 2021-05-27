package com.github.MASTRIO.Dyphae.Core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface MCFunction {

  // Function Info
  String name() default "Function name";
  String description() default "Function description";
  String author() default "Who made function";

  // Other
  String notes() default "Information about function";
  boolean deprecated() default false;

}
