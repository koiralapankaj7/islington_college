// 3. Write a program to find the grade of the student according to
// his/her marks.
// If score is 90 or above print grade 'A'.
// If score is 70 or above print grade 'B'.
// If score is 50 or above print grade 'C'.
// If score is 40 or above print grade 'D'.
// If score is less than 40 print grade 'E'.

class CalculateGrade {

        public static void main(String[] args) {
                int mark = 55;

                if (mark >= 90 && mark <= 100) {
                        System.out.print("A");
                } else if (mark >= 70 && mark < 90) {
                        System.out.print("B");
                } else if (mark >= 50 && mark < 70) {
                        System.out.print("C");
                } else if (mark >= 40 && mark < 50) {
                        System.out.print("D");
                } else if (mark >= 0 && mark < 40) {
                        System.out.print("E");
                } else {
                        System.out.print("Invalid number");
                }
        }
}