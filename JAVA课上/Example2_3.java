package JAVA课上;

import java.util.Scanner;
public class Example2_3 {
public static void main(String[] args) {System.out.println("请输入两个整型数据：");try (Scanner reader = new Scanner(System.in)) {
    int a = reader.nextInt();
    int b = reader.nextInt();
    int sum = a + b;
    System.out.println(a + "+" + b + "="+sum);
}}
}
