import java.util.Arrays;
import java.util.ArrayList;

public class toystore
{
	private ArrayList<Toy> toyList;
	
	public toystore()
	{
		toyList = new ArrayList<>();
	}
	
	public toystore(String n)
	{
		loadToys(n);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		
		for(int i=0;i<toys.size();i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy t = getThatToy(name);
			if(t == null)
			{
				if(type.equals("AF"))
				{
					toyList.add(new Afigure(name));
				}
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
			}
			else
			{
				t.setCount(t.getCount()+1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy i : toyList)
		{
			if( i.getName().equals(nm))
			{
				return i;
			}
		}
		return null;
	}
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy i : toyList)
		{
			if(max < i.getCount())
			{
				max = i.getCount();
				name = i.getName();
			}
		}
		return name;
	}
	
	public int getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy i : toyList)
		{
			if(i.getType().equals("AF"))
			{
				figures =+ 1;
			}
			if(i.getType().equals("Car"))
			{
				cars =+ 1;
			}
		}
		if(cars > figures)
		{
			return cars;
		}
		else
		{
			return figures;
		}
	}
	
	public String toString()
	{
		return ""+toyList;
	}
}