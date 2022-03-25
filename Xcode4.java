import java.util.Scanner;

/* 
 * Problem #4
 * Time Converter
 * You need a program to convert days to seconds.
*/

public class Xcode4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the days: ");
        int days = input.nextInt();
        System.out.println(timeConvert(days));
        input.close();
    }

    public static int timeConvert(int days){
       int hours, mintues, seconds;
       hours = 24;
       mintues = 60;
       seconds = 60;
       return days * hours * mintues * seconds;
    }
}
