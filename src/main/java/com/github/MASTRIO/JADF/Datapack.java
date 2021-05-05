package com.github.MASTRIO.JADF;

public class Datapack {

  // Variables
  static String[] datapackData;

  // TODO: Make this
  // Make new function
  public void createFunction(String functionName) {
    System.out.println("New Function: " + functionName);
  }

  // New datapack method
  public void newDatapack(String name, String dataName, String description, String author, String version) {

    datapackData = new String[]{
      name,
      dataName,
      description,
      author,
      version
    };

  }

}
