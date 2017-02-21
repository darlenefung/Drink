import java.util.ArrayList;
/**
 * Write a description of class Motorcycle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coffee extends Drink
{
    private boolean whippedCream;
    
    public Coffee()
    {
        this("latte", false, false);
    }
    public Coffee(String n, boolean c, boolean w)
    {
        super(n, c);
        whippedCream = w;
    }
    public void addIngredients(String a)
    {
            super.addIngredients(a);
    }
    public boolean whippedCream()
    {
        return whippedCream;
    }
    public void setWhippedCream(boolean c)
    {
        whippedCream = c;
    }
    public String toString()
    {
        String whipped = "";
        if (whippedCream == true)
        {
            whipped = " with whipped cream on top";
        }
        else
        {   
            whipped = " without whipped cream on top";
        }
        return super.toString() + whipped;
    }
}
