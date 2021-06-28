import java.io.*;
class Reverse
{
public static void main(String args[])
{
int n=456,rev=0,r;
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.println("REVERSE OF THE GIVEN NUMBER IS:"+rev);
}
}