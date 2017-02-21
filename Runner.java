import java.util.ArrayList;
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String[] args)
    {
        Drink d = new Drink("lemonade", true);
        System.out.println(d);
        d.addIngredients("sugar");
        System.out.println(d);
        
        Coffee c = new Coffee();
        c.addIngredients("sugar");
        ArrayList<String> ing = new ArrayList<String>();
        ing.add("lemon");
        ing.add("honey");
        c.addIngredients(ing);
        System.out.println(c);
        
        Slushee s = new Slushee("darlene's slushee", "blueraspberry", "cherry");
        System.out.println(s.getIngredient());
        s.addIngredients("straw");
        System.out.println(s.getIngredient());
        System.out.println(s);
    }
}
