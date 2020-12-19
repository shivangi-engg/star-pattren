package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
//this class contains logic for printing odd pattern
public class PrintLogicOdd
{
    public void printoddstarpattern()
    {
        int p,q;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of lines u want");
        int r= sc.nextInt();
        //logic for printing odd pattern
        for (p=0; p<r; p++)
        {
            for (q=0; q<=p*2;q++)
            {
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }
}