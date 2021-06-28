import java.io.*;
import java.util.*;
class Reverse
{
public static void main(String args[])
{
int n,rev=0,r;
  System.out.println("Enter a number");
  Scanner e=new Scanner(System.in);
  n=e.nextInt();
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.println("REVERSE OF THE GIVEN NUMBER IS:"+rev);
}
}
//output
//Enter a number
//2396
//REVERSE OF THE GIVEN NUMBER IS : 6932
