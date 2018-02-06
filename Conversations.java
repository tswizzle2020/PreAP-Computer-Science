import java.util.*;
public class Conversations
{

  public static void main(String[] args)
  {
    String name = "";
    String error = "";
    String animal = "";
    String verb = "";
    int num2 = 0;
    int num1 = 0;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Hello! We are going to create a short story.");
    
 //name code
    System.out.print("Please enter your name and press enter: ");
    if (input.hasNextLine())
    {
      name = input.nextLine();
    }
    else
    {
      error = input.next();
      System.out.println("Invaild entry: " + error);
    }
    
  //animal code
    System.out.print("Please enter an animal and press enter: ");
    if (input.hasNextLine())
    {
      animal = input.next();
    }
    else
    {
      error = input.next();
      System.out.println("Invaild entry: " + error);
    }
    input.nextLine();
    
 //verb code
    System.out.print("Please enter a verb and press enter: ");
    if (input.hasNextLine())
    {
      verb = input.nextLine();
    }
    else
    {
      error = input.next();
      System.out.println("Invaild entry: " + error);
    }
    
 //integer1 code
    System.out.print("Please enter an integer greater than one and press enter: ");
    if (input.hasNextInt())
    {
      num1 = input.nextInt();
    }
    else
    {
      error = input.next();
      System.out.println("Invaild entry: " + error);
    }
    input.nextLine();
    
 //integer2 code
    System.out.print("Please enter another integer greater than one and press enter: ");
    if (input.hasNextInt())
    {
      num2 = input.nextInt();
    }
    else
    {
      error = input.next();
      System.out.println("Invaild entry: " + error);
    }
    
    
    String story = "One day, " + name + " saw a " + animal + " and decided to " + verb + " with it.\n";
    story+= "After almost getting arrested " + Integer.toString(num1) + " times, " + name + " and the " + animal + " went their separate ways \n";
    story+=  " until " + Integer.toString(num2) + " years later...";
    System.out.print(story);
    
    /*
     Hello! We are going to create a short story.
     Please enter your name: Silly Sally
     Please enter a animal: elephant
     Please enter a verb: throw
     Please enter an integer: 3
     Please enter another integer: 25
One day, name saw an animal and decided to verb it.
After almost getting arrested integer times, name and the animal went their separate ways until integer years later...
     */
  }

}
