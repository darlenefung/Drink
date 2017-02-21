
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slushee extends Drink
{
    private String flavor1;
    private String flavor2;
    
    public Slushee()
    {
        this("slushee", "blueraspberry");
    }
    public Slushee(String n,String f1)
    {
        super(n, true);
        flavor1 = f1;
        flavor2 = "";
    }
    public Slushee(String n, String f1, String f2)
    {
        super(n, true);
        flavor1 = f1;
        flavor2 = f2;
    }
    public String getFlavor1()
    {
        return flavor1;
    }
    public void setFlavor(String f)
    {
        flavor1 = f;
    }
    public void setFlavor(String f, String f2)
    {
        flavor1 = f;
        flavor2 = f2;
    }
    public String getFlavor2()
    {
        return flavor2;
    }
    public String toString()
    {
        return super.getName() + ": " + flavor1 + " " + flavor2 + " slushee";
    }
}
