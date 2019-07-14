// Q4. WAP to display the series of 50,45,40....5 using do while loop.

class SeriesNumber {

        public static void main(String[] args) {

                // Starting number from where we are starting our loop
                int number = 50;

                do {
                        // Printing number and adding single space after that
                        System.out.print(number + " ");

                        // Decreasing value of number by 5 in each iteration
                        // Following line is equivalent to :
                        // number = number - 5;
                        number -= 5;

                } while (number >= 5);
        }
}