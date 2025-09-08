package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main() {
        doFizzBuzz1();
        doFizzBuzz2();
    }

    private static void doFizzBuzz1() {
        for (int i = 1; i < 100; i++) {
            printFizzBuzz(i);
        }
    }

    private static void doFizzBuzz2() {
        int i = 1;
        while  (i < 100) {
            printFizzBuzz(i);
            i++;
        }
    }

    private static void printFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
