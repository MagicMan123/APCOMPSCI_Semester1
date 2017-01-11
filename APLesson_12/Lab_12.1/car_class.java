public class car_class
{
	private String color, interior, engine, tires;
	
	public car_class()
	{
		color = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public car_class(String col, String inter, String eng, String tire)
	{
		color = col;
		interior = inter;
		engine = eng;
		tires = tire;
	}
	
	public void setcolor(String col)
	{
		color = col;
	}
	
	public void setinterior(String inter)
	{
		interior = inter;
	}
	
	public void setengine(String eng)
	{
		engine = eng;
	}
	
	public void settires(String tire)
	{
		tires = tire;
	}
	
	public String getcolor()
	{
		return color;
	}
	
	public String getinterior()
	{
		return interior;
	}
	
	public String getengine()
	{
		return engine;
	}
	
	public String gettires()
	{
		return tires;
	}
}