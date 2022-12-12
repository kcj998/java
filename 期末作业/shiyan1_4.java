package 期末作业;

import java.util.Scanner;

public class shiyan1_4 {    
    public static void main(String[] args)   //魏子健2004101023
    {
        int a,b,c;
        double s,area;
        try(Scanner rd = new Scanner(System.in))
        {
            System.out.print("请输入三角形2第一个边长: ");
            a=rd.nextInt();
            System.out.print("请输入三角形第二个边长: ");
            b=rd.nextInt();
            System.out.print("请输入三角形第三个边长: ");
            c=rd.nextInt();
            if(a+b>c&&a+c>b&&b+c>a)
            {
                s = (a+b+c)/2;
                area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.print("三角形面积为:" + area);
            }
            else
            System.out.print("无法构成三角形");
        }
    }
}
