/**
 * @author prathusha
 *
 */

import java.util.Scanner;

public class Dbtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter the query:");
	   	Scanner scanner = new Scanner(System.in);
		String qry = scanner.nextLine();
	    querycl obj=new querycl();
	    String[] spqry= obj.splqry(qry);
		obj.extfname(qry);
		obj.splwhr(qry,spqry);
		obj.restrictions(spqry,qry);
		obj.grpfld(spqry,qry);
		obj.ordfld(spqry,qry);
		obj.aggselp(spqry);
		scanner.close();
		hrt obj1=new hrt();
		obj1.mn();
	}
}
 
