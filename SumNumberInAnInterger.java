import java.util.Scanner;
import java.util.SortedMap;

public class SumNumberInAnInterger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        System.out.println("Sum digits of number is: " + sumDigits(number));
    }

    public static int sumDigits(long number) {
        int sum = 0;
        while (number % 10 != 0) {
            int digit = (int) number % 10;
            number = number / 10;
            sum += digit;
        }
        return sum;
    }
}
