package com.github.MASTRIO.JADF;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Datapack {

  // Variables
  static Build build = new Build();
  static Boolean[] configuration = {
    false
  };
  static String[] datapackData;
  public static String[] loadFunction = {
    "say LOAD"
  };
  public static String[] tickFunction = {
    "say TICK"
  };

  // New datapack method
  public static void newDatapack(String name, String namespace, String description, String author, String authorID, String version) {

    datapackData = new String[]{
      name, // 0
      namespace, // 1
      description, // 2
      author, // 3
      authorID, // 4
      version // 5
    };

    build.packPath = build.currentDir + "/" + Datapack.datapackData[0] + "/";

  }

  // Config
  public static void config(Boolean doDatapackConventions) {

    configuration = new Boolean[] {
      doDatapackConventions // 0
    };

  }

  // Comments
  public static String comment(String message) {

    return "# " + message;

  }

  // New Subfolder
  public static void makeSubFolder(String folderName) throws IOException {

    build.path = Paths.get(build.packPath + "/data/" + Datapack.datapackData[1] + "/functions/" + folderName);
    Files.createDirectories(build.path);
    System.out.println("Generated " + Datapack.datapackData[1] + "/" + folderName + " sub-folder");

  }

}
