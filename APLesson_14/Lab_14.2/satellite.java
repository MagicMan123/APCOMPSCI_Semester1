import java.util.ArrayList;

public class satellite
{
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
		   double movex = (int)(Math.random()*10000);
		   double movey = (int)(Math.random()*10000);
		   movex = movex/100.0;
		   movey = movey/100.0;
           printout += "After " + l.getID() + " Moved (" + getLocation(l.getLoc()) + ")\n";
		   l.move(movex,movey);
		   printout += "New Location: (" + getLocation(l.getLoc()) + ")\n\n";
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
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}