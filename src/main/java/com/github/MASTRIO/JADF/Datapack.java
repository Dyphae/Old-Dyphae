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
  public void newDatapack(String name, String namespace, String description, String author, String version) {

    datapackData = new String[]{
      name,
      namespace,
      description,
      author,
      version
    };

  }

}
