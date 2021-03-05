import java.util.*;
public class IPL extends Match {
	public  float calculateRunRate()
    {
 	   
    	float runrate = (float)(getTarget()-getCurrentScore())/(calculateBalls()/6);
 	   return runrate;
    }
    public int calculateBalls()
    {
    	 int rem = (int)((20*6)-(getCurrentOver()*6));
  	   return rem;
    }
    public void display(double reqRunrate, int balls)
    {
    	final int runs = getTarget()-getCurrentScore();
    	System.out.println("Need "+runs+" "+"in"+" "+balls+" "+"balls");
 	   System.out.println("Required run rate is : "+(float)reqRunrate);
    }
	

}
