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
       	if(z%2==0)
	   {
	     System.out.println(z+"");
          
     	}
	    }
	    break;
    }
    }
}
//output
//enter the low and high ranges
//10 65
//64
//62
//60
//58
//56
//54
//52
//50
//48
//46
//44
//42
//40
//38
//36
//34
//32
//30
//28
//26
//24
//22
//20
//18
//16
//14
//12
//10
