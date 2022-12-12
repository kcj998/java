package 期末作业;

import java.util.Scanner;

public class shiyan2_1  //魏子建2004101023
{
    public static void main(String[] args) 
    {
        try (Scanner in = new Scanner(System.in))
        {
            System.out.println("请输入三个整数: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int t;
            if (a<b)
            {
                t = b;
            }
            else
            {
                t = a;
            }
            if (t<c)
            {
                System.out.println("三个数中最大的数是: " + c);
            }

        }
    }    
}
