import java.util.Scanner;

/* 
 * Probelm #8
 * Java Program to Find the Largest Among Three Numbers
*/

public class Xcode8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        input.close();
        if(numberOne > numberTwo && numberOne > numberThree){
            System.out.println(numberOne + " is the largest number1");
        }else if(numberTwo > numberOne && numberTwo > numberThree){
            System.out.println(numberTwo + " is the largest number2");
        }else{
            System.out.println(numberThree + " is the largest number");
        }
    }
}
