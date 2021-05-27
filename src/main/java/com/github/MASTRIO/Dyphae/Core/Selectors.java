package com.github.MASTRIO.Dyphae.Core;

public enum Selectors {

  // Selectors
  PLAYER("player"),
  ALL_PLAYERS("@a"),
  SELF("@s"),
  RANDOM_PLAYER("@r"),
  ALL_ENTITIES("@e");

  // Variables
  private String selectorOutput;

  // Constructor
  Selectors(String selector) {

    this.selectorOutput = selector;

  }

  // Methods
  public String get() {

    if (selectorOutput == "player") {

      ConsoleLogger.error("You need to specify the players name!");
      return null;

    }

    return selectorOutput;

  }
  public String get(String player) {

    return player;

  }

  public String selectorArgs(String args) {

    if (selectorOutput == "player") {

      ConsoleLogger.error("This does not support players!");
      return null;

    }

    return selectorOutput + "[" + args + "]";

  }

}
