package com.github.MASTRIO.JADF;

public class Commands {

  // Variables
  static Datapack datapack = new Datapack();

  // * Commands
  // Command: /say
  public String say(String message) {

    return "say " + message;

  }

  // Command: /give
  public String give(String selector, String item, int amount, String nbt) {

    if (nbt == null) {

      return "give " + selector + " " + "minecraft:" + item + " " + amount;

    } else {

      return "give " + selector + " " + "minecraft:" + item + "{" + nbt + "} " + amount;

    }

  }

  // Command: clear
  public String clear(String selector, String item, int amount) {

    if (selector != null) {

      if (item != null) {

        if (amount != -1) {

          if (item == null) {

            System.out.println(ConsoleColours.WARN + "item not specified, defaulting to 'diamond'" + ConsoleColours.RESET);
            item = "diamond";
            return "clear " + selector + " minecraft:" + item + " " + amount;

          } else {

            return "clear " + selector + " minecraft:" + item + " " + amount;

          }

        } else {

          return "clear " + selector + " minecraft:" + item;

        }

      } else {

        return "clear " + selector;

      }

    } else {

      return "clear";

    }

  }

  // Command: clear (all)
  public String clearAll(String selector) {

    if (selector != null) {

      return "clear " + selector;

    } else {

      return "clear";

    }

  }

  // Command: /title
  public String title(String selector, String titleType, String message) {

    if (!(titleType == "title" || titleType == "subtitle" || titleType == "actionbar" || titleType == "clear" || titleType == "reset")) {

      System.out.println(ConsoleColours.WARN + "Title command has an incorrect titleType (" + titleType + "), defaulting to 'title'" + ConsoleColours.RESET);
      titleType = "title";

    }

    if (titleType == "clear" || titleType == "reset") {

      return "title " + selector + " " + titleType;

    }

    if (message == null) {

      System.out.println(ConsoleColours.WARN + "Missing " + titleType + " message, defaulting to 'generic title message'" + ConsoleColours.RESET);
      message = "generic title message";

    }

    if (selector == null) {

      System.out.println(ConsoleColours.WARN + "Missing selector, defaulting to '@s'" + ConsoleColours.RESET);
      selector = "@s";

    }

    return "title " + selector + " " + titleType + " {\"text\":\"" + message + "\"}";

  }

  // Command: /tellraw
  public String tellraw(String selector, String message) {

    if (selector != null) {

      if (message != null) {

        return "tellraw " + selector + " " + message;

      } else {

        System.out.println(ConsoleColours.WARN + "Message not specified, defaulting to '{\"text\":\"generic tellraw message\"}'" + ConsoleColours.RESET);
        message = "{\"text\":\"generic tellraw message\"}";
        return "tellraw " + selector + " " + message;

      }

    } else {

      System.out.println(ConsoleColours.WARN + "Selector not specified, defaulting to '@a'" + ConsoleColours.RESET);
      selector = "@a";
      return "tellraw " + selector + " " + message;

    }

  }

  // Command: /function
  public String function(String namespace, String function) {

    if (namespace == "this") {

      namespace = Datapack.datapackData[1];

    }

    return "function " + namespace + ":" + function;

  }

  // Command: /gamerule
  public String gamerule(String gamerule, Boolean set) {

    if (!(gamerule != "announceAdvancements" || gamerule != "commandBlockOutput" || gamerule != "disableElytraMovementCheck" || gamerule != "disableRaids" || gamerule != "doDaylightCycle" || gamerule != "doEntityDrops" || gamerule != "doFireTick" || gamerule != "doImmediateRespawn" || gamerule != "doInsomnia" || gamerule != "doLimitedCrafting" || gamerule != "doMobLoot" || gamerule != "doMobSpawning" || gamerule != "doPatrolSpawning" || gamerule != "doTileDrops" || gamerule != "doTraderSpawning" || gamerule != "doWeatherCycle" || gamerule != "drowningDamage" || gamerule != "fallDamage" || gamerule != "fireDamage" || gamerule != "keepInventory" || gamerule != "logAdminCommands" || gamerule != "mobGriefing" || gamerule != "naturalRegeneration" || gamerule != "reducedDebugInfo" || gamerule != "sendCommandFeedback" || gamerule != "showDeathMessages" || gamerule != "spectatorsGenerateChunks")) {

      System.out.println(ConsoleColours.WARN + "Invalid gamerule, defaulting to 'keepInventory'" + ConsoleColours.RESET);
      gamerule = "keepInventory";

    }

    return "gamerule " + gamerule + " " + set;

  }

  // TODO: Advancement

  // TODO: Attribute

  // TODO: Bossbar

  // TODO: Clone

  // TODO: Data

  // TODO: Datapack

  // Command: /seed
  public String seed() {

    return "seed";

  }

  // Command: /tag
  public String tag(String selector, String tagType, String tag) {

    if (selector == null) {

      System.out.println(ConsoleColours.WARN + "Invalid selector '" + selector + "', defaulting to '@a'" + ConsoleColours.RESET);
      selector = "@a";

    }

    if (!(tagType != "add" || tagType != "list" || tagType != "remove")) {

      System.out.println(ConsoleColours.WARN + "Invalid argument '" + tagType + "', defaulting to 'list'" + ConsoleColours.RESET);
      tagType = "list";
      return "tag " + selector + " list";

    }

    return "tag " + selector + " " + tagType + " " + tag;

  }

  // TODO: Experience

  // Command: /gamemode
  public String gamemode(String gamemode, String selector) {

    if (selector == null) {

      return "gamemode " + gamemode;

    } else {

      return "gamemode " + gamemode + " " + selector;

    }

  }

  // TODO: Worldborder

}
