public class Runner {
    public static void main(String[] args) {
        System.out.println(helloName("Matt"));
        System.out.println(helloName("Jim"));
        System.out.println(helloName("Maria"));
        System.out.println(helloName("Kate"));
        System.out.println(true);
    }
    public static String helloName(String name) {
        return "hello" + name;
    }
}


//hasTeen
    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) ||
                (b>=13 && b<=19) ||
                (c>=13 && c<=19);
    }

//or35
   public boolean or35(int n) {
  return (n % 3 == 0) || (n % 5 == 0);
}
