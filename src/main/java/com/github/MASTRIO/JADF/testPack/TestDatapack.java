package com.github.MASTRIO.JADF.testPack;

import com.github.MASTRIO.JADF.Commands;
import com.github.MASTRIO.JADF.Datapack;

public class TestDatapack {

  // Variables
  static Datapack datapack = new Datapack();
  static Commands commands = new Commands();


  // Main method
  public static void main(String[] args) {

    // Create new datapack
    datapack.newDatapack(
      "Test Datapack",
      "A datapack for testing",
      "me",
      "v1.0.0"
    );

    // Build the base datapack
    datapack.build();

    // Create Functions
    //functions();

  }

  //static void functions() {
  //
  //  commands.function = new String[] {
  //    commands.say("sus"),
  //    commands.say("suspicious")
  //  }; datapack.createFunction("test");
  //
  //}

}
