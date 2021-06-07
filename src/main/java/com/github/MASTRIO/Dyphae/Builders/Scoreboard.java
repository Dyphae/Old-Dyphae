package com.github.MASTRIO.Dyphae.Builders;

public class Scoreboard {

  // Variables
  private String scoreName;
  public Scoreboard$Player[] playerList;

  // Constructor
  public Scoreboard(String scoreboardName) {

    this.scoreName = scoreboardName;

  }

  // Methods
  public void setPlayers(Scoreboard$Player[] players) {

    this.playerList = players;

  }

}
