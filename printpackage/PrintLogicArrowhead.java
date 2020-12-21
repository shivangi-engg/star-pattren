package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
//this class onatins logic for arrowhead patern
public class PrintLogicArrowhead
{
	//method of class
	public void printarrowheadpattern()
	{
		int i,j,k,l;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of arrow head");
		int n= sc.nextInt();

		// logic for the pattern
		//logic for increasing side of arrowhead
		for (i=0;i<n ;i++ ) 
		{
			for (j=1;j<=i ;j++ ) 
			{
				System.out.print(" ");	
			}
			System.out.println("*");
			
		}

		//logic for decreasing side of arrowhead
		for (k=n-1;k>0 ;k-- ) 
		{
			for (l=k-1;l>0 ;l-- ) 
			{
				System.out.print(" ");		
			}	
			System.out.println("*");
		}
	}
}