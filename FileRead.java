import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public abstract class FileRead {
	
	public static ArrayList<Race> raceRead() {
		
		String raceName;
		int plusStrength;
		int plusDexterity;
		int plusConstitution;
		int plusIntelligence;
		int plusWisdom;
		int plusCharisma;
		
		ArrayList<Race> raceList = new ArrayList<Race>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src\\Races.csv"));
			String line = "";
			
			while((line = reader.readLine()) != null) {
				
				System.out.println(line);
				String[] row = line.split(",");
				
				raceName = row[0];
				plusStrength = Integer.parseInt(row[1]);
				plusDexterity = Integer.parseInt(row[2]);
				plusConstitution = Integer.parseInt(row[3]);
				plusIntelligence = Integer.parseInt(row[4]);
				plusWisdom = Integer.parseInt(row[5]);
				plusCharisma = Integer.parseInt(row[6]);
				
				raceList.add(new Race(raceName, plusStrength, plusDexterity, plusConstitution, 
				plusIntelligence, plusWisdom, plusCharisma));
			}
			
			reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(raceList);
		 
		return raceList;
	}

}
