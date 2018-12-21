
// Q6. Write a program to display the reverse of given input number.
// e.g, 12345 => 54321

import java.util.Scanner;

class Reverse {

        public static void main(String[] args) {

                // Creating object of scanner class
                // This object will used to tak einput from user
                Scanner scanner = new Scanner(System.in);

                // Displaying some information for user
                System.out.print("Please enter digits => ");

                // Taking value from user and assigning same value to variable name digits
                int digits = scanner.nextInt();

                // Clossing scanner once its work is done
                scanner.close();

                // Creating temporary variable temp and assigning user provided value to it
                int temp = digits;

                // Creating variable reverse with initial value 0
                // This variable will hold reverse of the digits provided by user
                int reverse = 0;

                // Applying condition for while loop
                // This loop will continue untill value of temp is not equal to zero
                while (temp != 0) {

                        // Calculating reminder
                        // If user provide 2345 then reminder will be 5 for first time
                        int reminder = temp % 10;

                        // Reverse number by using simple math.
                        // We need to change position of reminder
                        // 1. reverse is 0 in first loop and reminder will be 5 now result will be
                        // (0 * 10 + 5 = 5)
                        // 2. reverse will be 5 in second loop and reminder will be 4 now result will be
                        // (5 * 10 + 4 = 54)
                        // 3. reverse will be 54 in third loop and reminder will be 3 now result will be
                        // (54 * 10 + 3 = 543)
                        // 4. reverse will be 543 in fourth loop and reminder will be 2 now result will
                        // be
                        // (543 * 10 + 2 = 5432)
                        // In this way you can reverse aby numbers
                        reverse = reverse * 10 + reminder;

                        // If user provide 2345 then we have already reverse last element i.e, 5
                        // Now we need to reverse second last number i.e, 4
                        // We will use division to get such result
                        // Following line will change value of temp variable from 2345 to 234
                        // Now in next loop reminder will be 4 and same process will continue until
                        // temp value is not equal to 0
                        // Once value of temp variable is equal to 0 while loop will terminate
                        temp = temp / 10;
                }

                // Print digits that user provided and its sum
                System.out.println("Reverse of " + digits + " => " + reverse);
        }

}