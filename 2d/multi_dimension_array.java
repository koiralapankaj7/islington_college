import java.util.Scanner;

class Example {

        public static void main(String[] args) {

                // Single dimension array
                int a[] = { 1, 2, 3, 4 };
                int b[] = { 1, 2, 3, 4, 5, 6 };
                int c[] = { 1, 2, 3, 4, 5, 6, 7 };

                // int d[] = { 1, 2, 3, 4, 5, 6, 7 };

                // Multi dimension array
                int abc[][] = { a, b, c };

                // looping multi dimension array
                for (int i = 0; i < abc.length; i++) {
                        // i = 0
                        // abc[0] => a
                        // a => { 1, 2, 3, 4 }

                        // We get single dimension array from above loop
                        // That is why we are using second loop
                        // This loop will print all values from single dimension array
                        for (int j = 0; j < abc[i].length; j++) {
                                /*
                                 * abc[i] means value from i index of multi dimension array. which will be
                                 * single dimension array.\ abc[i][j] means value of i index of multi dimension
                                 * array followed by value of j index of single dimension array
                                 */

                                System.out.print(abc[i][j]);

                        }
                        System.out.println();
                }

        }
}