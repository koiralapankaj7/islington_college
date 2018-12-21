// Q.8. Write a program to initialize two 2-D matrix having the dimension 2x3
// then
// display the sum of those two matrix.

class SumMatrix {
        public static void main(String[] args) {

                int[][] m1 = { { 2, 3, 4 }, { 4, 5, 2 } };
                int[][] m2 = { { 5, 3, 4 }, { 1, 5, 3 } };

                // Declating and constructing 2d array
                // Array sum can hold only 2 element i.e, 2 array
                // Array that is hold by sum cannot hold more than 3 values.
                // That is what int[2][3] means.

                int[][] sum = new int[2][3];

                // Make sure size of m1 and m2 is same
                // adding elements of array m1 and array m2
                for (int i = 0; i < m1.length; i++) {

                        for (int j = 0; j < m1[i].length; j++) {
                                sum[i][j] = m1[i][j] + m2[i][j];
                        }

                }

                // displaying the elements of array sum.
                for (int i = 0; i < sum.length; i++) {
                        for (int j = 0; j < sum[i].length; j++) {
                                System.out.print(sum[i][j] + " ");
                        }
                        System.out.println();
                }
        }

}