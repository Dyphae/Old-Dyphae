package com.github.MASTRIO.JADF;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Datapack {

  String[] datapackData;

  public void build() {

    // Message
    System.out.println("Building '" + datapackData[0] + "' datapack version '" + datapackData[3] + "', made by '" + datapackData[2] + "'");

    // Create Output folder
    try {

      Path path = Paths.get("/" + datapackData[0] + "/");

      //java.nio.file.Files;
      Files.createDirectories(path);

      System.out.println("Directory is created!");

    } catch (IOException e) {

      System.err.println("Failed to create datapack!");

    }

  }

  public void createFunction(String functionName) {
    System.out.println("New Function: " + functionName);
  }

  public void newDatapack(String name, String description, String author, String version) {

    datapackData = new String[]{
      name,
      description,
      author,
      version
    };

  }

}
