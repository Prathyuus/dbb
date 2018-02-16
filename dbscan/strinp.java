import java.util.Scanner;
import java.io.*;

class ScannerTest{

 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  String qry= new String ("sc.next();");
  sc.close();
    for (String retval: qry.split(" ")) {
         System.out.println(retval);
      }
   }
} 
