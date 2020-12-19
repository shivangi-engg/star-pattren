import java.lang.*;
import java.io.*;
import java.util.*;
abstract class main
{
	//this is an abstract method 
	abstract int formula();
}
class logic extends main 
{
	//here in this method the logic for pattren is given
	int formula()
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. upto which u want the pattren to print: ");
		int s= sc.nextInt();
		for (i=0;i<s ;i++ )
		{
			for (j=1;j<i ;j++ ) 
			{
				System.out.print("*");
			}
			System.out.printf("%n");
		}
		return 1;
	}
}
public class Starpattern
{
	public static void main(String[] args) 
	{
		main object= new logic();
		System.out.print(object.formula());
		
	}


}