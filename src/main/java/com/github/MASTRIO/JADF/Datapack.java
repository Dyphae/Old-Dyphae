package com.github.MASTRIO.JADF;

public class Datapack {

  // Variables
  static String[] datapackData;
  public static String[] loadFunction = {
    "say LOAD"
  };
  public static String[] tickFunction = {
    "say TICK"
  };

  // New datapack method
  public static void newDatapack(String name, String namespace, String description, String author, String version) {

    datapackData = new String[]{
      name, // 0
      namespace, // 1
      description, // 2
      author, // 3
      version // 4
    };

  }

}
