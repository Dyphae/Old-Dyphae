package com.github.MASTRIO.JADF;

public class Main {

  public static void main(String[] args) {
    Datapack datapack = new Datapack();

    datapack.datapackData = new String[]{
      "name",
      "description",
      "author",
      "v0.1.0"
    };

    datapack.build();

  }

}
