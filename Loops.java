public class Loops {

    public static void main(String[] args) {

        // repeat this statement 4 times
        // loop - While , do While , For
        // 100 - condition
        int i = 1;

        // While - Loop
        while (i <= 4) {
            System.out.println("Hello" + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Hii" + j);
                j++;
            }
            i++;

        }
        System.out.println("Bye" + i);

        // Do - While
        int n = 1;

        do {
            System.out.println("Bye" + n);
            n++;

        } while (n <= 4);

        for (int k = 0; k <= 4; k++) {
            System.out.println("Hi" + k);
        }

        for (int m = 1; m <= 5; m++) {
            for (int l = 1; l <= 9; l++) {
                System.out.println(" " + (l + 8));
            }
        }

    }
}
