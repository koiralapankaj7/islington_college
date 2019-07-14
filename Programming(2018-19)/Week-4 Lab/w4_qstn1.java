// 1.Write Java program to input the age then the program will show
// if the person is eligible to vote. A person who is eligible to vote
// must be older than or equal to 18 years old.

class Vote {

        public static void main(String[] args) {

                // This is local variable 
                int personAge = 20;
         
                 if (personAge >= 18) {
                        System.out.println("Eligible for vote.");
                } else {
                        System.out.println("Not eligible for vote.");
                }
        }

}