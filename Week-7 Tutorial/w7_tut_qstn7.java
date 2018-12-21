// Q.7. Write a program to find the average of the numbers which are stored in
// an array.
// [intialize your own array in the program];

public class ArrayAverage {
        public static void main(String[] args) {

                int[] myList = { 77, 56, 45, 23, 4, 5, 68 };
                // adding the array elements;
                int total = 0;
                for (int i = 0; i < myList.length; i++) {
                        total += myList[i];
                }

                double avg = total / myList.length;

                System.out.println("Average = " + avg);
        }
}