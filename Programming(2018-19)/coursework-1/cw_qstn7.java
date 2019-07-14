/*
 * 7) Write a program using following instructions : i. Create four classes
 * ClassOne, ClassTwo, ClassThree and ClassFour. ii. Create main method inside
 * ClassThree. iii. Declare variables name, age and country inside ClassFour and
 * assign values Sohan K.C, 30 and Nepal respectively to those variables. iv.
 * Create method personalDetails() inside ClassTwo. v. Print following
 * information from personalDetails() method on a separate line as follow:
 * (Hint: Create an object of ClassFour to access those variables) “My name is
 * Sohan K.C” “I am 30 years old” “I am from Nepal” vi. Create method display()
 * inside ClassOne and call personalDetails() method which is in ClassTwo.
 * (Hint: Create an object of ClassTwo to access that method). vii. Finally,
 * call display() method from main method that you have created before inside
 * ClassThree.
 */

class ClassOne {

        // declaring new method display() and call personalDetails() method which is in
        // ClassTwo.
        public void display() {
                ClassTwo classTwoObject = new ClassTwo();
                classTwoObject.personalDetails();
        }
}

class ClassTwo {

        // declaring method personalDetails and displaying information.
        public void personalDetails() {
                ClassFour classFourObject = new ClassFour();
                System.out.println("My name is " + classFourObject.name);
                System.out.println("I am" + " " + classFourObject.age + " " + "years old");
                System.out.println("I am from" + " " + classFourObject.country);
        }
}

public class ClassThree {
        public static void main(String[] args) {
                ClassOne classOneObject = new ClassOne();
                classOneObject.display();
        }
}

class ClassFour {
        // Declare variables name, age and country inside ClassFour and assign values

        String name = "Santosh pradhan";
        int age = 20;
        String country = "Nepal";
}