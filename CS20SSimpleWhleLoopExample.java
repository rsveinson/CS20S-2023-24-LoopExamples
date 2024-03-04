import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;

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

        Random random = new Random();
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

        //prompt = "Enter a number, -1 to quit";
        prompt = "Generate some random nubmers between x and y";
        System.out.println(prompt);

        // ***** Main Processing *****

        // add pre-loop processing
        // set counters to 0
        // set summing variables to 0
        // set other variables and values as needed

        // prime the loop a.k.a initialize the control variable
        n = scanner.nextInt();
        //n = random.nextInt(50);     // generate a random number between x and y
        //System.out.println(n);

        while(n != 0){         // n == 0

            System.out.println("The number is " + n);
            
            // counting iterations
            // event counting
            
            // iteration sum
            // event sum

            // update the control variable
            System.out.println(prompt);
            n = scanner.nextInt();
            //n = random.nextInt(50);     // generate a random number between x and y           
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
