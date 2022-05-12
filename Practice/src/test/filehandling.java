package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {

	public static void main(String[] args) throws IOException {
		try {
			  File f =new File("D: Test.txt");// Make file 
		   if(f.createNewFile()) {
			   System.out.println("File"  +f.getName()+ "created");
		   }
		   else {
			   System.out.println("File already exist");
		   }
		  } 
		catch (IOException exception) {  
              System.out.println("Not able to make file");  
		
	}
		FileWriter fw= new FileWriter("D: Test.txt");//write on file 
		fw.write("Working in 360 logica");
		fw.close();
		 System.out.println("Your contect write successfully");
		 
        File f1=new File("D:Test1.txt");
		Scanner read=new Scanner(f1);//read from file 
		 while(read.hasNext()) {
			 String data= read.nextLine();
			 System.out.println(data);
			 read.close();
		 }
		

	}
}
