package clean_code;


import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
public class menu
{
public static void main(String rgs[])
{

Scanner scannerobject=new Scanner(System.in);
@SuppressWarnings("resource")

PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
      
      myOutput.print("enter principal amount:");
      double principalamount=scannerobject.nextDouble();
      
      myOutput.print("enter interest rate:");
      double interestrate=scannerobject.nextDouble();
      
      myOutput.print("enter no of years:");
      double noofyears=scannerobject.nextDouble();
 
cleancode classobject=new cleancode();
      
      double simpleinterest=classobject.calc_simpleinterest(principalamount,interestrate,noofyears);
      
      double compoundinterest=classobject.calc_compoundinterest(principalamount,interestrate,noofyears);
 
myOutput.println("simpleinterest is:"+simpleinterest);
myOutput.print("compoundinterest is:"+compoundinterest);
}
}