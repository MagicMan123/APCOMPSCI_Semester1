import java.util.ArrayList;

public class satellite
{
	private static double movex, movey; 
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {3, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new Gmc(3, 8));


       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================\n";
		for (Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }

	   printout +="\n\n==========================\n";
	   
       for (Location l : locate)
       {
		   movex = (double)(Math.random()*100);
		   movey = (double)(Math.random()*100);
		   
		   String movex1 = String.format("%.2f", movex);
		   String movey1 = String.format("%.2f", movey);
		   
           printout += "After " + l.getID() + " Moved (" + movex1 + ", " + movey1 + ")\n";
		   printout += "New Location: (" + getLocation(l.getLoc()) + ")\n";
       }


       printout += "\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           printout += "\n\tDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }


       System.out.println(printout);
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow((car[0]+movex) - home[0], 2)+ Math.pow((car[1]+movey) - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("%.2f" + ", " + "%.2f",loc[0]+movex,loc[1]+movey);
   }
}