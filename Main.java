

//Package IMPORT
import printpackage.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{   
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of pattern from the following options: 1 for simple, 2 for odd, 3 for reverse,  4 for crown, 5 for arrowhead, 6 for  diamond");
        int name = sc.nextInt();
        switch(name)
        {
            case 1:
                //for simple pattern
                printpackage.PrintLogic printLogicInstance = new printpackage.PrintLogic();
                printLogicInstance.printStarPattern();
                break;


            case 2:
                //for odd pattern
                printpackage.PrintLogicOdd printLogicOddInstance = new printpackage.PrintLogicOdd();
                printLogicOddInstance.printoddstarpattern();
                break;


            case 3:
                //for reverse pattern
                printpackage.PrintLogicReverse PrintLogicReverseInstance = new printpackage.PrintLogicReverse();
                PrintLogicReverseInstance.printReversePattern();
                break;


            case 4:  
                //for crown paatern
                printpackage.PrintLogicCrown PrintLogicCrownInstance = new printpackage.PrintLogicCrown();
                PrintLogicCrownInstance.printCrownPattern();
                break;

                    //for arrowhead pattern
            case 5:
                printpackage.PrintLogicArrowhead PrintLogicArrowheadInstance =new printpackage.PrintLogicArrowhead();
                PrintLogicArrowheadInstance.printarrowheadpattern();
                break;
                

                //for diamond pattern
            case 6:
                printpackage.PrintLogicDiamond PrintLogicDiamondInstance = new printpackage.PrintLogicDiamond();
                PrintLogicDiamondInstance.printDiamondPattern();
                break;


            default:
                System.out.println("thats not an option");
         }
	}


}