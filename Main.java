import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int guess;

        do { 
             System.out.println("Enter your first guess: ");
             guess = scan.nextInt();

             if (guess < x) {
                System.out.println("TOO LOW!");
            }

            else if (guess > x) {
                System.out.println("TOO HIGH!");
            }
            
            else {
                System.out.println("CONGRADULATION!");
            }

            int count = 1;

            if (count < 7 && guess == x) {
                System.out.println("You got an impossibly good score!");
            }

            else if (count > 7 && count < 10 && guess == x) {
                System.out.println("You did a good job!");
            }

            else if (count >= 10 && guess != x) {
                System.out.println("Try the divide and conquer strategy next time!");
                break;
            }
        } while (guess != x);
        
        System.out.println(guess);
    }
}