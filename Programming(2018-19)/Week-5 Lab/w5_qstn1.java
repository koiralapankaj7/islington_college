// Q1. Write a program to display the even numbers from 2 to 20 using all loops.

class EvenNumber {
        public static void main(String[] args) {

                // For loop
                for (int i = 2; i <= 20; i++) {

                        // Even number are those number which is divisable by 2
                        // Divisable by 2 means reminder should be zero.
                        if (i % 2 == 0) {
                                System.out.print(i + " is a even number");
                        } else {
                                System.out.print(i + " is not a even number");
                        }
                }

                // Starting loop from this number. This variable is used by while and do while
                // loop
                int number = 2;

                // While loop
                while (number <= 20) {

                        // Even number are those number which is divisable by 2
                        // Divisable by 2 means reminder should be zero.
                        if (number % 2 == 0) {
                                System.out.print(number + " is a even number");
                        } else {
                                System.out.print(number + " is not a even number");
                        }

                        // Remember ?
                        // We should travel number from starting point to endpoint/condition.
                        // So we are increasing number by 1 each time.
                        number++;

                }

                // Do while loop
                do {
                        // Even number are those number which is divisable by 2
                        // Divisable by 2 means reminder should be zero.
                        if (number % 2 == 0) {
                                System.out.print(number + " is a even number");
                        } else {
                                System.out.print(number + " is not a even number");
                        }

                        // Remember ?
                        // We should travel number from starting point to endpoint/condition.
                        // So we are increasing number by 1 each time.
                        number++;

                } while (number <= 20);

        }
}