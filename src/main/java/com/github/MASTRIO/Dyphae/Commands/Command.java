package com.github.MASTRIO.Dyphae.Commands;

public class Command {

  // Variables
  private String commandSyntax;

  // Constructor
  public Command(String syntax) {

    this.commandSyntax = syntax;

  }

  // Methods
  String add() {

    return commandSyntax;

  }

}
