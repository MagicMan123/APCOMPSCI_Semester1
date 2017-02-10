public abstract class Console extends GameSystem
{
	public Console(String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	public abstract String getPlatform();
	
	public String toString()
	{
		return "Platform: " + platform + "\nSerial #: " + serialNo + "\nController : " + getController() + "\n";
	}
}