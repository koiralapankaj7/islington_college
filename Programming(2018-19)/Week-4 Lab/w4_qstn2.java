// 2. Take input of age of 3 people by user and determine oldest and
// youngest among them.

class Oldest {

        public static void main(String[] args) {

                int ram = 20;
                int sita = 30;
                int hari = 25;

                // For calculating oldest only
                if (ram > sita && ram > hari) {
                        System.out.println("Ram is oldest");
                } else if (sita > ram && sita > hari) {
                        System.out.println("Sita is oldest");
                } else {
                        System.out.println("Hari is oldest");
                }

                // There are several way to obtain this result
                // I am doing this way so that you could learn more about if else
                // statement

                // Way 1
                // For youngest only
                if (ram < sita && ram < hari) {
                        System.out.println("Ram is youngest");
                } else if (sita < ram && sita < hari) {
                        System.out.println("Sita is youngest");
                } else {
                        System.out.println("Hari is youngest");
                }

                // way 2
                // THIS CODE WILL PRINT OLDEST AND YOUNGEST AT SAME TIME
                // This solution seems confusing but wou can learn how we can nested if else
                // statement
                // This solution is for learning purpose
                // Best and clean solution will be above one
                if (ram > sita && ram > hari) {
                        System.out.println("Ram is oldest");
                        if (sita < ram) {
                                System.out.println("Sita is youngest");
                        } else {
                                System.out.println("Hari is youngest");
                        }
                } else if (sita > ram && sita > hari) {
                        System.out.println("Sita is oldest");
                        if (ram < hari) {
                                System.out.println("Ram is youngest");
                        } else {
                                System.out.println("Hari is youngest");
                        }
                } else {
                        System.out.println("Hari is oldest");
                        if (ram < sita) {
                                System.out.println("Ram is youngest");
                        } else {
                                System.out.println("Sita is youngest");
                        }
                }

        }
}