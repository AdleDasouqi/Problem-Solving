import java.util.Scanner;

/* 
 * Problem #7
 * Java Program to Check Whether an Alphabet is Vowel or Consonant
*/

public class Xcode7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char varCharacter = input.next().charAt(0);
        input.close();
        alphabet(varCharacter);
    }

    public static void alphabet(char letter){
        if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            System.out.println(letter + " is vowel");
        }else if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println(letter + " is vowel");
        }else{
            System.out.println(letter + " is consonant");
        }
    }
}
