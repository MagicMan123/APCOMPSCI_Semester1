public class human_class
{
	private String eyes, hair, ethni;
	
	public human_class()
	{
		eyes = "";
		hair = "";
		ethni = "";
	}
	
	public human_class(String eye, String hairs, String ethnis)
	{
		eyes = eye;
		hair = hairs;
		ethni = ethnis;
	}
	
	public void seteyes(String eye)
	{
		eyes = eye;
	}
	
	public void sethair(String hairs)
	{
		hair = hairs;
	}
	
	public void setethni(String ethnis)
	{
		ethni = ethnis;
	}
	
	public String geteyes()
	{
		return eyes;
	}
	
	public String gethair()
	{
		return hair;
	}
	
	public String getethni()
	{
		return ethni;
	}
}