package com.github.MASTRIO.JADF;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface McFunction {

  // * Stuff
  // Function Info
  String name() default "Name of the Function";

  String description() default "A short description of the function";

  String author() default "Who made the function (useful with multiple devs)";

  // Other
  String notes() default "Information about the function for you to remember";

  boolean deprecated() default false;

}
