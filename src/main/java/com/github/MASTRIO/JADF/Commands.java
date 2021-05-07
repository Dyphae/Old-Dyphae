package com.github.MASTRIO.JADF;

public class Commands {

  // Variables
  static Datapack datapack = new Datapack();

  // * Commands
  // Command: /say
  public String say(String message) {

    return "say " + message;

  }

  // Command: /help
  public String help() {

    return "help";

  }

  // Command: /give
  public String give(String selector, String item, int amount, String nbt) {

    if (nbt == null) {

      return "give " + selector + " " + "minecraft:" + item + " " + amount;

    } else {

      return "give " + selector + " " + "minecraft:" + item + " " + amount + " {" + nbt + "}";

    }

  }

  // Command: clear
  public String clear(String selector, String item, int amount) {

    if (selector != null) {

      if (item != null) {

        if (amount != -1) {

          if (item == null) {

            System.err.println("item not specified, defaulting to 'diamond'");
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

    if (!(titleType != "title" || titleType != "subtitle" || titleType != "actionbar" || titleType != "clear" || titleType != "reset")) {

      System.err.println("Title command has an incorrect titleType (" + titleType + "), defaulting to 'title'");
      titleType = "title";

    }

    if (titleType == "clear" || titleType == "reset") {

      return "title " + selector + " " + titleType;

    }

    if (message == null) {

      System.err.println("Missing " + titleType + " message, defaulting to 'generic title message'");
      message = "generic title message";

    }

    if (selector == null) {

      System.err.println("Missing selector, defaulting to '@s'");
      selector = "@s";

    }

    return "title " + selector + " " + titleType + " {\"text\":\"" + message + "\"}";

  }

  // Command: tellraw
  public String tellraw(String selector, String message) {

    if (selector != null) {

      if (message != null) {

        return "tellraw " + selector + " " + message;

      } else {

        System.err.println("Message not specified, defaulting to '{\"text\":\"generic tellraw message\"}'");
        message = "{\"text\":\"generic tellraw message\"}";
        return "tellraw " + selector + " " + message;

      }

    } else {

      System.err.println("Selector not specified, defaulting to '@a'");
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

  // Command: /ban
  public String ban(String player, String reason) {

    return "ban " + player + " " + reason;

  }

  // Command: /banlist
  public String banlist(String listType) {

    if (listType != "ips" || listType != "players") {

      System.err.println("Invalid listType '" + listType + "', defaulting to 'players'");
      listType = "players";

    }

    return "banlist " + listType;

  }

  // Command: /pardon
  public String pardon(String player) {

    return "pardon " + player;

  }

  // Command: /ban-ip
  public String ban_ip(String ip_player, String reason) {

    return "ban-ip " + ip_player + " " + reason;

  }

  // Command: /gamerule
  public String gamerule(String gamerule, Boolean set) {

    if (!(gamerule != "announceAdvancements" || gamerule != "commandBlockOutput" || gamerule != "disableElytraMovementCheck" || gamerule != "disableRaids" || gamerule != "doDaylightCycle" || gamerule != "doEntityDrops" || gamerule != "doFireTick" || gamerule != "doImmediateRespawn" || gamerule != "doInsomnia" || gamerule != "doLimitedCrafting" || gamerule != "doMobLoot" || gamerule != "doMobSpawning" || gamerule != "doPatrolSpawning" || gamerule != "doTileDrops" || gamerule != "doTraderSpawning" || gamerule != "doWeatherCycle" || gamerule != "drowningDamage" || gamerule != "fallDamage" || gamerule != "fireDamage" || gamerule != "keepInventory" || gamerule != "logAdminCommands" || gamerule != "mobGriefing" || gamerule != "naturalRegeneration" || gamerule != "reducedDebugInfo" || gamerule != "sendCommandFeedback" || gamerule != "showDeathMessages" || gamerule != "spectatorsGenerateChunks")) {

      System.err.println("Invalid gamerule, defaulting to 'keepInventory'");
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

  // Command: /reload
  public String reload() {

    return "reload";

  }

  // TODO: Tag

  // TODO: Experience

  // TODO: Forceload

  // Command: /gamemode
  public String gamemode (String gamemode, String selector) {

    if (selector == null) {

      return "gamemode " + gamemode;

    } else {

      return "gamemode " + gamemode + " " + selector;

    }

  }

  // TODO: Worldborder

}
