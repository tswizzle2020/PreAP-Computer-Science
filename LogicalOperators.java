
public class LogicalOperators
{
  public static void main(String[] args)
  {
    // && = and
      //is true if all conditions are true
      //if one is false, prints false
        boolean t1 = true, t2 = true;
        boolean f1 = false, f2 = false;
        //System.out.println(t1 && t2 && f1);
        
    // || = or
        //needs one true to print true
        //prints false if all is false
        //System.out.println(t1 || f2);
        
    //combining && and ||
        System.out.println((t1 && t2) && (f1 || f2));
                          //   t      &&      f
                          //        false
        
        System.out.println((t1 || f1) || (t2 && f2));
                          //      t     ||     f 
                          //           true
  }
}
