import java.io.*;
import java.util.*;
public class Reverse
{
	public static void main(String[] args)
  {
      int x,y;
    System.out.println("enter the low and high ranges");
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    y=s.nextInt();           
    while(x!=y)
    {
	    for(int z=y;z>=x;z--)
	    {
       	if(x%2==0)
	   {
	     System.out.println(x+"");
          
     	}
	    }
	    break;
    }
    }
}
