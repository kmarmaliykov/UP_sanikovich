package exadel_project;
import java.util.ArrayList;

public class Juicer {
	public static ArrayList<Juice> juicesToProcess = new ArrayList<Juice>();	
	public int minimumNumberOfCleanings = 0 ;	
	public static void addJuice(Juice var) 
	{
		juicesToProcess.add(var);
	}
	public static void printJuicesInJuicer()
	{
		for (Juice s : juicesToProcess) {
			System.out.println(s.toString());
		}
	}	
	public  void optimizeCleaning(ArrayList<Juice> tmpJuices){
		while(!tmpJuices.isEmpty()){
			Juice currentJuice = tmpJuices.get(0);
			for( int j = 1 ; j < tmpJuices.size() ; ){
				Juice tmp = tmpJuices.get(j);
				if(currentJuice.fruitsMatch(tmp)){
					tmpJuices.remove(currentJuice);
					currentJuice = tmp;
				}
				else
					j++;
			}
			tmpJuices.remove(currentJuice);
			minimumNumberOfCleanings++;
		}
	}
}