import java.util.Random;

public abstract class Dice {
	
	public static int roll(int sides) {
		Random dice = new Random();
		
		int result = dice.nextInt(sides)+1;
		
		return result;
	}
	
	public static int rollDice(int times, int sides) {
		int roll, result = 0;
		
		for(int i=1; i<=times; i++) {
			roll = roll(sides);
			System.out.println(roll);
			result = result+roll;
		}
		
		System.out.println(result);
		return result;
	}
	
	public static int rollDice(int times, int sides, int plus) {
		int roll, result = 0;
		
		for(int i=1; i<=times; i++) {
			roll = roll(sides);
			System.out.println(roll);
			result = result+roll;
		}
		
		result = result+plus;
		
		System.out.println("(+" + plus + ")");
		System.out.println(result);
		return result;
	}
}
