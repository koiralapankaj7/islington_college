// 2. Take input of age of 3 people by user and determine oldest and
// youngest among them.

class Oldest {

        public static void main(String[] args) {

                int ram = 20;
                int sita = 30;
                int hari = 25;

                if (ram > sita && ram > hari) {
                        System.out.println("Ram is oldest");
                } else if (sita > ram && sita > hari){
                        System.out.println("Sita is oldest");
                } else {
                        System.out.println("Hari is oldest");
                }

        }
}