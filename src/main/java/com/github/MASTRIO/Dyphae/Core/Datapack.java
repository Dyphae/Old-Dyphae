package com.github.MASTRIO.Dyphae.Core;

import com.github.MASTRIO.Dyphae.Command;

public class Datapack {

  // Variables
  static String[] datapackInfo;
  public static String datapackName;

  // Default Functions
  public static String[] _load = {
    Command.say("LOAD")
  };
  public static String[] _tick = {
    Command.say("TICK")
  };

  // Initiate datapack
  public static void _init(String name, String namespace, String description, String author, String version) {

    datapackInfo = new String[] {
      name,
      namespace,
      description,
      author,
      version
    };

    datapackName = datapackInfo[1];

  }

  // Open Compiler
  public static void _openCompiler(Datapack datapack) {

    Warper.compiler(_load, _tick, datapack);

  }

  // Function List
  public void _onBuild() {

    ConsoleLogger.warning("Missing 'onBuild' method");
    ConsoleLogger.info("Without it custom functions cannot be built");

  }

}
