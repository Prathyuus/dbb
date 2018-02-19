package sona;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
public class hasam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String csvFile = "ipl.csv";
        BufferedReader br = null;
        int p=0;
        String[] ippi= {""};
        String line = "";
        try {
		HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>(); 
		ArrayList<String> arrli = new ArrayList<String>();
		 br = new BufferedReader(new FileReader(csvFile));
		 hm.put(br.readLine(),arrli);
		 for(Entry<String, ArrayList<String>> m:hm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
	        
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
         
	}


