package com.github.MASTRIO.JADF;

public class Commands {

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

          return "clear " + selector + " minecraft:" + item + " " + amount;

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

}
