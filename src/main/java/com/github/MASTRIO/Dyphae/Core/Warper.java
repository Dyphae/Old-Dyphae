package com.github.MASTRIO.Dyphae.Core;

import com.github.MASTRIO.Dyphae.Core.ConsoleColours;
import com.github.MASTRIO.Dyphae.Core.ConsoleLogger;
import com.github.MASTRIO.Dyphae.Core.Datapack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class Warper {

  // Variables
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
  public static String packPngPath = System.getProperty("user.dir") + "\\com\\github\\MASTRIO\\Dyphae\\Core\\DefaultIcon.png";

  // Compiler Menu
  static void compiler(String[] load, String[] tick, Datapack datapack) {

    // Variables
    Scanner input = new Scanner(System.in);
    String logCommand;

    // Epic ASCII logo/icon
    System.out.println(ConsoleColours.OTHER + " ______   __   __  _______  __   __  _______  _______ " + ConsoleColours.RESET);
    System.out.println(ConsoleColours.OTHER + "|      | |  | |  ||       ||  | |  ||   _   ||       |" + ConsoleColours.RESET);
    System.out.println(ConsoleColours.OTHER + "|  _    ||  |_|  ||    _  ||  |_|  ||  |_|  ||    ___|" + ConsoleColours.RESET);
    System.out.println(ConsoleColours.OTHER + "| | |   ||       ||   |_| ||       ||       ||   |___ " + ConsoleColours.RESET);
    System.out.println(ConsoleColours.OTHER + "| |_|   ||_     _||    ___||       ||       ||    ___|" + ConsoleColours.RESET);
    System.out.println(ConsoleColours.OTHER + "|       |  |   |  |   |    |   _   ||   _   ||   |___ " + ConsoleColours.RESET);
    System.out.println(ConsoleColours.OTHER + "|______|   |___|  |___|    |__| |__||__| |__||_______|" + ConsoleColours.RESET);

    // Input loop
    while (true) {

      // Output
      System.out.println(ConsoleColours.OTHER + "|=~-- Warper Console: Enter Command --~=|" + ConsoleColours.RESET);

      // Get input
      logCommand = input.nextLine();

      // Run Command
      if (logCommand.equalsIgnoreCase("help")) {

        ConsoleLogger.task("List Commands");
        ConsoleLogger.info("- help (Shows this list)");
        ConsoleLogger.info("- build/compile (Builds the datapack)");
        ConsoleLogger.info("- close/exit/stop (Exits the compiler)");

      }
      if (logCommand.equalsIgnoreCase("build") || logCommand.equalsIgnoreCase("compile")) {

        ConsoleLogger.task("Run Build");
        build(load, tick, datapack);

      }
      if (logCommand.equalsIgnoreCase("close") || logCommand.equalsIgnoreCase("exit") || logCommand.equalsIgnoreCase("stop")) {

        ConsoleLogger.task("Exit Compiler");
        System.exit(0);

      }

    }

  }

  // Build datapack
  public static void build(String[] load, String[] tick, Datapack datapack) {

    // Is Building
    ConsoleLogger.info("Building '" + Datapack.datapackInfo[0] + "' version '" + Datapack.datapackInfo[4] + "' by '" + Datapack.datapackInfo[3] + "'");

    // Create Output folder
    try {

      System.out.println(ConsoleColours.OTHER + compileBar + ConsoleColours.RESET);
      packPath = currentDir + "/" + Datapack.datapackInfo[0] + "/";

      // Create base folder
      path = Paths.get(packPath);
      Files.createDirectories(path);
      ConsoleLogger.log("Generated base folder");

      // Create data folder
      path = Paths.get(packPath + "/data");
      Files.createDirectories(path);
      ConsoleLogger.log("Generated data folder");

      /*
      // Create pack.png file
      newFile = new File(packPath + "/pack.png");
      fillFile = new FileWriter(packPath + "/pack.png");
      File packFiles = new File(packPngPath);
      Scanner packReader = new Scanner(packFiles);
      HashMap<Integer, String> imgData = new HashMap<>();
      int id = 0;

      while (packReader.hasNextLine()) {

        imgData.put(id, packReader.nextLine());
        id++;

        }

        //System.out.println(imgData);

        fillFile.write("{\n");
        fillFile.write("  \"pack\": {\n");
        fillFile.write("    \"pack_format\": 6,\n");
        fillFile.write("    \"description\": [{\"text\":\"" + Datapack.datapackInfo[2] + "\"},{\"text\":\"\\n\"},{\"text\":\"" + Datapack.datapackInfo[4] + " by " + Datapack.datapackInfo[3] + "\"}]\n");
        fillFile.write("  }\n");
        fillFile.write("}\n");
        fillFile.close();
        ConsoleLogger.log("Generated pack.png image file");

       */

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
      ConsoleLogger.log("Generated pack.mcmeta file");

      // Conventions
      /*
      if (Datapack.doDatapackConventions) {

        // Create global folder
        path = Paths.get(packPath + "/data/global");
        Files.createDirectories(path);
        ConsoleLogger.log("Generated global folder");

        // Create advancements folder
        path = Paths.get(packPath + "/data/global/advancements");
        Files.createDirectories(path);
        ConsoleLogger.log("Generated global/advancements folder");

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
        ConsoleLogger.log("Generated root.json file");

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
        ConsoleLogger.log("Generated " + Datapack.datapackData[4] + ".json file");

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
        ConsoleLogger.log("Generated " + Datapack.datapackData[0] + ".json file");

      }
      */

      // Create minecraft folder
      path = Paths.get(packPath + "/data/minecraft");
      Files.createDirectories(path);
      ConsoleLogger.log("Generated minecraft folder");

      // Create tags folder
      path = Paths.get(packPath + "/data/minecraft/tags");
      Files.createDirectories(path);
      ConsoleLogger.log("Generated tags folder");

      // Create tags/functions folder
      path = Paths.get(packPath + "/data/minecraft/tags/functions");
      Files.createDirectories(path);
      ConsoleLogger.log("Generated tags/functions folder");

      // Create load.json file
      newFile = new File(packPath + "/data/minecraft/tags/functions/load.json");
      fillFile = new FileWriter(packPath + "/data/minecraft/tags/functions/load.json");
      fillFile.write("{\n");
      fillFile.write("  \"values\": [\n");
      fillFile.write("    \"" + Datapack.datapackInfo[1] + ":load\"\n");
      fillFile.write("  ]\n");
      fillFile.write("}\n");
      fillFile.close();
      ConsoleLogger.log("Generated load.json file");

      // Create tick.json file
      newFile = new File(packPath + "/data/minecraft/tags/functions/tick.json");
      fillFile = new FileWriter(packPath + "/data/minecraft/tags/functions/tick.json");
      fillFile.write("{\n");
      fillFile.write("  \"values\": [\n");
      fillFile.write("    \"" + Datapack.datapackInfo[1] + ":tick\"\n");
      fillFile.write("  ]\n");
      fillFile.write("}\n");
      fillFile.close();
      ConsoleLogger.log("Generated tick.json file");

      // Create datapack folder
      path = Paths.get(packPath + "/data/" + Datapack.datapackInfo[1]);
      Files.createDirectories(path);
      ConsoleLogger.log("Generated " + Datapack.datapackInfo[1] + " folder");

      // Create functions folder
      path = Paths.get(packPath + "/data/" + Datapack.datapackInfo[1] + "/functions");
      Files.createDirectories(path);
      ConsoleLogger.log("Generated functions folder");

      // Create tick.mcfunction file
      newFile = new File(packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/tick.mcfunction");
      fillFile = new FileWriter(packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/tick.mcfunction");

      int tf = 0;
      for (byte i = (byte) (tick.length - 1); i >= 0; i--) {

        fillFile.write(tick[tf] + "\n");
        tf++;

      }

      fillFile.close();
      ConsoleLogger.log("Generated tick.mcfunction file");

      // Create load.mcfunction files
      newFile = new File(packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/load.mcfunction");
      fillFile = new FileWriter(packPath + "/data/" + Datapack.datapackInfo[1] + "/functions/load.mcfunction");

      int lf = 0;
      for (byte i = (byte) (load.length - 1); i >= 0; i--) {

        fillFile.write(load[lf] + "\n");
        lf++;

      }

      fillFile.close();
      ConsoleLogger.log("Generated load.mcfunction file");

      // Compile Functions, etc.
      datapack._onBuild();

      // Complete Build
      System.out.println(ConsoleColours.OTHER + compileBar + ConsoleColours.RESET);
      ConsoleLogger.success("Datapack Build Completed");
      ConsoleLogger.info("The built datapack is located at: " + currentDir + "/" + Datapack.datapackInfo[0] + "/");

    } catch (IOException e) {

      ConsoleLogger.error("Failed to build datapack!");
      ConsoleLogger.error(String.valueOf(e));
      System.exit(69);

    }

  }

}
