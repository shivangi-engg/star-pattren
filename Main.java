
//Package IMPORT
import printpackage.*;

public class Main
{
	public static void main(String[] args) 
	{   
        //No need to mention this as a main object
		printpackage.PrintLogic printLogicInstance = new printpackage.PrintLogic();
        
        //Simply INVOKE the class method here.
        printLogicInstance.printStarPattern();

        /*TO-DO : Read here
            Because of this line - the compiler was forcing you to create a non void method.
            System.out.printlln is itself a method which aceepts some param. You paaassed a method in that
            which , if returns null, will error out.
        */
        //System.out.print(printLogicInstance.printStarPattern());
		
	}


}