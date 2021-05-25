package com.github.MASTRIO.Dyphae;

public class Commands {

  // * Commands
  // Command: /say
  public String say(String message) {

    if (message == null) {

      System.out.println(ConsoleColours.WARN + "Missing message, defaulting to 'generic message'" + ConsoleColours.RESET);
      message = "generic message";

    }

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

    if (!(titleType.equals("title") || titleType.equals("subtitle") || titleType.equals("actionbar") || titleType.equals("clear") || titleType.equals("reset"))) {

      System.out.println(ConsoleColours.WARN + "Title command has an incorrect titleType (" + titleType + "), defaulting to 'title'" + ConsoleColours.RESET);
      titleType = "title";

    }

    if (titleType.equals("clear") || titleType.equals("reset")) {

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

    if (namespace.equals("this")) {

      namespace = Datapack.datapackData[1];

    }

    return "function " + namespace + ":" + function;

  }

  // Command: /gamerule
  public String gamerule(String gamerule, Boolean set) {

    if (!(gamerule.equals("announceAdvancements") || gamerule.equals("commandBlockOutput") || gamerule.equals("disableElytraMovementCheck") || gamerule.equals("disableRaids") || gamerule.equals("doDaylightCycle") || gamerule.equals("doEntityDrops") || gamerule.equals("doFireTick") || gamerule.equals("doImmediateRespawn") || gamerule.equals("doInsomnia") || gamerule.equals("doLimitedCrafting") || gamerule.equals("doMobLoot") || gamerule.equals("doMobSpawning") || gamerule.equals("doPatrolSpawning") || gamerule.equals("doTileDrops") || gamerule.equals("doTraderSpawning") || gamerule.equals("doWeatherCycle") || gamerule.equals("drowningDamage") || gamerule.equals("fallDamage") || gamerule.equals("fireDamage") || gamerule.equals("keepInventory") || gamerule.equals("logAdminCommands") || gamerule.equals("mobGriefing") || gamerule.equals("naturalRegeneration") || gamerule.equals("reducedDebugInfo") || gamerule.equals("sendCommandFeedback") || gamerule.equals("showDeathMessages") || gamerule.equals("spectatorsGenerateChunks"))) {

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

    if (!(tagType.equals("add") || tagType.equals("list") || tagType.equals("remove"))) {

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

  // Command: /scoreboard (Objectives)
  public String scoreboardObjectives(String arg1, String objective, String arg2, String arg3) {

    if (!(arg1.equals("add") || arg1.equals("list") || arg1.equals("modify") || arg1.equals("remove") || arg1.equals("setDisplay"))) {

      System.out.println(ConsoleColours.WARN + "Invalid argument '" + arg1 + "', defaulting to 'list'" + ConsoleColours.RESET);
      arg1 = "list";
      return "scoreboard objectives " + arg1;

    }

    // Add
    if (arg1.equals("add")) {

      if (!(arg2.equals("air") || arg2.equals("armor") || arg2.equals("deathCount") || arg2.equals("dummy") || arg2.equals("heath") || arg2.equals("food") || arg2.equals("killedByTeam") || arg2.equals("level") || arg2.equals("playerKillCount") || arg2.equals("teamKill") || arg2.equals("totalKillCount") || arg2.equals("trigger") || arg2.equals("xp"))) {

        System.out.println(ConsoleColours.WARN + "Invalid argument(2) '" + arg2 + "', defaulting to 'dummy'" + ConsoleColours.RESET);
        arg2 = "dummy";

      }

      return "scoreboard objectives " + arg1 + " " + objective + " " + arg2;

    }

    // List
    if (arg1.equals("list")) {

      return "scoreboard objectives " + arg1;

    }

    // Modify
    if (arg1.equals("modify")) {

      // Display Name
      if (arg2.equals("displayname")) {

        return "scoreboard objectives " + arg1 + " " + objective + " " + arg2 + " {\"text\": \"" + arg3 + "\"}";

      }

      // Render Type
      if (arg2.equals("rendertype")) {

        // Hearts
        if (arg3.equals("hearts")) {

          return "scoreboard objectives modify " + objective + " rendertype hearts";

        }

        // Integer
        if (arg3.equals("integer")) {

          return "scoreboard objectives modify " + objective + " rendertype integer";

        }

      }

    }

    // Remove
    if (arg1.equals("remove")) {

      return "scoreboard objectives remove " + objective;

    }

    // Set Display
    if (arg1.equals("setdisplay")) {

      // Below Name
      if (arg2.equals("belowName")) {

        return "scoreboard objectives setdisplay belowName " + objective;

      }

      // List
      if (arg2.equals("list")) {

        return "scoreboard objectives setdisplay list " + objective;

      }

      // Sidebar
      if (arg2.equals("sidebar")) {

        return "scoreboard objectives setdisplay sidebar " + objective;

      }

    }

    return "scoreboard objectives " + arg1;

  }

}
