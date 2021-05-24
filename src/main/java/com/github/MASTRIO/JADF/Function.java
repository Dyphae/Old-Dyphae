package com.github.MASTRIO.JADF;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Function {

  // Variables
  public String[] setCommands = {
    "say TEST"
  };
  private String functionN;

  // Set function name
  public void setName(String functionNameThing) {

    this.functionN = functionNameThing;

  }

  // Initialise function
  public void init() {

    try {

      File newFile = new File(Datapack.packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/" + this.functionN + ".mcfunction");
      FileWriter fillFile = new FileWriter(Datapack.packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/" + this.functionN + ".mcfunction");

      int fc = 0;
      for (byte i = (byte) (this.setCommands.length - 1); i >= 0; i--) {

        fillFile.write(this.setCommands[fc] + "\n");
        fc++;

      }

      fillFile.close();
      System.out.println("Generated " + this.functionN + ".mcfunction file");

    } catch (IOException e) {

      System.err.println("Failed to build Function (" + this.functionN + ".mcfunction)");

    }

  }

}