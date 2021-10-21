package HomeWork12;

public class EvenOddNumbers {
    public static void main(String[] args) {
        // To check given number is Even or Odd
        /* If number is divisible by 2 then it's an even number
        else odd number
         */

        int number = 16;
        System.out.println("Enter an integer number");

        if (number % 2 == 0) {
            System.out.println(number + " entered number is even");
        } else {
            System.out.println("entered number is odd");

        }
    }
}
