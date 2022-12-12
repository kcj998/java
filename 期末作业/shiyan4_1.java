package 期末作业;

public class shiyan4_1 
{
    public static void main(String[] args)
    {
        Fruit s1 = new Fruit("苹果",1);
        Fruit s2 = new Fruit("香蕉",2);
        Fruit s3 = new Fruit("桃子",3);
        String result = s2.toString();
        System.out.println(result);
        boolean judge = judge(s1,s2);
        System.out.println(judge);
    }
    private static boolean judge(Object s1,Object s2)
    {
        return s1.equals(s2);
    }
}
