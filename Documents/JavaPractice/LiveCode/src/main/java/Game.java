import java.util.ArrayList;

public class Game {

    private String name;
    private String genre;
    private String platform;
    private ArrayList<NPC> characters;

    Game(String name, String genre, String platform) {
        this.name = name;
        this.genre = genre;
        this.platform = platform;

    }
    public String getName(){
        return this.name;
    }

    public void addCharacters(NPC character){
        this.characters.add(character);
    }
}
