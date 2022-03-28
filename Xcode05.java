import java.util.Scanner;

/* 
 * Problem #5 
 * Java Program to Swap Two Numbers
*/

public class Xcode5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int numberOne = input.nextInt();
        System.out.print("Enter Second Number: ");
        int numberTwo = input.nextInt();
        input.close();
        System.out.println("Before Swapping Numbers: " + numberOne + " " + numberTwo);
        numberOne = numberOne - numberTwo;
        numberTwo = numberOne + numberTwo;
        numberOne = numberTwo - numberOne;
        System.out.println("After Swapping Numbers: " + numberOne + " " + numberTwo);
    }
}
