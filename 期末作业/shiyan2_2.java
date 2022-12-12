package 期末作业;

public class shiyan2_2 
{
    public static void main(String[] args) 
    {
        System.out.println("九九乘法表:");
        for (int x = 1; x <= 9;x++)
        {
            for (int y = 1;y <= x;y++)
            {
                System.out.println(x + " * " + y + " = " + x*y + "\t");
            }
            System.out.println();
        }
    }
    
}
