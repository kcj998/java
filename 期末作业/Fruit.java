package 期末作业;

public class Fruit 
{
    private String name;
    private double price;
    public Fruit()
    {
    }
    public Fruit(String name,double price)
    {
        this.name = name;
        this.price = price;
    }
    public String toString()
    {
        return "Fruit{name =" + name + " , price = " + price + "}";
    }
}
