package com.github.MASTRIO.Dyphae.Builders;

import java.util.Arrays;

public class Selector {

  // Variables
  private String selType;
  private String arguments;

  // Constructor
  public Selector(String selectorBase) {

    this.selType = selectorBase;

  }

  // Methods
  // Set args
  public Selector setArgs(String[] args) {

    this.arguments = Arrays.toString(args);
    return this;

  }

  // Get Selector
  public String get() {

    if (arguments != null) {

      return selType + arguments;

    } else {

      return selType;

    }

  }

}
