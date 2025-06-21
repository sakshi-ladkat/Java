public class Operators {
    public static void main(String[] args) {

        // 1.Arithmetic Operators
        int num = 7;
        int num1 = 5;
        int result1 = num + num1;
        int result2 = num - num1;
        int result3 = num * num1;
        double result4 = num / num1;
        int result5 = num % num1;

        // num = num + 2;
        // num+=2;
        // num++; Post-increment Fetch value and then increment
        // ++num Pre-increment Increment and then Fetch the Value
        // num-- Post-Decrement Fetch value and then decrement
        // --num Pre-Decrement Decrement and then Fetch the Value
        System.out.println(num);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        // 2.Relational Operators

        int x = 6;
        int y = 5;
        boolean result = x < y;
        System.out.println(result);

        // 3.Logical Operators
        int a = 8;
        int b = 6;
        int m = 5;
        int n = 9;
        boolean result6 = a < b && m < n;
        boolean result7 = a < b || m < n || x > 1;
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(!result7);

    }

}
