
public class Class {

	private String className;
	
	private int times;
	private int sides;   //for hit dice
	
	private int minLvlUpHp;
	
	public Class(String className, int times, int sides, int minLvlUpHp) {
		
		this.className = className;
		
		this.times = times;
		this.sides = sides;
		
		this.minLvlUpHp = minLvlUpHp;
		
	}
	
}
