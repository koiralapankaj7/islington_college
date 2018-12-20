// 6. Write a program using switch statement to
// Add two numbers if input is "+"
// Subtract two numbers if input is "-"
// Multiply two numbers if input is "*"
// Divide two numbers if input is "/"

class AddNumber {
        public static void main(String[] args) {

                char symbool = "+";

                int a = 10;
                int b = 30;

                switch (symbool) {

                case "+":
                        System.out.print(a + b);
                        break;

                case "-":
                        System.out.print(a - b);
                        break;

                case "*":
                        System.out.print(a * b);
                        break;

                case "/":
                        System.out.print(a / b);
                        break;

                default:
                        System.out.print("Invalid input");
                        break;
                }

        }
}