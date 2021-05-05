package com.github.MASTRIO.JADF.testPack;

import com.github.MASTRIO.JADF.Build;
import com.github.MASTRIO.JADF.Commands;
import com.github.MASTRIO.JADF.Datapack;

public class TestDatapack {

  // Variables
  static Datapack datapack = new Datapack();
  static Commands commands = new Commands();
  static Build build = new Build();


  // Main method
  public static void main(String[] args) {

    // Create new datapack
    datapack.newDatapack(
      "sus datapack",
      "sus_datapack",
      "A datapack for being sus",
      "bob ross",
      "v1.0.0"
    );

    // Build the base datapack
    build.datapack();

  }

}
