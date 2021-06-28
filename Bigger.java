import java.io.*;
class Bigger
{
public static void main (String []bg)
{
         int a=5,b=2,c=3,d=4;
         int x,y;
          x=a>b?a:b;//used ternary operator
          y=c>d?c:d;
          if(x>y)
System.out.println ("Biggest number---"+x);
         else
System.out.println("Biggest number ---"+y);
}
}
//output
//Biggest number---5 
