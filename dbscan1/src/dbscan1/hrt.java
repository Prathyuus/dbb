package dbscan1;

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

            br = new BufferedReader(new FileReader(csvFile));
            System.out.println(br.readLine());
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] querryy = line.split(cvsSplitBy);
                prat0 = prat0.concat(querryy[0]+",");
                prat1 = prat1.concat(querryy[1]+",");
                prat9 = prat9.concat(querryy[9]+",");
                prat11 = prat11.concat(querryy[11]+",");
                prat12= prat12.concat(querryy[12]+",");
                prat3= prat3.concat(querryy[3]+",");
               // System.out.println(querryy[14]);
              //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
                
            }System.out.println(prat0);
            System.out.println(prat1);
            System.out.println(prat9);
            System.out.println(prat11);
            System.out.println(prat12);
            System.out.println(prat3);
            int pratt0[]= psri(prat0);
            int pratt1[]= psri(prat1);
            int pratt9[]= psri(prat9);
            int pratt11[]= psri(prat11);
            int pratt12[]= psri(prat12);
            
            
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
        int[] psri(String str)
        {int x;int strr[]= {};
        	String[] str1 = str.split(" ");
  	      for (String str2 : str1) {
  	         System.out.println(str2);
  	      		}
  	      for(x=1;x<str1.length;x++)
  	    	  strr[x]= Integer.parseInt(str1[x]);
  	      	return strr;
        }
        
}
