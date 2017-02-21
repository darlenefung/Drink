import java.util.ArrayList;
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drink
{
    // 1 super class
    // 2 subclasses
    // override method (for coffee, enter an ArrayList ingredients because coffee has extensive custimizations)
    // overload method (
    // override toString/equals methods 
    private String name;
    private boolean cold;
    private ArrayList<String> ingredients = new ArrayList<String>();
    
    public Drink()
    {
        this("water", true);
    }
    public Drink(String n, boolean c)
    {
        name = n;
        cold = c;
    }
    public String getName()
    {
        return name;
    }
    public boolean isCold()
    {
        return cold;
    }
    public String getIngredient()
    {
        if (ingredients.size() > 0)
        {
            return ingredients.get(0);
        }
        return "";
    }
    public String getIngredient(int i)
    {
        if (ingredients.size() > 0)
        {
            return ingredients.get(i);
        }
        return "";
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setTemp(boolean c)
    {
        cold = c;
    }
    public void addIngredients(String i)
    {
        ingredients.add(i);
    }
    public String toString()
    {
        String isCold = "";
        if (cold == true)
        {
            isCold = "cold";
        }
        else
        {
            isCold = "warm";
        }
        return name + ": " + isCold + " with: " + ingredients;
    }
}
