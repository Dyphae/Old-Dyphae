package com.github.MASTRIO.Dyphae;

import com.github.MASTRIO.Dyphae.Commands.CommandBuilder;
import com.github.MASTRIO.Dyphae.Console.ConsoleLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Datapack {

  // Variables
  static String[] datapackInfo;
  static String compileBar = "~----------------------------------------------------------------------------------------~";
  static String currentDir = System.getProperty("user.dir");
  public static String[] functionCommands = {
    "say TEST"
  };
  static Path path;
  public static String packPath;
  static File newFile;
  static FileWriter fillFile;
  public static String functionN;

  // Default Functions
  public static String[] load = {
    CommandBuilder.say("LOAD")
  };
  public static String[] tick = {
    CommandBuilder.say("TICK")
  };

  // Initiate datapack
  public static void init(String name, String namespace, String description, String author, String version) {

    datapackInfo = new String[] {
      name,
      namespace,
      description,
      author,
      version
    };

  }

  // Build method
  public void build() {

    // Epic ASCII logo/icon
    System.out.println("    ___  ________  ________  ________ ");
    System.out.println("   |\\  \\|\\   __  \\|\\   ___ \\|\\  _____\\");
    System.out.println("   \\ \\  \\ \\  \\|\\  \\ \\  \\_|\\ \\ \\  \\__/ ");
    System.out.println(" __ \\ \\  \\ \\   __  \\ \\  \\ \\\\ \\ \\   __\\");
    System.out.println("|\\  \\\\_\\  \\ \\  \\ \\  \\ \\  \\_\\\\ \\ \\  \\_|");
    System.out.println("\\ \\________\\ \\__\\ \\__\\ \\_______\\ \\__\\ ");
    System.out.println(" \\|________|\\|__|\\|__|\\|_______|\\|__| ");

    // Is Building
    ConsoleLogger.info("\nBuilding '" + Datapack.datapackInfo[0] + "' datapack version '" + Datapack.datapackInfo[3] + "', made by '" + Datapack.datapackInfo[2] + "'");

    // Create Output folder
    try {

      System.out.println(compileBar);
      packPath = currentDir + "/" + Datapack.datapackInfo[0] + "/";

      // Create base folder
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
      fillFile.write("    \"description\": [{\"text\":\"" + Datapack.datapackInfo[2] + "\"},{\"text\":\"\\n\"},{\"text\":\"" + Datapack.datapackInfo[4] + " by " + Datapack.datapackInfo[3] + "\"}]\n");
      fillFile.write("  }\n");
      fillFile.write("}\n");
      fillFile.close();
      System.out.println("Generated pack.mcmeta file");

      // Conventions
      /*
      if (Datapack.doDatapackConventions) {

        // Create global folder
        path = Paths.get(packPath + "/data/global");
        Files.createDirectories(path);
        System.out.println("Generated global folder");

        // Create advancements folder
        path = Paths.get(packPath + "/data/global/advancements");
        Files.createDirectories(path);
        System.out.println("Generated global/advancements folder");

        // Create root.json file
        newFile = new File(packPath + "/data/global/advancements/root.json");
        fillFile = new FileWriter(packPath + "/data/global/advancements/root.json");
        fillFile.write("{\n");
        fillFile.write("  \"display\": {\n");
        fillFile.write("    \"title\": \"Installed Datapacks\",\n");
        fillFile.write("    \"description\": \"\",\n");
        fillFile.write("    \"icon\": {\n");
        fillFile.write("      \"item\": \"minecraft:knowledge_book\"},\n");
        fillFile.write("    \"background\": \"minecraft:textures/block/black_concrete_powder.png\",\n");
        fillFile.write("    \"show_toast\": false,\n");
        fillFile.write("    \"announce_to_chat\": false\n");
        fillFile.write("  },\n");
        fillFile.write("  \"criteria\": {\n");
        fillFile.write("    \"trigger\": {\n");
        fillFile.write("      \"trigger\": \"minecraft:tick\"\n");
        fillFile.write("  }\n");
        fillFile.write("}\n");
        fillFile.write("}");
        fillFile.close();
        System.out.println("Generated root.json file");

        // Create author file
        newFile = new File(packPath + "/data/global/advancements/" + Datapack.datapackData[4] + ".json");
        fillFile = new FileWriter(packPath + "/data/global/advancements/" + Datapack.datapackData[4] + ".json");
        fillFile.write("{\n");
        fillFile.write("  \"display\": {\n");
        fillFile.write("    \"title\": \"" + Datapack.datapackData[3] + "\",\n");
        fillFile.write("    \"description\": \"" + Datapack.datapackData[3] + " makes cool datapacks using the JADF framework ;)\",\n");
        fillFile.write("    \"icon\": {\n");
        fillFile.write("      \"item\": \"minecraft:player_head\",\n");
        fillFile.write("      \"nbt\": \"{SkullOwner:{Name: \\\"" + Datapack.datapackData[3] + "\\\", Properties: {textures: [{Value: \\\"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODNkNTRjMGE1ZTg1MzIxNzdmOTM3MDZiNjQxMDc0MGQ5Yzk2NDA1NzNlMTVmODEyODYwYzcwMDJjODU5NTE4MSJ9fX0=\\\"}]}}}\"\n");
        fillFile.write("    },\n");
        fillFile.write("    \"background\": \"minecraft:textures/block/black_concrete_powder.png\",\n");
        fillFile.write("    \"show_toast\": false,\n");
        fillFile.write("    \"announce_to_chat\": false\n");
        fillFile.write("  },\n");
        fillFile.write("  \"criteria\": {\n");
        fillFile.write("    \"trigger\": {\n");
        fillFile.write("      \"trigger\": \"minecraft:tick\"\n");
        fillFile.write("  }\n}\n");
        fillFile.write("}");
        fillFile.close();
        System.out.println("Generated " + Datapack.datapackData[4] + ".json file");

        // Create datapack file
        newFile = new File(packPath + "/data/global/advancements/" + Datapack.datapackData[1] + ".json");
        fillFile = new FileWriter(packPath + "/data/global/advancements/" + Datapack.datapackData[1] + ".json");
        fillFile.write("{\n");
        fillFile.write("  \"display\": {\n");
        fillFile.write("    \"title\": \"" + Datapack.datapackData[0] + " | " + Datapack.datapackData[5] + "\",\n");
        fillFile.write("    \"description\": \"" + Datapack.datapackData[2] + "\",\n");
        fillFile.write("    \"icon\": {\n");
        fillFile.write("      \"item\": \"minecraft:command_block\"\n");
        fillFile.write("    },\n");
        fillFile.write("    \"background\": \"minecraft:textures/block/black_concrete_powder.png\",\n");
        fillFile.write("    \"show_toast\": false,\n");
        fillFile.write("    \"announce_to_chat\": false\n");
        fillFile.write("  },\n");
        fillFile.write("  \"criteria\": {\n");
        fillFile.write("    \"trigger\": {\n");
        fillFile.write("      \"trigger\": \"minecraft:tick\"\n");
        fillFile.write("  }\n}\n");
        fillFile.write("}");
        fillFile.close();
        System.out.println("Generated " + Datapack.datapackData[0] + ".json file");

      }
      */

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
      fillFile.write("    \"" + Datapack.datapackInfo[1] + ":load\"\n");
      fillFile.write("  ]\n");
      fillFile.write("}\n");
      fillFile.close();
      System.out.println("Generated load.json file");

      // Create tick.json file
      newFile = new File(packPath + "/data/minecraft/tags/functions/tick.json");
      fillFile = new FileWriter(packPath + "/data/minecraft/tags/functions/tick.json");
      fillFile.write("{\n");
      fillFile.write("  \"values\": [\n");
      fillFile.write("    \"" + Datapack.datapackInfo[1] + ":tick\"\n");
      fillFile.write("  ]\n");
      fillFile.write("}\n");
      fillFile.close();
      System.out.println("Generated tick.json file");

      // Create datapack folder
      path = Paths.get(packPath + "/data/" + Datapack.datapackInfo[1]);
      Files.createDirectories(path);
      System.out.println("Generated " + Datapack.datapackInfo[1] + " folder");

      // Create functions folder
      path = Paths.get(packPath + "/data/" + Datapack.datapackInfo[1] + "/functions");
      Files.createDirectories(path);
      System.out.println("Generated functions folder");

      // Create tick.mcfunction file
      newFile = new File(packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/tick.mcfunction");
      fillFile = new FileWriter(packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/tick.mcfunction");

      int tf = 0;
      for (byte i = (byte) (tick.length - 1); i >= 0; i--) {

        fillFile.write(tick[tf] + "\n");
        tf++;

      }

      fillFile.close();
      System.out.println("Generated tick.mcfunction file");

      // Create load.mcfunction files
      newFile = new File(packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/load.mcfunction");
      fillFile = new FileWriter(packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/load.mcfunction");

      int lf = 0;
      for (byte i = (byte) (load.length - 1); i >= 0; i--) {

        fillFile.write(load[lf] + "\n");
        lf++;

      }

      fillFile.close();
      System.out.println("Generated load.mcfunction file");

      // Compile Functions, etc.
      onBuild();

      // Complete Build
      System.out.println(compileBar);
      ConsoleLogger.success("Datapack Build Completed");
      ConsoleLogger.info("The built datapack is located at: " + currentDir + "/" + Datapack.datapackInfo[0] + "/");

    } catch (IOException e) {

      System.err.println("Failed to build datapack!");
      System.exit(69);

    }

  }

  // Function List
  public void onBuild() {

    ConsoleLogger.info("This method runs when the datapack is being built");
    ConsoleLogger.info("You put your mcfunction declarations here");

  }

}