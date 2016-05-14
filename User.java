public class User
{
  private int myLives;
  private double myX, myY;
  
  public User(){
    myLives=3;
  }
  public void attack(Enemy e){
    e.setLives(e.getLives()-1);
  }
  public void draw(Graphics myBuffer){
    //not finished
  }
  public boolean isTouching(Enemy e){
    //not finished
  }
}
