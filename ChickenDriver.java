public class ChickenDriver 
{
  public static void main(String[] args){
  //testing
  //everything below is not real just testing parts of the classes
  User u = new User();
  int level = 1;
  Chicken[][] chickenPalooza = new Chicken[5][10];
  double x=0;
  double y=0;
  //initializing chickens
  for(int r= 0;r<chickenPalooza.length;r++){
    for(int c=0;c<chickenPalooza[0].length;c++){
      chickenPalooza[r][c]=new Chicken(level,x, y);
      x+=10;
    }
    y+=10;
  }
  
  }
}
