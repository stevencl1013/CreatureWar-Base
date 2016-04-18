import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class War here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class War
{
    private ArrayList<Creature> army1;
    private ArrayList<Creature> army2;
    private int size1;
    private int size2;
    private Random rand;
    public War()
    {
        rand = new Random();
        army1 = new ArrayList<Creature>();
        army2 = new ArrayList<Creature>();
        size1 = fillArmy(army1);
        size2 = fillArmy(army2);
    }
    
    private int fillArmy(ArrayList<Creature> army) //fills array, returns size;
    {
        int size = rand.nextInt(50)+50;
        Creature newCreature = null;
        int randNum;
        for(int i = 0; i < size; i++)
        {
            randNum = rand.nextInt(4);
            switch(randNum)
            {
                case 0: newCreature = new Human(rand.nextInt(26)+5,rand.nextInt(14)+5);
                break;
                case 1: newCreature = new Elf(rand.nextInt(30), rand.nextInt(30));
                break;
                case 2: newCreature = new CyberDemon(rand.nextInt(30), rand.nextInt(30));
                break;
                case 3: newCreature = new Balrog(rand.nextInt(30), rand.nextInt(30));
                break;
            }
            army.add(newCreature);
        }
        return size;
    }
    
    public void battle()
    {
        int index1;
        int index2;
    }
}
