
/**
 * Write a description of class Balrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog(int hitpoints, int strength)
    {
        super(hitpoints, strength);
    }
    
    public int damage()
    {
        return super.damage()*2;
    }

}