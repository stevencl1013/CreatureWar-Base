import java.util.Random;
/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    private Random rand;
    /**
     * Constructor for objects of class Elf
     */
    public Elf(int hitpoints, int strength)
    {
        rand = new Random();
        super.setHP(hitpoints);
        super.setStrength(strength);
    }
    
    public int damage()
    {
        int randNum = rand.nextInt(10);
        if(randNum == 0)
            return 2*super.damage();
        return super.damage();
    }

    
}
