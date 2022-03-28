import java.util.Scanner;

/*
 * Problem #1 
 * Given an integer, n, perform the following conditional actions:
 * If n is odd, print Weird
 * If n is even and in the inclusive range of 2 to 5, print Not Weird
 * If n is even and in the inclusive range of 6 to 20, print Weird
 * If n is even and greater than , print Not Weird
*/

public class Xcode01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        if(number % 2 != 0){
            System.out.println("Weird");
        }else if(number % 2 == 0 && number <= 5){
            System.out.println("Not Weird");
        }else if(number % 2 == 0 && number <= 20){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
}
