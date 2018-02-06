
public class SwitchStatement
{
  public static void main(String[] args)
  {
     int value = 1;
     if (value == 1)
      {
        System.out.println("Value was 1");
      }
     else if (value == 2)
       {
       System.out.println("Value was 2");
       }
     else
       {
       System.out.println("Was not 1 or 2");
       }
     
     int switchValue = 4;
     //can use for byte, short, int, and char
     switch (switchValue)
       {
         case 1: //if switchValue == 1. do this
           System.out.println("Value was 1");
           break; //separates code
           
         case 2:
           System.out.println("Value was 2");
           break;
           
         case 3:case 4:case 5:
           System.out.println("was a 3, 4, or 5");
           break;
           
          default: //same as 'else'
            System.out.println("was greater than 5 or less than 1");
            break;
       }
     
     char letter = 'u';
     switch (letter)
       {
         case 'A': case 'B': case 'C': case 'D': case 'E':
           System.out.println("A, B, C, D, or E was found");
           break;
           
          default:
            System.out.println("letter after E");
            break;
       }
     
     String switchString = "September";
     switch (switchString)
       {
         case "June":
           System.out.println("The month is June");
           break;
       
         case "November":
           System.out.println("The month is November");
           break;
         
         default:
           System.out.println("Month was " + switchString);
           break;
       }
  }

}
