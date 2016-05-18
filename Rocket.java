public class Rocket
{
  private double myX, myY;
  private int mySize;
  
   public void attack(Enemy e){
    e.setLives(e.getLives()-1);
  }
  
}
