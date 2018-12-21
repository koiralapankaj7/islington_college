import java.util.Scanner;

// Q2. WAP to display the multiplication table upto 10 term of a given input
// number;
// ex:
// 5x1=5
// 5x2=10
// ..
// ..
// 5x10=50

class MultiplicationTable {

        public static void main(String[] args) {

                // Printing information so that user can understand what is going on
                System.out.print("Please enter a number => ");

                // Creating an object of scanner class
                // Scanner class is used to take input from user
                Scanner scanner = new Scanner(System.in);

                // Creating variable number and assigning value into it.
                // scanner.nextInt() will ask for value with user which will be intiger type.
                // Value provided by user is assigned to number variable
                int number = scanner.nextInt();

                // Always remember to close scanner class when it is no more in use.
                scanner.close();

                // Printing line just for formating result.
                System.out.println("-------------------------");

                System.out.println("Multiplication table of " + number);
                System.out.println("-------------------------");

                // Loop to generate table for given number
                // Result will be in following format :
                // 2 * 1 = 2
                // 2 * 4 = 4
                for (int i = 1; i <= 10; i++) {
                        System.out.println(number + " * " + i + " = " + number * i);
                }

                // Printing line just for formating result.
                System.out.println("-------------------------");
        }
}