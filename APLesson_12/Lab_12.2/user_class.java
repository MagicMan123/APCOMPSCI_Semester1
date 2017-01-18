public class user_class
{
	private String firstName, lastName, avatar;
	
	public user_class(String fN, String lN, String av)
	{
	   firstName = fN;
	   lastName = lN;
	   avatar = av;
	}
	
	public user_class(String fN, String lN)
	{
	   firstName = fN;
	   lastName = lN;
	   avatar = "undefined";
	}
	
	public void setavatar(String av)
	{
		avatar = av;
	}
	
	public String toString()
	{
	   return "Customer Info...\nFirst Name: " + firstName +"\nLast Name: " + lastName +"\nAvatar: " + avatar;
	}
}