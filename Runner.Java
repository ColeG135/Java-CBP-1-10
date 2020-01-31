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

//delDel
public String delDel(String str) {
  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
    return str.substring(0, 1) + str.substring(4);
  }
  return str;
}

//front again
public boolean frontAgain(String str) {
  if (str.length() < 2)
    return false;
  else if (str.substring(0,2).equals(str.substring(str.length()-2,
str.length())))
  return true;
    else
  return false;
}

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

//delDel
public String delDel(String str) {
  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
    return str.substring(0, 1) + str.substring(4);
  }
  return str;
}

//front again
public boolean frontAgain(String str) {
  if (str.length() < 2)
    return false;
  else if (str.substring(0,2).equals(str.substring(str.length()-2,
str.length())))
  return true;
    else
  return false;
}



//firstTwo
public String firstTwo(String str) {
  int len = str.length();
  if (len < 2)
    return str;
  else
    return str.substring(0,2);
}


