
package printpackage;

import java.io.*;
import java.lang.*;
import java.util.*;

public class PrintLogic 
{

    //PUBLIC - ACCESS SPECIFIERS
    //VOID   - RETURN TYPE  - Void means no return type is required, 

    //the mehtods tell the java compiler that I am not returning anything

    //Give meaningful names to the method.
    public void printStarPattern() 
    {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. upto which u want the pattren to print: ");
        int s= sc.nextInt();
        
        /*
        This is the main application login - printing stars
        Think about counter and how will this be execute
        Try to do a dry run
        */
		for (i=0; i<s ;i++ )
		{
			for (j=0; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.printf("%n");
		}
        //You'll have to write this if method is defined as non-void
        //For Void Methods you will not return anything.
		//return 1;
	}
}