package exadel_project;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Demonstration {
	public static void main(String[] args) throws IOException {
		// reading
		FileReader t = new FileReader();
		// creating Juicer
		Juicer new_juicer = new Juicer();
		// creating array of juices
		ArrayList<Juice> juices = t.getSortedByName();
		Collections.sort(juices);
		// finding minimun number of cleanings
		new_juicer.optimizeCleaning(juices);
		int numberOfCleanings = new_juicer.minimumNumberOfCleanings;
		// writing to juice3.out
		PrintWriter output3 = new PrintWriter(new FileWriter("juice3.out"));
		output3.print(numberOfCleanings);		
		output3.close();
	}
}
