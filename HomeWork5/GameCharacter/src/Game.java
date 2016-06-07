import java.util.Date;

public class Game {
	public static void main(String[] args) { 
		Date dateOfCreation = new Date();
        CharacterClass character=new CharacterClass(1, "Pup", dateOfCreation, "Kors", 1, 1, "Elfs", "Warrior");
        character.statusOfCreation();
    } 
}
