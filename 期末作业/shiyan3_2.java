package 期末作业;

public class shiyan3_2 
{
    public static void main(String[] args) 
    {
        Phone ph = new Phone();
        ph.setBrand("吴京");
        ph.setPrice("6324");
        System.out.println("Brand:" + ph.getBrand());
        System.out.println("Price:" + ph.getPrice());
        ph.SendMessage();
        ph.call();

    }    
}
