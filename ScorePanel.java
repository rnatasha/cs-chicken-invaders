import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
public class ScorePanel
{ //print scores & names into data.txt before running this
  //order: name, score
  public ScorePanel()
  { 
    User[] array = input("data.txt");
    sort(array);
    output(array);
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
    int numitems = infile.nextInt();
    User[] array = new User[numitems];
    for(int k = 0; k < numitems; k++)
      array[k] = new User(infile.next(), infile.nextInt());
    infile.close();
    return array;
    }
    
public static User[] sort(User[] array)  //need findMin method
{
  int maxPos;
  for(int k = 0; k < array.length; k++)
  {
    maxPos = findMax(array, array.length - k, c);
    swap(array, maxPos, array.length-k-1);
  }
}

public static int findMin(User[] array, int upper)
{
  int maxPos = 0;
  for(int j = 1; j < upper; j++)
  {
    if(array[j].getScore() > array[maxPos].getScore())
      maxPos = j;
  }
  return maxPos;
  }
}

public static void swap(User[] array, int a, int b)
{
  User temp = array[a];
  array[a] = array[b];
  array[b] = temp;
}

public static void output(User[] array) throws Exception
{
  PrintStream outfile = null;
  try{
    outfile = new PrintStream(new FileOutputStream("data.txt"));
  }
  catch(FileNotFoundException e)
   {
  JOptionPane.showMessageDialog(null, "The file could not be created.");
  for(int k = 0; k < array.length; k++)
    {
      outfile.println(array[k].getName() + "\n" + array[k].getScore());
    }
 outfile.close();
    }
  }
  }
 
