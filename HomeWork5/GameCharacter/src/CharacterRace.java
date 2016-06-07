import java.util.Date;


public class CharacterRace extends CharacterSide{
	private String race;
	//graphical model of race
	private int model=0;
	//type of custmization
	private int customization=0;
	//IDs of class skills
	private int[] skills;

	public CharacterRace(int id, String name, Date dateOfCreation,
			String SideName, int model, int customization, String race) {
		super(id, name, dateOfCreation, SideName);
		// TODO Auto-generated constructor stub
		this.model=this.selectModel();
		this.customization=this.selectCustomization();
		switch(race)
		{
		case "Orcs":
			this.skills=new int[3];
			skills[0]=11;
			skills[1]=31;
			//..
			break;
		case "Trolls":
			this.skills=new int[3];
			skills[0]=7;
			skills[1]=12;
			//..
			break;
		case "Elfs":
			this.skills=new int[3];
			skills[0]=3;
			skills[1]=27;
			//..
			break;
		case "Humans":
			this.skills=new int[3];
			skills[0]=5;
			skills[1]=15;
			//..
			break;
		}
	}
	public int selectModel()
	{
		//Some logic
		model=3;
		return model;
	}
	public int selectCustomization()
	{
		//Some logic
		customization=1;
		return customization;
	}
}
