import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Simple While Loop
 * 
 *  Description:    An example of a simple while loop
 *                  the stopping condition can be changed
 *                  to demonstrate different loop varieties
 * 
 *************************************************************/

public class CS20SSimpleWhleLoopExample {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        // ** example variables **
        
        int n = 0;      // number read from keyboard
    
    // ***** objects *****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Simple While Loop" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
    
    // ***** Get Input *****
    
        prompt = "Enter a number, -1 to quit";
        System.out.println(prompt);
    
    // ***** Main Processing *****
    
        // prime the loop a.k.a initialize the control variable
        n = scanner.nextInt();
        //System.out.println(n);
        
        while(n >= -1){
            System.out.println("here are the instructions ");
            System.out.println("to be repeated. Calculations,");
            System.out.println("formatted output, etc..");
            
            // formatted output might go here
            System.out.println("The number is " + n);
            
            // update the control variable
            System.out.println(prompt);
            n = scanner.nextInt();           
        }// end while not 0
    
        // post-loop processing
        // i.e. calcualte the average of the numbers entered
    
    // ***** Print Formatted Output *****
    
        // print summary info
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");

    } // end main    
} // end FormatTemplate
