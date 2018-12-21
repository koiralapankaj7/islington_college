// Q3. WAP to display the following pattern.

class Pattern {

        // To understand code you must learn line by line.
        // Try to execute code by yourself in copy so that you can understand how values
        // are changed in loop and how does loop work.
        // This is must important if you want to understand loop

        public static void main(String[] args) {

                // Must important thing to remember
                // Even though all four methods are in same class we can only call them through
                // object from main method
                // We cant call simply by its name e.g, patternOne().
                // Main method will not understand.
                // So always make an object of class and call methods using object like i do
                // below.

                Pattern pattern = new Pattern();

                pattern.patternOne();
                pattern.patternTwo();
                pattern.patternThree();
                pattern.patternFour();
                pattern.patternFive();
        }

        // a.
        // 1
        // 12
        // 123
        // 1234
        void patternOne() {

                // Outer loop will loop for 4 times. As we need to print total four line
                for (int i = 1; i < 5; i++) {

                        // Inner loop will run 1 time if outer loop is run for 1st time.
                        // Inner loop will run 2 times if outer loop is run for 2nd time. This process
                        // will repeat for 4 times.

                        for (int j = 1; j < i + 1; j++) {
                                System.out.print(j);
                        }

                        System.out.println();
                }
                System.out.println();

        }

        // b.
        // 1
        // 22
        // 333
        // 44444
        void patternTwo() {

                // Outer loop will loop for 4 times. As we need to print total four line
                for (int i = 1; i < 5; i++) {

                        // Inner loop will run 1 time if outer loop is run for 1st time.
                        // Inner loop will run 2 times if outer loop is run for 2nd time. This process
                        // will repeat for 4 times.

                        for (int j = 1; j < i + 1; j++) {
                                System.out.print(i);
                        }

                        System.out.println();
                }
                System.out.println();

        }

        // c.
        // 4321
        // 432
        // 43
        // 4
        void patternThree() {

                // Outer loop will loop for 4 times. As we need to print total four line
                for (int i = 1; i < 5; i++) {

                        // Inner loop will run 4 times if outer loop is run for 1st time.
                        // Inner loop will run 3 times if outer loop is run for 2nd time. This process
                        // will repeat for 4 times.

                        for (int j = 4; j > i - 1; j--) {
                                System.out.print(j);
                        }

                        System.out.println();
                }
                System.out.println();

        }

        // d.
        // 4321
        // 321
        // 21
        // 1
        void patternFour() {

                // Outer loop will loop for 4 times. As we need to print total four line
                for (int i = 0; i < 4; i++) {

                        // Inner loop will run 4 times if outer loop is run for 1st time.
                        // Inner loop will run 3 times if outer loop is run for 2nd time. This process
                        // will repeat for 4 times.

                        for (int j = 4; j > i; j--) {
                                System.out.print(j - i);
                        }

                        System.out.println();
                }
                System.out.println();

        }

        // e.
        // 1
        // 11
        // 111
        // 1111
        void patternFive() {

                // Outer loop will loop for 4 times. As we need to print total four line
                for (int i = 1; i < 5; i++) {

                        // Inner loop will run 1 time if outer loop is run for 1st time.
                        // Inner loop will run 2 times if outer loop is run for 2nd time. This process
                        // will repeat for 4 times.

                        for (int j = 1; j < i + 1; j++) {
                                System.out.print("1");
                        }

                        System.out.println();
                }
                System.out.println();

        }
}