import java.util.Scanner;

/*
 * Problem #10
 * Java Program to Check Whether a Character is Alphabet or Not
 * The English Alphabet consists of 26 letters: from A to z.
*/

public class Xcode10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char letter = input.next().charAt(0);
        input.close();
        alphabet(letter);
    }

    public static void alphabet(char letter){
        String result = (letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z') 
        ? letter + " is alphabet" 
        : letter + " is not an alphabet";
        System.out.println(result);
    }
}
