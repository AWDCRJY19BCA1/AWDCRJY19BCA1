import java.io.*;
import java.util.*;
class Leap
{
public static void main (String[] args)
{
          int y;
              System.out.println("Enter year");
             Scanner n= new Scanner (System.in);
                y=n.nextInt();
             if(y%400==0)&&(y%100==0)&&(y%4==0)
           {
           System.out.println(" Given is Leap year");
           }
          else
           {
        System.out.println("Not a leap year");
           }
}
}
//output
//Enter year
//1969
//Not a leap year
