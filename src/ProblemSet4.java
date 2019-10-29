/**
 * Problem Set 4.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();

        // comment out or uncomment as needed

        ps.sum();
        ps.reverse();
        ps.digits();
        ps.average();
        ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();
        //
        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     *
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */

    public void sum() {
      System.out.print("\n");
      System.out.print("Lower Bound: ");
      long lowerBound = in.nextLong();
      System.out.print("Upper Bound: ");
      long upperBound = in.nextLong();
      long sum = 0;

      while (lowerBound >= upperBound) {
        System.out.print("Lower Bound: ");
        lowerBound = in.nextLong();
        System.out.print("Upper Bound: ");
        upperBound = in.nextLong();
      }
      for (long i = lowerBound; i <= upperBound; i++) {
        if (i % 2 == 0){
          sum = sum + i;
        } else {}
      }
      System.out.printf("\n%,d." ,sum);


    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */

    public void reverse() {
      long reverseInt = 0;
      long lastDigit = 0;
      boolean oneDigit = false;
      System.out.println("\n");
      do {
      System.out.print("Enter a positive integer: ");
      reverseInt = in.nextLong();
    } while (reverseInt <=0);
    System.out.print("\n");
      do {
          lastDigit = reverseInt % 10;
          if (reverseInt < 10){
            System.out.printf("%d. ", lastDigit);
            oneDigit = true;
          } else {
          System.out.printf("%d, ", lastDigit);
          reverseInt = reverseInt / 10;
        }
      } while (!oneDigit);


}


    /*
     * Exercise 3.
     *
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */

    public void digits() {
      System.out.println("\n");
      System.out.print("Enter a positive integer: ");
      long oddSumInt = in.nextLong();
      long currentDigit = 0;
      long oddSum = 0;
      while (oddSumInt <= 0){
        System.out.print("Enter a positive integer: ");
        oddSumInt = in.nextLong();
      }
      while (oddSumInt > 0){
        currentDigit = oddSumInt % 10;
        if ((currentDigit % 2) != 0){
          oddSum = oddSum + currentDigit;
        }
        oddSumInt = oddSumInt/10;
      }
      System.out.printf("\n%,d." ,oddSum);
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */

    public void average() {

      long averageInt = 0;
      double averageSum = 0;
      long counter = 0;
      boolean firstInput = true;
      System.out.println("\n");
      while (firstInput){
        System.out.print("Non-negative integers: ");
        averageInt = in.nextLong();
        if (averageInt > 0){
          firstInput = false;
        }
    }
    averageSum = averageSum + averageInt;
    counter++;

    do {
      System.out.print("Non-negative integers: ");
      averageInt = in.nextLong();
      if (averageInt >= 0){
        averageSum = averageSum + averageInt;
        counter++;
      }
    } while (averageInt > 0);

    double average = averageSum/counter;

    System.out.printf("\n%,.2f.\n", average);
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */

    public void prime() {
      boolean inputValid = false;
      System.out.print("\nNon-negative integer: ");
      long number = in.nextLong();
      boolean prime = true;

      while (!inputValid) {
        if (number >= 0) {
          inputValid = true;
        } else{
          System.out.print("Non-negative integer: ");
          number = in.nextLong();
        }
      }
      for (int i = 2; i <= Math.ceil(Math.sqrt(number)) ; i++ ) {
        double testNumber = number;
        if ((testNumber % i) == 0) {
          prime = false;
        }
      }
      if (prime) {
        System.out.println("\nPrime.");
      } else {
        System.out.println("\nNot prime.");
      }

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */

    public void fibonacci() {
      boolean valid = false;
      System.out.print("\nPositive integer: ");
      long nthNumber = in.nextLong();
      long number1 = 0;
      long number2 = 1;
      int i = 1;

      while (!valid) {
        if ((nthNumber > 0) && (nthNumber <= 92)) {
          valid = true;
        } else{
          System.out.print("Positive integer: ");
          nthNumber = in.nextLong();
        }
      }
      while (i <= nthNumber) {
         long sum = number1 + number2;
         number1 = number2;
         number2 = sum;
         i++;
      }
      System.out.println("\n" + number1 + ".");
    }


    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    public void factors() {
      boolean valid = false;
      System.out.print("\nPositive integer: ");
      long number = in.nextLong();


        while (!valid) {
          if (number > 0) {
            valid = true;
          } else{
            System.out.print("Positive integer: ");
            number = in.nextLong();
          }
        }

        System.out.println("");
        System.out.print("1, " + number);

        for (int i = 2; i <= (number /i)  ; i++ ) {
          double testNumber = number;
          if ((testNumber % i) == 0) {
            double otherFactor = number/i;
            long otherFactorInt =  (long)Math.floor(otherFactor + 0.5d);
            System.out.print(", " + i + ", " + otherFactorInt);
          }
        }
        System.out.print(".");

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    public void mario() {
      boolean valid = false;
      System.out.println("\n");
      System.out.print("Height: ");
      long height = in.nextLong();

      while (!valid) {
        if (height > 0 && height <= 24) {
          valid = true;
        } else {
          System.out.print("Height: ");
          height = in.nextLong();
        }
      }

      for (int i = 0; i < height; i++){
        System.out.println();
        for (int spaces = 0; spaces < height - 1 - i; spaces++){
          System.out.print(" ");
        }
        for (int j = 0; j < i + 2 ; j++)
          System.out.print("#");
      }
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    public void luigi() {
      boolean valid = false;
      System.out.println("\n");
      System.out.print("Height: ");
      long height = in.nextLong();

      while (!valid) {
        if (height > 0 && height <= 24) {
          valid = true;
        } else {
          System.out.print("Height: ");
          height = in.nextLong();
        }
      }
      System.out.println("\n");
      for (int i = 0; i < height; i++){
        for (int spaces = 0; spaces < height - 1 - i; spaces++){
          System.out.print(" ");
        }
        for (int j = 0; j < i + 2 ; j++){
          System.out.print("#");
        }
        System.out.print("  ");

        for (int j = 0; j < i + 2 ; j++){
          System.out.print("#");
        }
        for (int spaces = 0; spaces < height - 1 - i; spaces++){
            System.out.print(" ");
      }
        System.out.println();

    }
  }



    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    public void credit() {
       int firstSum = 0;
       int secondSum = 0;
       String sumString = "";
       String cardType = "Invalid";
       long cardNum = 0;
       String cardString = "";
       System.out.print("\nNumber: ");
       cardNum = in .nextLong();
       cardString = Long.toString(cardNum);

       while (cardNum <= 0) {
           System.out.print("Number: ");
           cardNum = in .nextLong();
           cardString = Long.toString(cardNum);
       }
       cardString = Long.toString(cardNum);
       for (int i = cardString.length() - 2; i > -1; i -= 2) {
           sumString = sumString + Integer.toString(2 * Integer.parseInt(cardString.substring(i, i + 1)));
       }
       for (int i = sumString.length() - 1; i >= 0; i --) {
           firstSum = firstSum + Integer.parseInt(sumString.substring(i, i + 1));
       }
       for (int i = cardString.length() - 1; i >= 0; i -= 2 ) {
           secondSum = secondSum + Integer.parseInt(cardString.substring(i, i + 1));
       }
       if (cardString.length() == 15 && (cardString.substring(0, 2).equals("37") ||
         cardString.substring(0, 2).equals("34")) && ((firstSum + secondSum) % 10 == 0)) {
           cardType = "Amex";
       } else if ((cardString.length() == 16 || cardString.length() == 13) && ((firstSum + secondSum) % 10 == 0) &&
         (cardString.substring(0, 1).equals("4"))) {
           cardType = "Visa";
       } else if (cardString.length() == 16 && ((firstSum + secondSum) % 10 == 0)) {
           switch (cardString.substring(0, 2)) {
               case "51":
                   cardType = "Mastercard";
                   break;
               case "52":
                   cardType = "Mastercard";
                   break;
               case "53":
                   cardType = "Mastercard";
                   break;
               case "54":
                   cardType = "Mastercard";
                   break;
               case "55":
                   cardType = "Mastercard";
                   break;
           }
       }
       System.out.printf("\n%s.\n", cardType);
   }
 }
