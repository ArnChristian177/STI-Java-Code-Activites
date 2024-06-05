//Guess Number with Handling Exceptions
//coded by Arn
//
import java.util.InputMismatchException;
import java.util.Scanner;
class IntegerOutOfBoundsException extends Exception {
    public IntegerOutOfBoundsException(String reason) {
        super(reason);
    }
}
public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 50!");
        int max = 50;
        int r = (int) (Math.random() * max) + 1;
        boolean finish = false;
        int count = 0;
        while(true) {
            try {
                int input = scan.nextInt();
                if (input > max) {
                    count++;
                    throw new IntegerOutOfBoundsException("Out of range.");
                }
                else if (input < r) {
                    System.out.println("Too low. Try again.");
                    count++;
                }
                else if (input > r) {
                    System.out.println("Too high. Try again.");
                    count++;
                }
                else {
                    if (input == r) {
                        finish = true;
                        break;
                    }
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                System.out.println("Guess a number from 1 to 50!");
                scan.next();
            }
            catch (IntegerOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println("Guess a number from 1 to 50!");
            }
        }
        if (finish) {
            System.out.println("You got it in " + count + " attempt(s)!");
        }
    }
}
