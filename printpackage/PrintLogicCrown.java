package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
public class PrintLogicCrown
{
	public void printCrownPattern()
	{
		int i,j,k;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no. of lines u want:");
		int n = sc.nextInt();
		for(i=0; i<n; i++)
		{
			for(j=0;j<=i; j++)
			{
				System.out.print("*");
			}
			for(k=n+1; k>=i*2; k--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.printf("%n");
		}
	}
}