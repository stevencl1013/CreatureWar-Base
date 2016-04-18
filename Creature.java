import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   private int hp;
   private int strength;
   private Random rand;
   
   public Creature()
   {
       hp = 10;
       strength = 10;
       rand = new Random();
   }
   
   public int getHP()
   {
       return hp;
   }
   
   public int getStrength()
   {
       return strength;
   }
   
   public int damage()
   {
       return rand.nextInt(strength)+1;
   }
   
   public void setHP(int num)
   {
       hp = num;
   }
   
   public void setStrength(int num)
   {
       strength = num;
   }
   
   public void takeWound(int num)
   {
       hp -= num;
   }
}
