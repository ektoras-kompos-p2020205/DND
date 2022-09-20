
public class Race {
	
	String raceName;
	
	int plusStrength;
	int plusDexterity;
	int plusConstitution;
	int plusIntelligence;
	int plusWisdom;
	int plusCharisma;
	
	public Race() {
		
	}
	
	public Race(String raceName, int plusStrength, int plusDexterity, int plusConstitution, int plusIntelligence,
	int plusWisdom, int plusCharisma) {
		
		this.raceName = raceName;
		
		this.plusStrength = plusStrength ;
		this.plusDexterity = plusDexterity;
		this.plusConstitution = plusConstitution ;
		this.plusIntelligence = plusIntelligence;
		this.plusWisdom = plusWisdom;
		this.plusCharisma = plusCharisma;
	}
	
	public String getRaceName() {
		return this.raceName;
	}
	
	public String toString() {
		return this.raceName;
	}
	
}
