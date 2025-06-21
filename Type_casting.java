  public class Type_casting {
  
    public static void main(String[] args) {
        //Type Casting 
        byte b = 125;
        int a = 257;
        byte k = (byte)a;

        float f = 5.6f;
        int t =(int)f;
        System.out.println(k);
        System.out.println(t);

        //Type promotion
        byte m = 10;
        byte n = 30;
        int result = m*n;
         System.out.println(result);
    }
  }