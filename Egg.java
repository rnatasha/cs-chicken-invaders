public class Egg extends Enemy
{
  private int myLives;
  private double myX, myY;
  
  public Egg(double x, double y){
    myX = x;
    myY = y;
    myLives=1;
  }
  public double getX(){
    return myX;
  }
  public double getY(){
    return myY;
  }
  public int getLives(){
      return myLives;
  }
  public void setX(double x){
    myX=x;
  }
  public void setY(double y){
    myY=y;
  }
  public void setLives(int n){
    myLives=n;
  }
  public void attack(User u){
    u.setLives(u.getLives()-1);
  }
  public void release(double bottomEdge){
    while(myY!=bottomEdge){
      myY++;
    }
  }
}
