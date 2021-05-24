package com.github.MASTRIO.JADF;

public @interface McFunction {

  // Function Info
  String name() default "Name of the Function";
  String description() default "A short description of the function";
  String author() default "Who made the function (useful with multiple devs)";

  // Other
  String notes() default "Information about the function for you to remember";

}
