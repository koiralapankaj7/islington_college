// Q.4. Write a java program to find the sum, difference, product, and quotient
// of any two numbers. use different methods in same c lass for each operation.
// Hints:
// step 1. Create a class Calculator.
// Step 2. Write methods sum, sub, mult, div for their operations.
// step 3. write main method then call all methods.

// step 1
class Calculator {

        // step 3
        public static void main(String[] args) {
                Calculator calculator = new Calculator();
                calculator.sum();
                calculator.sub();
                calculator.mult();
                calculator.div();
        }

        // Step 2

        void sum() {
                int a = 2;
                int b = 4;
                System.out.print(a + b);
        }

        void sub() {
                int a = 2;
                int b = 4;
                System.out.print(a - b);
        }

        void mult() {
                int a = 2;
                int b = 4;
                System.out.print(a * b);
        }

        void div() {
                int a = 2;
                int b = 4;
                System.out.print(a / b);
        }
}