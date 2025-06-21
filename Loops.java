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
    }

}
