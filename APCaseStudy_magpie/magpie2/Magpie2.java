public class Magpie2
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";

		if(statement.length() == 0)
		{
			response = "Say something, please.";
		}


		if (findKeyword(statement,"no",0) >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement,"mother",0) >= 0
				||findKeyword(statement,"father",0) >= 0
				|| findKeyword(statement,"sister",0) >= 0
				|| findKeyword(statement,"brother",0) >= 0)
		{
			response = "Tell me more about your family.";
		}

		 else if (findKeyword(statement,"cat",0) >= 0
				||findKeyword(statement,"dog",0) >= 0
				|| findKeyword(statement,"fish",0) >= 0
				|| findKeyword(statement,"turtle",0) >= 0)
		{
			response = "Tell me more about pet.";
		}
		
		else if (findKeyword(statement, "i want to", 0) >= 0)
		{
		  response = transformIWantToStatement(statement);
		}
		
		else if (findKeyword(statement, "i like you", 0) >= 0)
		{
		  response = transformIlikeYouStatement(statement);
		}
		 
		else
		{
		  int psn = findKeyword(statement, "you", 0);


		  if (psn >= 0
				&& findKeyword(statement, "me", psn) >= 0)
		  {
				response = transformYouMeStatement(statement);
		  }
		  else
		  {
			 response = getRandomResponse();
		  }
		}
		return response;
	}

	private String transformIWantToStatement(String statement)
	{
		String phrase = statement.trim().toLowerCase();
		String lastChar = phrase.substring(phrase.length());
		if(lastChar.equals("."))
		{
			phrase.replace(".","");
		}
		
		int psn = findKeyword(phrase,"i want to ",0);
		String restOfStatement = phrase.substring(psn+10);
		
		return "What would it mean to" + restOfStatement;
	}
	
	private String transformIlikeYouStatement(String statement)
	{
		String phrase = statement.trim().toLowerCase();
		String lastChar = phrase.substring(phrase.length());
		if(lastChar.equals("."))
		{
			phrase.replace(".","");
		}
		
		int psn = findKeyword(phrase,"i like you",0);
		String restOfStatement = phrase.substring(psn+10);
		
		return "Why do you like me?";
	}
	
	private String transformYouMeStatement(String statement)
	{
		String phrase = statement.trim().toLowerCase();
		String lastChar = phrase.substring(phrase.length());
		if(lastChar.equals("."))
		{
			phrase.replace(".","");
		}
		
		int psnOfYou = findKeyword(phrase,"you",0);
		int psnOfMe = findKeyword(phrase,"me",psnOfYou+3);
		
		String restOfStatement = phrase.substring(psnOfYou+3,psnOfMe);
		
		return "What makes you think that I" + restOfStatement + "you?";
	}
	
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		
		int psn = phrase.indexOf(goal, startPos);
		
			String before = "";
			String after = "";
			while(psn >= 0)
			{
				if(psn > 0)
				{
					before = String.valueOf(phrase.charAt(psn-1));
				}
				if(goal.length()<= phrase.length()-(psn+1))
				{
					after = String.valueOf(phrase.charAt(psn+goal.length()));
				}
				if((before.compareTo("A")<= -1) && (after.compareTo("A")<= -1))
				{
					return psn;
				}
				psn = phrase.indexOf(goal, psn+1);
			}
		return -1;
	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
