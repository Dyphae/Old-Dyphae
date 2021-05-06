package com.github.MASTRIO.JADF;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Build {

  // Variables
  public String[] functionCommands = {
    "say Test"
  };
  public Build build;
  String currentDir = System.getProperty("user.dir");
  Path path;
  String packPath;
  File newFile;
  FileWriter fillFile;
  String compileBar = "~----------------------------------------------------------------------------------------~";

  public void baseFiles() {

    // Variables
    Datapack dp = new Datapack();

    // Epic ASCII logo/icon
    System.out.println("    ___  ________  ________  ________ ");
    System.out.println("   |\\  \\|\\   __  \\|\\   ___ \\|\\  _____\\");
    System.out.println("   \\ \\  \\ \\  \\|\\  \\ \\  \\_|\\ \\ \\  \\__/ ");
    System.out.println(" __ \\ \\  \\ \\   __  \\ \\  \\ \\\\ \\ \\   __\\");
    System.out.println("|\\  \\\\_\\  \\ \\  \\ \\  \\ \\  \\_\\\\ \\ \\  \\_|");
    System.out.println("\\ \\________\\ \\__\\ \\__\\ \\_______\\ \\__\\ ");
    System.out.println(" \\|________|\\|__|\\|__|\\|_______|\\|__| ");

    // Is Building
    System.out.println("\nBuilding '" + Datapack.datapackData[0] + "' datapack version '" + Datapack.datapackData[3] + "', made by '" + Datapack.datapackData[2] + "'");

    // Create Output folder
    try {

      System.out.println(compileBar);

      // Create base folder
      packPath = currentDir + "/" + Datapack.datapackData[0] + "/";
      path = Paths.get(packPath);
      Files.createDirectories(path);
      System.out.println("Generated base folder");

      // Create data folder
      path = Paths.get(packPath + "/data");
      Files.createDirectories(path);
      System.out.println("Generated data folder");

      // Create pack.mcmeta file
      newFile = new File(packPath + "/pack.mcmeta");
      fillFile = new FileWriter(packPath + "/pack.mcmeta");
      fillFile.write("{\n");
      fillFile.write("  \"pack\": {\n");
      fillFile.write("    \"pack_format\": 6,\n");
      fillFile.write("    \"description\": [{\"text\":\"" + Datapack.datapackData[2] + "\"},{\"text\":\"\\n\"},{\"text\":\"" + Datapack.datapackData[4] + " by " + Datapack.datapackData[3] + "\"}]\n");
      fillFile.write("  }\n");
      fillFile.write("}\n");
      fillFile.close();
      System.out.println("Generated pack.mcmeta file");

      // Create minecraft folder
      path = Paths.get(packPath + "/data/minecraft");
      Files.createDirectories(path);
      System.out.println("Generated minecraft folder");

      // Create tags folder
      path = Paths.get(packPath + "/data/minecraft/tags");
      Files.createDirectories(path);
      System.out.println("Generated tags folder");

      // Create tags/functions folder
      path = Paths.get(packPath + "/data/minecraft/tags/functions");
      Files.createDirectories(path);
      System.out.println("Generated tags/functions folder");

      // Create load.json file
      newFile = new File(packPath + "/data/minecraft/tags/functions/load.json");
      fillFile = new FileWriter(packPath + "/data/minecraft/tags/functions/load.json");
      fillFile.write("{\n");
      fillFile.write("  \"values\": [\n");
      fillFile.write("    \"" + Datapack.datapackData[1] + ":load\"\n");
      fillFile.write("  ]\n");
      fillFile.write("}\n");
      fillFile.close();
      System.out.println("Generated load.json file");

      // Create tick.json file
      newFile = new File(packPath + "/data/minecraft/tags/functions/tick.json");
      fillFile = new FileWriter(packPath + "/data/minecraft/tags/functions/tick.json");
      fillFile.write("{\n");
      fillFile.write("  \"values\": [\n");
      fillFile.write("    \"" + Datapack.datapackData[1] + ":tick\"\n");
      fillFile.write("  ]\n");
      fillFile.write("}\n");
      fillFile.close();
      System.out.println("Generated tick.json file");

      // Create datapack folder
      path = Paths.get(packPath + "/data/" + Datapack.datapackData[1]);
      Files.createDirectories(path);
      System.out.println("Generated " + Datapack.datapackData[1] + " folder");

      // Create functions folder
      path = Paths.get(packPath + "/data/" + Datapack.datapackData[1] + "/functions");
      Files.createDirectories(path);
      System.out.println("Generated functions folder");

      // Create load.mcfunction file
      newFile = new File(packPath + "/data/" + Datapack.datapackData[1] + "/functions/load.mcfunction");
      fillFile = new FileWriter(packPath + "/data/" + Datapack.datapackData[1] + "/functions/load.mcfunction");
      fillFile.write("say LOAD\n");
      fillFile.close();
      System.out.println("Generated load.mcfunction file");

      // Create tick.mcfunction file
      newFile = new File(packPath + "/data/" + Datapack.datapackData[1] + "/functions/tick.mcfunction");
      fillFile = new FileWriter(packPath + "/data/" + Datapack.datapackData[1] + "/functions/tick.mcfunction");
      fillFile.write("say TICK\n");
      fillFile.close();
      System.out.println("Generated tick.mcfunction file");

      // Create load.mcfunction files
      newFile = new File(packPath + "/data/" + Datapack.datapackData[1] + "/functions/load.mcfunction");
      fillFile = new FileWriter(packPath + "/data/" + Datapack.datapackData[1] + "/functions/load.mcfunction");
      fillFile.write("say LOAD\n");
      fillFile.close();
      System.out.println("Generated load.mcfunction file");

    } catch (IOException e) {

      System.err.println("Failed to build datapack!");
      System.exit(69);

    }

  }

  public void completeBuild() {

    System.out.println(compileBar);
    System.out.println("Datapack Build Completed");
    System.out.println("The built datapack is located at: " + currentDir + "/" + Datapack.datapackData[0] + "/");

  }

  public void createFunction(String functionNameThing) {

    try {

      newFile = new File(packPath + "/data/" + Datapack.datapackData[1] + "/functions/" + functionNameThing + ".mcfunction");
      fillFile = new FileWriter(packPath + "/data/" + Datapack.datapackData[1] + "/functions/" + functionNameThing + ".mcfunction");

      int fc = 0;
      for (byte i = (byte) (functionCommands.length - 1); i >= 0; i--) {

        fillFile.write(functionCommands[fc] + "\n");
        fc++;

      }

      fillFile.close();
      System.out.println("Generated " + functionNameThing + ".mcfunction file");

    } catch (IOException e) {

      System.err.println("Failed to create function");

    }

  }

  //fillFile.write("\n");

}
