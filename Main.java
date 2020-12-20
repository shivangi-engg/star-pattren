

//Package IMPORT
import printpackage.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{   
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of pattern from the following options: 1.simple  2.odd   3.reverse  4.crown");
        String name = sc.nextLine();
        switch(name)
        {
            case "simple":
                //for simple pattern
                printpackage.PrintLogic printLogicInstance = new printpackage.PrintLogic();
                printLogicInstance.printStarPattern();
                break;


            case "odd":
                //for odd pattern
                printpackage.PrintLogicOdd printLogicOddInstance = new printpackage.PrintLogicOdd();
                printLogicOddInstance.printoddstarpattern();
                break;


            case "reverse":
                //for reverse pattern
                printpackage.PrintLogicReverse PrintLogicReverseInstance = new printpackage.PrintLogicReverse();
                PrintLogicReverseInstance.printReversePattern();
                break;


            case "crown":  
                //for crown paatern
                printpackage.PrintLogicCrown PrintLogicCrownInstance = new printpackage.PrintLogicCrown();
                PrintLogicCrownInstance.printCrownPattern();
                break;

            default:
                System.out.println("thats not an option");
         }
	}


}