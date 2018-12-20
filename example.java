class Example {
        public static void main(String[] args) {

                int a[] = { 1, 2, 3, 4 };
                int b[] = { 2, 3, 4, 5, 6 };
                int c[] = { 3, 4, 5, 6, 7, 8 };

                int abc[][] = { a, b, c };

                //
                for (int i = 0; i < abc.length; i++) {
                        // i = 0
                        // abc[i] => a
                        // i = 1
                        // abc[i] => b
                        // i = 2
                        // abc[i] => c

                        for (int j = 0; j < abc[i].length; j++) {
                                System.out.print(abc[i][j] + "\t");
                        }
                        System.out.println();
                }

        }
}