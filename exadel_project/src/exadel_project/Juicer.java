package exadel_project;

import java.util.ArrayList;

public class Juicer{
	boolean isCleaned;	
	private ArrayList<String> lastFruitsLoaded;	
	ArrayList<String> fruitsToLoad;
	
	public Juicer(){};
	public Juicer(Juice newJuice){};
	
	void loadFruits(ArrayList<String> newFruits){};
	void cleanJuicer(){};
	void getLastLoadedFruits(){};
}
