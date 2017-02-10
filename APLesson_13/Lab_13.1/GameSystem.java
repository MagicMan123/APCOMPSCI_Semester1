public abstract class GameSystem
{
	String platform;
	int serialNo;
	
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = (int)(Math.random() * 10000000);
	}
	
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 10000000);
	}
	
	public String getPlatform()
	{
		return this.platform;
	}
	
	public int getSerialNo()
	{
		return this.serialNo;
	}	
}