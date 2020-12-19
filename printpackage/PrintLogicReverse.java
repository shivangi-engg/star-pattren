package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
//this class contains logic for printing a pattern and then its reverse
public class PrintLogicReverse
{
	public void printReversePattern()
	{
		int a,b,c,d;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no. of lines you want");
		int n=sc.nextInt();
		for (a=0;a<n ;a++ )
		{
			for (b=0;b<=a ;b++ ) 
			{
				System.out.print("*");
			}
			System.out.printf("%n");
		}
		for (c=n-1;c>0 ;c-- ) 
		{
			for (d=c-1;d>=0 ;d-- ) 
			{
				System.out.print("*");	
			}
			System.out.printf("%n");
			
		}
	}

}