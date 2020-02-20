package clean_code;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
public class house_construction_menu {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scannerobject=new Scanner(System.in);
		
		@SuppressWarnings("resource")
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		
		myOutput.print("Enter your choice:\n1:Standard Materials\n2:AboveStandard Materials\n3:HighlyStandard Materials\n4:FullyAutomated");
		int choice=scannerobject.nextInt();		                         
		
		myOutput.print("enter total area of house in square feet");
		int totalarea=scannerobject.nextInt();
		
house_construction house_constructionobject=new house_construction();		
		
house_constructionobject.constructioncost(choice,totalarea);
              
  }

}