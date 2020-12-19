import java.lang.*;
import java.io.*;
public class Patt{

    //TODO-1
    /*
    This is the Main class function. You application would start from here -
    But all the logics/methods should move into more meaningful methods
    */
	public static void main(String[] args) {

        //TODO-2
        //Make the user input this number on the command line
        int inputNumber = 9;

        for (int i=0; i <inputNumber; i++ ) {
            for (int j=1; j<i; j++ ) {
                System.out.print("*");
            }
            System.out.printf("%n");
        }		
	}

    /*
    //Alwasys write Comments on top of the mehtod
    public void printMyStart() { 

        //Printing start logic here
     
    }
    */
}