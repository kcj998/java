package JAVA课上;

public class Example2_6 {
    public static void main(String[] args) {
    int x = 0;
    int y = 0;
    int z = 0;
    boolean a, b;
    a = x > 10 & ++y > 10;
    System.out.println(a);
    System.out.println("y=" + y);
    b = x > 10 && ++z > 10;
    System.out.println(b);
    System.out.println("z=" + z);
    }
    }