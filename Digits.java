import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int m,ev=0,od=0,n;
		Scanner b = new Scanner(System.in);
		System.out.println("Enter a number");
		m=b.nextInt();
		while(m>0)
		{   n=m%10;
		if(n%2==0)
		{
		    ev++;
		}
		else
    {
		    od++;
		}
		    m=m/10;
		}
		System.out.println("Odd digits--->"+od+",Even digits--->"+ev);
	}
}
//output
//Enter a number
//983827
//Odd digits---> 3
//Even digits---> 3
