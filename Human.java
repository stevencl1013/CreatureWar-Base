
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    
    public Human(int hitpoints, int strength)
    {
        if(hitpoints < 5)
            super.setHP(5);
        else if(hitpoints > 30)
            super.setHP(30);
        else
            super.setHP(hitpoints);
        if(strength < 5)
            super.setStrength(5);
        else if(strength > 18)
            super.setStrength(18);
        else
            super.setStrength(strength);
    }

    
}
