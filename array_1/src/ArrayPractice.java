
/**
 * Write a description of class ArrayPractice here.
 * 
 * @author Morgan Dale
 * @version 1.0.0
 */
public class ArrayPractice {
    // instance variables - in this class we have no fields so this
    // part is empty

    /**
     * Constructor for objects of class ArrayPractice
     */
    public ArrayPractice() {
    }

    /**
     * Exercise 1
     */
    public void PrintArray() {
        // An array of numbers
        int[] numbers = { 4, 1, 22, 9, 14, 3, 9 };
        // Add code here to display the numbers
        System.out.println(numbers);
    }

    /**
     * Exercise 2
     */
    public void smallestNumber() {
        // an array of numbers
        int[] numbers = { 4, 1, 22, 9, 14, 3, 9 };
        // add code here to display the smallest number in the array
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is " + smallest);
    }

    /**
     * Exercise 3
     */
    public void largestNumber() {
        // an array of numbers
        int[] numbers = { 4, 1, 22, 9, 14, 3, 9 };
        // add code here to display the largest number in the array
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number is " + largest);
    }

    /**
     * Exercise 4
     */
    public void PrintFibonacci() {
        int[] fib = new int[20];

        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(fib[i]);
        }
        
    }

    /**
     * Exercise 5a
     * In this activity you are to calculate and display the average mark from
     * a set of marks allocated by a tutor.
     * 
     * In this method you are to use a for loop.
     */
    public void markAnalysisFor() {
        float[] marks = { 48.2f, 87.2f, 67.1f, 47.0f, 32.8f, 53.2f, 55.1f, 61.3f, 41.1f };

        // Getting average mark
        float total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        float average = total / marks.length;

        // Displaying average mark
        System.out.println("The average mark is " + average);
    }

    /**
     * Exercise 5b
     * In this activity you are to calculate and display the average mark from
     * a set of marks allocated by a tutor.
     * 
     * In this method you are to use a while loop.
     */
    public void markAnalysisWhile() {
        float[] marks = { 48.2f, 87.2f, 67.1f, 47.0f, 32.8f, 53.2f, 55.1f, 61.3f, 41.1f };

        // Getting the average mark with a while loop
        float total = 0;
        int i = 0;
        while (i < marks.length) {
            total += marks[i];
            i++;
        }
        float average = total / marks.length;

        // Displaying average mark
        System.out.println("The average mark is " + average);
    }

    /**
     * Exercise 5c
     * In this activity you are to calculate and display the average mark from
     * a set of marks allocated by a tutor.
     * 
     * In this method you are to use a for-each loop.
     */
    public void markAnalysisForEach() {
        float[] marks = { 48.2f, 87.2f, 67.1f, 47.0f, 32.8f, 53.2f, 55.1f, 61.3f, 41.1f };

        // Getting the average mark with a for-each loop
        float total = 0;
        for (float mark : marks) {
            total += mark;
        }
        float average = total / marks.length;

        // Displaying average mark
        System.out.println("The average mark is " + average);
    }

}
