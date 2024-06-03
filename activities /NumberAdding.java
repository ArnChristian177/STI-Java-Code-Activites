//Simple OOP with number adding
//coded by Arn
//
import java.util.Scanner;
public class NumberAdding {
    private static int getValue;
    static void inputInteger() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int n = scan.nextInt();
        getValue = n;
    }
    static int getNumber() {
        return getValue;
    }
    static int getSum(int value) {
        int sum = getNumber() + value;
        return sum;
    }
    static void showNumberPlus10() {
        System.out.println(getNumber() + " plus 10 is " + getSum(10) + ".");
    }
    static void showNumberPlus100() {
        System.out.println(getNumber() + " plus 100 is " + getSum(100) + ".");
    }
    static void showNumberPlus1000() {
        System.out.println(getNumber() + " plus 1000 is " + getSum(1000) + ".");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        inputInteger();
        showNumberPlus10();
        showNumberPlus100();
        showNumberPlus1000();
    }
}
