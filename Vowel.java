import java.io.*;
import java.util.*;
public class Vowel
{
	public static void main(String[] code) {
	 char inp;
	 System.out.println("Enter a letter");
	 Scanner s = new Scanner(System.in);
	 inp = s.next().charAt(0);
	 switch(inp)
	 {
	     case 'a':
	     case 'A': 
	     case 'e':
	     case 'E':
	     case 'i':
	     case 'I':
	     case 'o':
	     case 'O':
	     case 'u':
	     case 'U': System.out.println(" given letter is vowel");
	                                         break;
	                                        
	                                         default: System.out.println(" given letter is Consonant");
     
	 }
	}
}
