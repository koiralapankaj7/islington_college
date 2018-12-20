/*
 * 5. wap to demonstrate uses of the arithmetic operation
 */

// declaring the class name as ArithmeticOperation
public class ArithmeticOperation {
        // main method
        public static void main(String[] args) {
                /*
                 * decalring integer and float variable with its value
                 */
                int a = 5;
                int b = 10;
                int sum;
                int prod;
                float div;
                int diff;
                double rem;
                // calculating process
                sum = a + b;
                diff = a - b;
                prod = a * b;
                div = b / a;
                rem = b % a;
                // displaying process
                System.out.println("**************Output of arithmetic operation*************");
                System.out.println("the sum of two number is :" + sum);
                System.out.println("the difference of two number is :" + diff);
                System.out.println("the prod of two number is :" + prod);
                System.out.println("the division of two number is :" + div);
                System.out.println("the reminder of two number is :" + rem);
        }
}