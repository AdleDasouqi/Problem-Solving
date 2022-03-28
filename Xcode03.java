import java.util.Scanner;

/*
 * Problem #3
 * Java Program to Find ASCII Value of a character
*/

public class Xcode3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Character: ");
        char letter = input.next().charAt(0);
        input.close();
        asciiValue(letter);
    }

    public static void asciiValue(char letterChar){
        int castAscii = (int) letterChar;
        System.out.println("The ASCII Value of " + letterChar + " is : " + castAscii);
    }
}
