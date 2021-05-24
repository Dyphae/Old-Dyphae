package com.github.MASTRIO.JADF;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Function {

  // Variables
  private String[] functionCommands = {
    "say TEST"
  };
  private String functionN;

  // Constructor
  public Function(String namespace) {

    this.functionN = namespace;

  }

  // Set Commands
  public Function setCommands(String[] commands) {

    this.functionCommands = commands;
    return this;

  }

  // Initialise function
  public Function init() {

    try {

      File newFile = new File(Datapack.packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/" + this.functionN + ".mcfunction");
      FileWriter fillFile = new FileWriter(Datapack.packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/" + this.functionN + ".mcfunction");

      int fc = 0;
      for (byte i = (byte) (this.functionCommands.length - 1); i >= 0; i--) {

        fillFile.write(this.functionCommands[fc] + "\n");
        fc++;

      }

      fillFile.close();
      System.out.println("Generated " + this.functionN + ".mcfunction file");

    } catch (IOException e) {

      System.err.println("Failed to build Function (" + this.functionN + ".mcfunction)");

    }

    return this;

  }

}
