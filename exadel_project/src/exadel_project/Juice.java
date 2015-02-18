package exadel_project;

public class Juice implements Comparable<Juice> {
	private String[] names;
	private int numberOfNames;
	
	public Juice(String[] name) {
		names = name;
		numberOfNames = name.length;
	}
	public int getNumberOfNames()
	{
		return numberOfNames;
	}
	public String getElement(int j) 
	{
		if(j < 0 || j > numberOfNames)
			return "No such element";
		return names[j];
	}
	public boolean fruitsMatch(Juice tmp)
	{
		int result = this.compareTo(tmp);
		if(result == 0) return true;
		else {
			int count = 0;
			for(int i = 0 ; i < names.length ; i ++)
			{
				for(int j = 0; j < tmp.names.length; j++)
				{
				if((tmp.names[j].compareTo(names[i])==0))
					count++;
				}
			}
			if(count!=names.length) return false;
		return true;
		}
	}	
	public int compareTo(Juice o) {
		if(names.length == o.names.length)
		{
			for(int i = 0 ; i < names.length; i ++)
				if(names[i].compareTo(o.names[i])!= 0)
					return names[i].compareTo(o.names[i]);
				return 0;
		}
		else return names.length - o.names.length;
	}
}