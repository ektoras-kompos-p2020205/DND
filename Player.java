import java.util.ArrayList;

public class Player {
	
	String name;
	String race;
	String className;
	
	private int times;
	private int sides;   //for hit dice
	
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	private int strengthMOD;
	private int dexterityMOD;
	private int constitutionMOD;
	private int intelligenceMOD;
	private int wisdomMOD;
	private int charismaMOD;
	
	public Player(String name, String race, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma,
	ArrayList<Race> raceList) {
		
		this.name = name;
		this.race = race;
		
		this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        
        this.findRace(raceList);
        
        this.strengthMOD = Modifier.modify(strength);
        this.dexterityMOD = Modifier.modify(dexterity);
        this.constitutionMOD = Modifier.modify(constitution);
        this.intelligenceMOD = Modifier.modify(intelligence);
        this.wisdomMOD = Modifier.modify(wisdom);
        this.charismaMOD = Modifier.modify(charisma);
	}
	
	public void setStrength(int plus) {
		this.strength = this.strength + plus;
	}
	
	public void setDexterity(int plus) {
		this.dexterity = this.dexterity + plus;
	}
	
	public void setConstitution(int plus) {
		this.constitution = this.constitution + plus;
	}
	
	public void setIntelligence(int plus) {
		this.intelligence = this.intelligence + plus;
	}
	
	public void setWisdom(int plus) {
		this.wisdom = this.wisdom + plus;
	}
	
	public void setCharisma(int plus) {
		this.charisma = this.charisma + plus;
	}
	
	public void findRace(ArrayList<Race> raceList) {
		Race r = new Race();
		
		for(int i=0; i<raceList.size(); i++) {
			r = raceList.get(i);
			
			if(this.race.equals(r.raceName)) {
				System.out.println(r);
				this.raceScoreIncrease(r);
				break;
				
			}
		}
	}
	
	public void raceScoreIncrease(Race r) {
		this.strength = this.strength + r.plusStrength;
        this.dexterity = this.dexterity + r.plusDexterity;
        this.constitution = this.constitution + r.plusConstitution;
        this.intelligence = this.intelligence + r.plusIntelligence;
        this.wisdom = this.wisdom + r.plusWisdom;
        this.charisma = this.charisma + r.plusCharisma;
	}
	
	public String toString() {
		return this.strength + "\n" + this.dexterity + "\n" + this.constitution + "\n" + 
		this.intelligence + "\n" + this.wisdom + "\n" + this.charisma;
	}
	
}
