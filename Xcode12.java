import java.util.Scanner;

/*
 * Problem #12
 * Java Program to Find Factorial of a Number 
*/

public class Xcode12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the factorial: ");
        int varNumber = input.nextInt();
        input.close();
        System.out.println("Factorial of " + varNumber + " = " + factorial(varNumber));
    }

    public static int factorial(int number){
        int result = (number == 0) ? 1 : (number * factorial(number - 1));
        return result; 
    }
}
