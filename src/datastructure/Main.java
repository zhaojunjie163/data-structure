package datastructure;

public class Main {

    public static void main(String[] args) {

//        singleForLoop();

//        doubleForLoop();


        tribleForLoop();

    }

    private static void tribleForLoop() {
        int k = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                for (int h = 0; h < 5; h++) {
                    System.out.println(k++);
                    System.out.println(++k);
                }
            }
        }

        //time complexity is O(n3)
    }

    private static void singleForLoop() {
        int n = 100;
        int sum = 0;
        // data model will be always like [0,n-1]
        for (int i = 0; i <= n - 1; i++) { //executed N+1 times
            System.out.println(i); // executed N times
        }

        // the total executed times is 2N+1, then time complexity is O(n)
    }

    private static void doubleForLoop() {
        int k = 0;
        for (int i = 0; i < 4; i++) { //loop times
            for (int j = 0; j < 5; j++) {//main loop
                System.out.println(k++);
                System.out.println(++k);
            }

        }
        //time complexity is O(n2)
    }
}
