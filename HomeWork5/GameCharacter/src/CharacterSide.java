import java.util.Date;


public class CharacterSide extends GameCharacter{
	private String sideName;
	private String location;
	private int locationOfWar;
	
	
	public CharacterSide(int id, String name, Date dateOfCreation, String SideName) {
		super(id, name, dateOfCreation);
		// TODO Auto-generated constructor stub
		switch(SideName)
		{
			case "Kors": 
				this.location="KorsLocation";
				this.locationOfWar=0;
				break;
			case "Bets": 
				this.location="BetsLocation";
				this.locationOfWar=1;
				break;
			case "Acrs": 
				this.location="AcrsLocation";
				this.locationOfWar=2;
				break;
		}
	}
}
