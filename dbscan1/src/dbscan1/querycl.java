package dbscan1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class querycl {
	String[] splqry(String qry)
	{
		String[] sepqry = qry.split(" ");
	      for (String eaqry : sepqry) {
	         System.out.println(eaqry);
	      } 
	      return sepqry;
	}
	String extfname(String qry) {
	      Pattern p = Pattern.compile("(\\S+).csv");
		    Matcher m = p.matcher(qry);
		    String codeGroup="";
		    if (m.find()) {// get the matching group
			      codeGroup = m.group(1);
			      System.out.println("File Name:");
			      System.out.format("%s.csv\n", codeGroup);
			    }
		    
			return codeGroup;
	}
	String bfwhr(String qry)
	{String bw="";
		 if(qry.contains("where"))
		    bw=qry.substring(0,qry.indexOf("where"));
	return bw;
	}
	String afwhr(String qry)
	{String aw="";
		 if(qry.contains("where"))
		    aw=qry.substring(qry.indexOf("where") + 6,qry.length());
	return aw;
	}
	
	String splwhr(String qry,String[] sepqry)
	{int j;String cond1="";
		    if(qry.contains("where"))
		    {
	      	 System.out.println("Conditional Parts:");
	      	 for (j=0;j< sepqry.length;j++) {
	 		 if (sepqry[j].equals("where"))
	 		 {
	 			cond1=cond1.concat(sepqry[j+1]+sepqry[j+2]+sepqry[j+3]);// System.out.println(sepqry[j+1]+sepqry[j+2]+sepqry[j+3]);
	 		 }
	 	  }
		    }
		return cond1;    
	}
	void restrictions(String[] sepqry, String qry)
	{int i,j;
		    if(qry.contains("and"))
		    {
	 	 for (j=0;j< sepqry.length;j++) {
	 		 if (sepqry[j].equals("and"))
	 		 {
	 			 System.out.println(sepqry[j+1]+sepqry[j+2]+sepqry[j+3]);
	 		 }
	 	  }
		    }
		    if(qry.contains("or"))
		    {
	 	for (j=0;j< sepqry.length;j++) {
	 		 if (sepqry[j].equals("or"))
	 		 {
	 			 System.out.println(sepqry[j+1]+sepqry[j+2]+sepqry[j+3]);
	 		 }
	 	  }
		    }
	      for (i=0;i<sepqry.length;i++)
	      {
	    	  if (sepqry[i].equals("and"))
	    		  System.out.println(sepqry[i]);
	    	  else if (sepqry[i].equals("or"))
	    		  System.out.println(sepqry[i]);
	    	  else if (sepqry[i].equals("not"))
	    		  System.out.println(sepqry[i]);
	      }
	}
	void grpfld (String[] sepqry,String qry)
	{int j;
		    if(qry.contains("groupby"))
		    {System.out.println("GroupBy field:");
	      for (j=0;j< sepqry.length;j++) {
		 		 if (sepqry[j].equals("groupby"))
		 		 {
		 			 System.out.println(sepqry[j+1]);
		 		 }
		 	  }
		    }
}
void ordfld(String[] sepqry,String qry)
{int j;
		    if(qry.contains("orderby"))
		    {System.out.println("OrderBy field:");
	      for (j=0;j< sepqry.length;j++) {
		 		 if (sepqry[j].equals("orderby"))
		 		 {
		 			 System.out.println(sepqry[j+1]);
		 		 }
		 	  }
		    }
}	     
void aggselp(String[] sepqry)
{
	      String qry1= sepqry[1];
	      System.out.println("Selected Parts/aggregate fileds:");
	      String[] sepqry1 = qry1.split(",");
	      for (String eaqry1 : sepqry1) {
	         System.out.println(eaqry1);
	      } 
	}
}
