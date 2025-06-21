public class ConditionalStatement {
    /**
     * @param args
     * @param string
     */
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 6;

        if (x > 10)
            System.out.println("Hello");
        else {
            System.out.println("Bye");
        }

        if (x > 10 && x <= 20)
            System.out.println("Hello");
        else
            System.out.println("Bye");

        if (x > y) {
            System.out.println("Greater Number : " + x);
            System.out.println("Thank you");
        } else
            System.out.println("Greater Number : " + y);

        if (x > y && x > z)
            System.out.println("Greater Number : " + x);
        else if (y > x && y > z)
            System.out.println(y);
        else
            System.out.println(z);

        // Ternary Operator
        int n = 5;
        int result = 0;
        // if (n % 2 == 0)
        // result = 10;
        // else
        // result = 20;

        // ? :
        result = n % 2 == 0 ? 10 : 20;

        System.out.println(result);

        // Switch - Statements
        int m = 1;
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a Valid number");
                break;
        }

        // New Switch Cases

        String day = "Monday";
        switch (day) {
            case "Saturday", "Sunday" -> System.out.println("6:00 AM");
            case "Monday" -> System.out.println("8 AM");
            default -> System.out.println("7 AM");
        }

        String day1 = "Monday";
        String result1 = "";
        result1 = switch (day1) {
            case "Saturday", "Sunday":
                yield "6:00AM";
            case "Monday":
                yield "8AM";
            default:
                yield "7AM";

        };
        System.out.println(result1);
    }
}
