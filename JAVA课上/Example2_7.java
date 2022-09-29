package JAVA课上;

import java.util.Scanner;
public class Example2_7 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("请输入第一个整数：");
int a = in.nextInt();
System.out.print("请输入第二个整数：");
int b = in.nextInt();
int max = a > b ? a : b;
System.out.println(a + "和" + b + "的最大值为" + max);}
}