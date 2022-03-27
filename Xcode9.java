import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Problem #9
 * Java Program to Check Whether a Number is Positive or Negative
*/

public class Xcode9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            int varNumber = input.nextInt();
            input.close();
            numbers(varNumber);
        }catch(InputMismatchException e){
            System.out.println("Please enter a number!");
        }
    }

    public static void numbers(int number){
        String result = (number > 0) ? number + " is a positive" : (number < 0) ? number + " is a negative" : (number == 0) 
        ? number + " is neither positive nor negative" 
        : number + " number is not found";
        System.out.println(result);
    }
}
