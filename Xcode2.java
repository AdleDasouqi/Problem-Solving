import java.util.Scanner;

/*
 * Problem #2
 * Given an integer, Number , print its first  multiples.
 * Each multiple Number x i (where 1 <= i <= 12) 
 * should be printed on a new line in the form: Number x i = result.
*/

public class Xcode2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        multipleNumber(number);
    }

    public static void multipleNumber(int number){
        for(int i = 1; i <= 12; i++){
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}