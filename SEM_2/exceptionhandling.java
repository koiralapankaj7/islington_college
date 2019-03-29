class EsceptionHandlingPractice {

        // The Exception Handling in Java is one of the powerful mechanism to handle the
        // runtime errors so that normal flow of the application can be maintained.

        /*
         * 1) Checked Exception: The classes which directly inherit Throwable class
         * except RuntimeException and Error are known as checked exceptions e.g.
         * IOException, SQLException etc. Checked exceptions are checked at
         * compile-time.
         * 
         * 
         * 2) Unchecked Exception The classes which inherit RuntimeException are known
         * as unchecked exceptions e.g. ArithmeticException, NullPointerException,
         * ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at
         * compile-time, but they are checked at runtime.
         * 
         * 3) Error Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError,
         * AssertionError etc.
         * 
         * 
         * 
         * try ==>>> The "try" keyword is used to specify a block where we should place
         * exception code. The try block must be followed by either catch or finally. It
         * means, we can't use try block alone.
         * 
         * 
         * catch ==>>> The "catch" block is used to handle the exception. It must be
         * preceded by try block which means we can't use catch block alone. It can be
         * followed by finally block later.
         * 
         * 
         * finally ==>>> The "finally" block is used to execute the important code of
         * the program. It is executed whether an exception is handled or not.
         * 
         * 
         * throw ==>>> The "throw" keyword is used to throw an exception.
         * 
         * 
         * throws ==>>> The "throws" keyword is used to declare exceptions. It doesn't
         * throw an exception. It specifies that there may occur an exception in the
         * method. It is always used with method signature.
         */

        public static void main(String[] args) {
                new EsceptionHandlingPractice().runApp();
        }

        void runApp() {

                try {

                        // Statement 1
                        // Statement 2
                        // Statement 3
                        // Statement 4 => error
                        // Statement 5
                        // Statement 6

                } catch (NullPointerException npe) {

                } catch (ArithmeticException ae) {

                } catch (NumberFormatException nfe) {

                } catch (Exception e) {

                }

                // rest code of the program
                System.out.println("rest of the code...");

                /**
                 * Result ==> Exception in thread main java.lang.ArithmeticException:/ by zero
                 * rest of the code...
                 */

                // Common Scenarios of Java Exceptions
                // ======================================================================
                // 1) A scenario where ArithmeticException occurs
                // If we divide any number by zero, there occurs an ArithmeticException.
                int a = 50 / 0;// ArithmeticException

                // 2) A scenario where NullPointerException occurs
                // If we have a null value in any variable, performing any operation on the
                // variable throws a NullPointerException.
                String s = null;
                System.out.println(s.length());// NullPointerException

                // 3) A scenario where NumberFormatException occurs
                // The wrong formatting of any value may occur NumberFormatException. Suppose I
                // have a string variable that has characters, converting this variable into
                // digit will occur NumberFormatException.
                String s1 = "abc";
                int i = Integer.parseInt(s1);// NumberFormatException

                // 4) A scenario where ArrayIndexOutOfBoundsException occurs
                // If you are inserting any value in the wrong index, it would result in
                // ArrayIndexOutOfBoundsException as shown below:
                int arr[] = new int[5];
                arr[10] = 50; // ArrayIndexOutOfBoundsException
        }
}