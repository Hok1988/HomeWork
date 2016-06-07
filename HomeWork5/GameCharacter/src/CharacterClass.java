import java.util.Date;


public class CharacterClass extends CharacterRace{
	private String characterClassName;
	private int characterClass=0;
	private int typeOfEquipment;
	private boolean statusOfCretion;
	//IDs of class skills
	private int[] skills;

	public CharacterClass(int id, String name, Date dateOfCreation,
			String SideName, int model, int customization, String race, String characterClassName) {
		super(id, name, dateOfCreation, SideName, model, customization, race);
		// TODO Auto-generated constructor stub
		characterClass=this.selectCharacterClass();
	}
	
	public int selectCharacterClass()
	{
		//some logic
		characterClass=2;
		switch(characterClass)
		{
		case 0:
			this.characterClassName="Warrior";
			this.typeOfEquipment=0;
			this.statusOfCretion=true;
			this.skills=new int[15];
			skills[0]=211;
			skills[1]=23411;
			//..
			break;
		case 1:
			this.characterClassName="Mage";
			this.typeOfEquipment=1;
			this.statusOfCretion=true;
			this.skills=new int[25];
			skills[0]=71;
			skills[1]=311;
			//..
			break;
		case 2:
			this.characterClassName="Ranger";
			this.typeOfEquipment=2;
			this.statusOfCretion=true;
			this.skills=new int[18];
			skills[0]=145;
			skills[1]=487;
			//..
			break;
		}
		return characterClass;
	}

}
