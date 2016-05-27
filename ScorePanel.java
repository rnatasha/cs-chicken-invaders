import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Comparator;
public class ScorePanel
{ //print scores & names into data.txt before running this
  //order: name, score
  public static void main(String[] args) throws Exception
  { 
    User[] array = input("data.txt");
  }
  public static User[] input(String filename)
  {
    Scanner infile = null;
    try{
      infile = new Scanner(new File(filename));
    }
    catch (FileNotFoundException e)
    {
      JOptionPane.showMessageDialog(null, "The file could not be found.");
      System.exit(0);
    }
    }
  }
 
