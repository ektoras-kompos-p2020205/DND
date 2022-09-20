import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// sysout
		
		/*Scanner lol = new Scanner(System.in);
		
		System.out.println("onoma?");
		String onoma = lol.nextLine();
		
		System.out.println("hlikia?");
		int age = lol.nextInt();
		
		System.out.println("hlikia?");
		age = lol.nextInt();

		lol.nextLine();
		System.out.println("onoma?");
		String skasq = lol.nextLine();*/
		
		/*int sex = 10;
		
		//sex = sex/3;
		
		System.out.println((double) sex/3);
		System.out.println(sex);*/
		
		/*for(int i=0; i<1; i++) {
			Dice.rollDice(3,6);

		}		*/
		
		/*ArrayList<Race> raceList = new ArrayList<Race>();
		
		raceList = FileRead.raceRead();
		
		Player p1 = new Player("jkjk","Deep Gnome",11,11,11,11,11,11,raceList);
		System.out.println(p1);*/
		
		File folder = new File("src\\Classes");
		File[] listOfFiles = folder.listFiles();
		
		for (int i = 0; i < listOfFiles.length; i++) {
			  File file = listOfFiles[i];
			  if (file.isFile() && file.getName().endsWith(".csv")) {
			    //String content = FileUtils.readFileToString(file);
				  String s = file.getName();
				  
				  System.out.println(file);
				  System.out.println(s.substring(0,s.length() - (".csv").length()));
				  
				  try {
						BufferedReader reader = new BufferedReader(new FileReader(file));
						String line = "";
						
						while((line = reader.readLine()) != null) {
							
							System.out.println(line);
							/*String[] row = line.split(",");
							
							raceName = row[0];
							plusStrength = Integer.parseInt(row[1]);
							plusDexterity = Integer.parseInt(row[2]);
							plusConstitution = Integer.parseInt(row[3]);
							plusIntelligence = Integer.parseInt(row[4]);
							plusWisdom = Integer.parseInt(row[5]);
							plusCharisma = Integer.parseInt(row[6]);
							
							raceList.add(new Race(raceName, plusStrength, plusDexterity, plusConstitution, 
							plusIntelligence, plusWisdom, plusCharisma));*/
						}
						
						reader.close();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
			  } 
			}
	}

}
