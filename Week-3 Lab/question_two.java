// Q2. WAP to call a method of class B, by sitting on Class A by using the
// concept of object implimentation.
// Hints:
// 1. create a class A.
// 2. create a class B.
// 3. declare a method inside B.
// 4. print some message from that method.
// 5. create a object of class B, by sitting in main method of class A.
// 6. call the method of B by using the object.

// Step 1
class A {
        // step 5
        public static void main(String[] args) {
                // step 5
                B b = new B();
                // step 6
                b.display();
        }
}

// step 2
class B {
        // step 3
        void display() {
                // step 4
                System.out.println("Message from class B");
        }
}