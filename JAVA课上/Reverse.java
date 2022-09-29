package JAVA课上;

import java.util.Scanner;
public class Reverse {
/**
 * @param args
 */
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("请输入一个三位正整数：");
int n = in.nextInt();
int a = n / 100; // 百位数字int b = n / 10 % 10; // 十位数字int c = n % 10; // 个位数字System.out.println("倒序生成的数字为：" + (c * 100 + b*10+a));}
}