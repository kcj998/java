package 期末作业;

public class Student {
    private String bj;
    private String name;
    public Student()
    {

    }
    public Student(String name, String bj)       
    {
        this.name = name;
        this.bj = bj;
    }
    public String getName()
    {
        return name;
    }
    public String getBj()
    {
        return bj;
    }
    public void setBj(String bj) 
    {
        this.bj = bj;    
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
