// Q.3 Write a java program having 3 different classes to show the
// implementation of object.
// Hint :
// step 1: create class E, then declare a variable x with value 5;
// step 2: create a class D.
// step 3: create a method test() inside the D class.
// step 4. display the value of variable x of class E from test() method of D
// class.
// step 5. create a class C.
// step 6. write main method inside class C.
// step 7. call the test() method of D class from the main method of class C.

// step 1
class E {
        // step 1
        int x = 5;

}

// step 2
class D {
        // step 3
        void test() {
                // Step 4
                E e = new E();
                System.out.print(e.x);
        }
}

// step 5
class C {
        // step 6
        public static void main(String[] args) {
                // step 7
                D d = new D();
                d.test();
        }
}