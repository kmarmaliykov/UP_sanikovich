package exadel_project;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FileReader{
	private ArrayList<Juice> fruitsToSort = new ArrayList<Juice>(); 
	private ArrayList<String> sortedByName = new ArrayList<String>();
	private Set<String> Fruits = new LinkedHashSet<String>(); // set is used to avoid dublicates
	{
		try {
			String filename = "juice.in";
			FileInputStream fin = new FileInputStream(filename);
			InputStreamReader in = new InputStreamReader(fin);
			BufferedReader r = new BufferedReader(in);			
			String tmpBuffer;		
			while ((tmpBuffer = r.readLine()) != null) {
				if(tmpBuffer.isEmpty()) continue;
				String[] buffer = tmpBuffer.split(" ");				
				for(int i = 0; i < buffer.length; i++)
				{
					Fruits.add(buffer[i]);
				}				
				Juicer.addJuice(new Juice(buffer));
				Arrays.sort(buffer);
				fruitsToSort.add(new Juice(buffer));
			}
			r.close();			
			for(int i = 0; i < Juicer.juicesToProcess.size(); i++)
				for(int j = 0; j < Juicer.juicesToProcess.get(i).getNumberOfNames(); j++)
					sortedByName.add(Juicer.juicesToProcess.get(i).getElement(j));
			Collections.sort(sortedByName, new Comparator<String>() {
				public int compare(String name1, String name2) {
					return name1.compareTo(name2);
				}
			});
			PrintWriter output1 = new PrintWriter(new FileWriter("juice1.out"));
			for(String s : Fruits)
				{
					output1.print(s + '\n');	
				}
			output1.close();
			PrintWriter output2 = new PrintWriter(new FileWriter("juice2.out"));
			for(String s : sortedByName)
			{
				output1.print(s.toString() + '\n');
			}
			output2.close();
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		@SuppressWarnings("unchecked")
		public ArrayList<Juice> getSortedByName() {
			return (ArrayList<Juice>)fruitsToSort.clone();
		}
		
}