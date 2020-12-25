package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
//this class contains logic for printing a pattern and then its reverse
public class PrintLogicDiamond
{
	public void printDiamondPattern()
	{
		int i,j,k,l,m,p;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no. of lines you want");
		int n=sc.nextInt();
		for (i=0;i<n ;i++ ) 
		{
			for (j=n-2;j>=i ;j-- ) 
			{
				System.out.print(" ");
			}
			for (k=0; k<=i*2;k++) 
			{
				System.out.print("*");
			}
			System.out.printf("%n");	
		}
		for (l=n-1;l>0 ;l-- ) 
		{
			for (m=n;m>l ;m--) 
			{
				System.out.print(" ");		
			}
			for (p=l*2;p>1 ;p-- ) 
			{
				System.out.print("*");		
			}	
			System.out.printf("%n");
		}
	}

}