// Q1. Write a java program to show the implimentation of object.
// Hints:
// 1. create a class A.
// 2. write the main method.
// 3. declare (create) a method named show();
// 4. inside the method print a message. "Hello from show method".
// 5. go to the main method, then create a object for class A.
// 6. call the show method by a object which is created in step 5.

// Step 1
class A {
        // Step 2
        public static void main(String[] args) {
                // Step 5
                A a = new A();
                // Step 6
                a.show();
        }

        // Step 3
        void show() {
                // Step 4
                System.out.println("Hello from show method");
        }
}