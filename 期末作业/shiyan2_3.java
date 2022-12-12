package 期末作业;

import java.util.Scanner;

public class shiyan2_3 
{
    public static int[] sum(int [][] array)
    {
        int[] sum = {0,0};
        for (int i = 0;i < array.length; i++)
        {
            for (int j = 0;j < array[0].length; j++)
            {
                if ( i==j)
                {
                    sum[0] += array[i][j];
                }
                if (j == array.length - i -1)
                {
                    sum[1] += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        try (Scanner s = new Scanner(System.in))
        {
            int x = 4;
            int y = 4;
            int[][] array = new int[x][y];
            System.out.println("请输入数组元素:");
            for (int i = 0; i<x; i++)
            {
                for (int j=0;j<y;j++)
                {
                    array[i][j] = s.nextInt();
                }
            }
            int[] res = sum(array);
            System.out.println("对角线元素之和分别为:" + res[0] +"与"+ res[1]);
        }    
    }
    
    
}
