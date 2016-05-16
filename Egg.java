public class Egg extends Enemy
{
  private double myX, myY;
  
  public Egg(double x, double y){
    myX = x;
    myY = y;
  }
  public double getX(){
    return myX;
  }
  public double getY(){
    return myY;
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
