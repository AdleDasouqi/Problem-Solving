import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Problem #6
 * Java Program to Check Whether a Number is Even or Odd
*/

public class Xcode06{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            int myNumber = input.nextInt();
            input.close();
            evenOdd(myNumber);
        }catch(InputMismatchException e){
            System.out.println("Please enter a number!");
        }
    }

    public static void evenOdd(int number){
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
}


