import java.util.Random;
/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private Random rand;

    /**
     * Constructor for objects of class Demon
     */
    public Demon(int hitpoints, int strength)
    {
        rand = new Random();
        super.setHP(hitpoints);
        super.setStrength(strength);
    }

    public int damage()
    {
        int randNum = rand.nextInt(20);
        if(randNum == 0)
            return super.damage()+50;
        return super.damage();
    }
}
