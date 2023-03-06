import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * A simple class called Tutorial to design and inplement programs on Selection
 * (if statement)and iteration (looping)
 * 
 * @author Morgan Dale
 * @version 1.0.0
 * 
 */
public class Tutorial {
    private String myTutorial;

    /**
     * Constructor for objects of class Tutorial
     */
    public Tutorial() {
        // initialise instance variables
        myTutorial = "";
    }

    /**
     * Example 1
     * The following program (method) prints all even number between 0 and 40
     * inclisive using a while loop
     */
    public void displayEven() // methode header

    { // start of method body

        int number; // declaring a variable called number of type int
        number = 0; // initiallising number to 0
        while (number <= 40) { // the while loop header
            System.out.println(number); // print statement
            number = number + 2; // increment number by 2
        }
    } // end of method

    /**
     * Exercise 1
     */

    public void displayOdd() {
        for (int i = 3; i <= 33; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Exercise 2
     */

    public void multipleOfFive() {
        for (int i = 20; i <= 85; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Exercise 3
     */

    public void sum(int a, int b) {
        int sum = 0;
        while (a <= b) {
            sum += a;
            a++;
        }
        System.out.println(sum);
    }

    /**
     * Exercise 4
     */
    public void reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        System.out.println(reverse);
    }

    /**
     * Exercise 5
     */

    public void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    /**
     * Exercise 6
     */

    public void isLeap(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap");
        } else {
            System.out.println("Not Leap");
        }
    }

    /**
     * Exercise 7: challenge exercise
     */

    public void extractAndPrint(int number) {
        ArrayList<String> digits = new ArrayList <String>();
        String finalString = "";
        digits.addAll(Arrays.asList("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"));
        
        while (number != 0) {
            int digit = number % 10;
            finalString = digits.get(digit) + " " + finalString;
            number = number / 10;
        }
        System.out.println(finalString);
    }

    public static void main(String args[]) {
        Tutorial myTutorial = new Tutorial();
        myTutorial.displayOdd();
        myTutorial.displayEven();
        myTutorial.multipleOfFive();
        myTutorial.sum(1, 5);
        myTutorial.reverse(12345);
        myTutorial.evenOrOdd(5);
        myTutorial.evenOrOdd(2);
        myTutorial.isLeap(2000);
        myTutorial.isLeap(1800);
        myTutorial.isLeap(1955);
        myTutorial.extractAndPrint(12345);
    }

}
