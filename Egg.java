public class Egg extends Enemy
{
  private int myLives;
  private double myX, myY;
  
  public Egg(int n, double x, double y){
    myLives = n;
    myX = x;
    myY = y;
  }
  public int getLives(){
    return myLives;
  }
  public double getX(){
    return myX;
  }
  public double getY(){
    return myY;
  }
  public void setLives(int n){
    myLives = n;
  }
  public void setX(double x){
    myX=x;
  }
  public void setY(double y){
    myY=y;
  }
  public void release(double bottomEdge){
    while(y!=bottomEdge){
      y++;
    }
  }
}
