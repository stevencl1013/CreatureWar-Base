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
                case 1: newCreature = new Elf(rand.nextInt(30), 1+rand.nextInt(30));
                break;
                case 2: newCreature = new CyberDemon(rand.nextInt(30), 1+rand.nextInt(30));
                break;
                case 3: newCreature = new Balrog(rand.nextInt(30), 1+rand.nextInt(30));
                break;
            }
            army.add(newCreature);
        }
        return size;
    }
    
    public void battle()
    {
        int index1 = 0;
        int index2 = 0;
        String copy;
        while(index1 < size1 && index2 < size2)
        {
            while(army1.get(index1).getHP() > 0 && army2.get(index2).getHP() > 0)
            {
                army1.get(index1).takeWound(army2.get(index2).damage());
                army2.get(index2).takeWound(army1.get(index1).damage());
            }
            if(army1.get(index1).getHP() <= 0)
            {
                copy = "";
                for(int i = 0; i < army1.get(index1).toString().length(); i++)
                {
                    if(army1.get(index1).toString().charAt(i) == '@')
                        break;
                    copy += army1.get(index1).toString().charAt(i);
                }
                System.out.println("Army 1's creature "+index1+", a "+copy+", died.");
                index1++;
            }
            if(army2.get(index2).getHP() <= 0)
            {
                copy = "";
                for(int i = 0; i < army2.get(index2).toString().length(); i++)
                {
                    if(army2.get(index2).toString().charAt(i) == '@')
                        break;
                    copy += army2.get(index2).toString().charAt(i);
                }
                System.out.println("Army 2's creature "+index2+", a "+copy+", died.");
                index2++;
            }
        }
        if(index1 < size1 && index2 >= size2)
            System.out.println("Army 1 wins! They still have "+(size1-index1)+" creatures left.");
        else if(index1 >= size1 && index2 < size2)
            System.out.println("Army 2 wins! They still have "+(size2-index2)+" creatures left.");
        else
            System.out.println("It's a tie!");
    }
}
