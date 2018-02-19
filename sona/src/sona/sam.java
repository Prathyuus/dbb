package sona;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//int p2=0;
			String[] ippi= {""};
			String csvFile = "ipl.csv";
	        BufferedReader br = null;
	        String line = "";
	        //String cvsSplitBy = ",";
	        int p=1;
	        
	        try {
	            ArrayList<String> arrli = new ArrayList<String>();

	            br = new BufferedReader(new FileReader(csvFile));
	           arrli.add(0,br.readLine());
	           System.out.print(arrli.get(0)+" ");
	            while ((line = br.readLine()) != null) {
	            	
	            	arrli.add(p,line);
	            	p++;
	                
	            }
	            for (int i=0; i<arrli.size(); i++)
	                System.out.println(arrli.get(i)+" ");
	            for(int i=0;i<arrli.size();i++)
	            	ippi[i]=arrli.get(i).toString();
	            for(int i=1;i<ippi.length;i++)
	            	System.out.println(ippi[i]);
	           // System.out.println(arrli.size());
	           // System.out.println(arrli.get(2));
	            //String ippi=arrli.get(2).toString();
	           // System.out.println(ippi);
	            //ippi[i]=arrli.get(i).toString();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        }
	String[] splqry(String qry)
        	{
        		String[] sepqry = qry.split(" ");
        	      for (String eaqry : sepqry) {
        	         System.out.println(eaqry);
        	      } 
        	      return sepqry;
        	}
	       
	}


/*package dbscan1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class hrt {
	void mn(){
		String csvFile = "ipl.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        String prat0="";
        String prat1="";
        String prat9="";
        String prat11="";
        String prat12="";
        String prat3="";
        try {
            ArrayList<String> arrli = new ArrayList<String>(n);

            br = new BufferedReader(new FileReader(csvFile));
            System.out.println(br.readLine());
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] querryy = line.split(cvsSplitBy);
                
               // System.out.println(querryy[14]);
              //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
                
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        }
       
        
}*/
