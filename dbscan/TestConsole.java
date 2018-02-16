import java.util.Scanner;
import java.util.regex.*; 
public class TestConsole {
   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
	String qry = scanner.nextLine();
      String[] sepqry = qry.split(" ");
      for (String eaqry : sepqry) {
         System.out.println(eaqry);

       

      }  
      	 System.out.println(sepqry[4]);
      	 System.out.println(qry.substring(qry.indexOf(".csv") - 4 ,qry.indexOf(".csv") + 4));
      	 System.out.println(qry.substring(0,qry.indexOf("where")));
      	 System.out.println(qry.substring(qry.indexOf("where") + 5,qry.length()));

     // String[] sepqry1=sepqry.substring(sepqry.indexOf("where"),sepqry.length());
      //System.out.println(sepqry1);
      for (int i=0;i<sepqry.length;i++)
      	System.out.println(i);
   }
}
