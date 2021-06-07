package com.github.MASTRIO.Dyphae.Builders;

public class Scoreboard$Player {

  // Variables
  private String playerName;
  private byte initValue;

  // Constructor
  public Scoreboard$Player(String name, byte initialValue) {

    this.playerName = name;
    this.initValue = initialValue;

  }

  // Methods
  // Get
  public String get() {

    return playerName + "," + initValue;

  }

}
