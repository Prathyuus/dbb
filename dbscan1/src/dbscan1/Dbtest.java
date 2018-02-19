package dbscan1;

import java.util.Scanner;

public class Dbtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the query:");
	   	Scanner scanner = new Scanner(System.in);
		String qry = scanner.nextLine();
	    querycl obj=new querycl();
	    String[] spqry= obj.splqry(qry);
		String fname=obj.extfname(qry);
		System.out.println(fname);
		String bfwr=obj.bfwhr(qry);
		System.out.println(bfwr);
		String afwr=obj.afwhr(qry);
		System.out.println(afwr);
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
