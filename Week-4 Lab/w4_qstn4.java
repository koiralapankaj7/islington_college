// 4. Write a program to check if a year is leap year or not.
// If a year is divisible by 4 then it is leap year but if the year
// is century year like 2000, 1900, 2100 then it must be divisible by 400.

class LeapYear {
        public static void main(String[] args) {
                int year = 2040;

                // If a year is divisible by 4 then it is leap year
                if (year % 4 == 0) {
                        System.out.print(year + " is a Leap Year.");

                        // To become a century year, year must be divisible by 400
                        if (year % 400 == 0) {
                                System.out.print(year + " is a Leap Year as well as a Century Year.");
                        } else {
                                System.out.print(year + " is a Leap Year but not a Century Year.");
                        }
                } else {
                        System.out.print(year + " is not a Leap Year.");
                }
        }
}