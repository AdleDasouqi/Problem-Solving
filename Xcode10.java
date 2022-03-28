import java.util.Scanner;

/* 
 * Problem #10
 * Java Program to Check Whether a Character is Alphabet or Not
*/

public class Xcode10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char varLetter = input.next().charAt(0);
        input.close();
        isAlphabet(varLetter);
    }

    public static void isAlphabet(char letter){
        if((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
            System.out.println(letter + " is alphabet");
        }else{
            System.out.println(letter + " is not alphabet");
        }
    }
}