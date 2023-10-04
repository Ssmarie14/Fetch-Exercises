package org.example;

public class Main {
    public static void main(String[] args) {
        NPC link = new(name "Link");
        Game zelda = new Game(name: "Zelda", genre: "RPG", platform: "Nintendo");
        zelda.addCharacter(link);


        System.out.println(link.getName());
        System.out.println(zelda.getCharacters().get(0).getFavoriteFood());


    }
}