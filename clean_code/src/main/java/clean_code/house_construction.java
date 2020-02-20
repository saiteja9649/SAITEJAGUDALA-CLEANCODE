package clean_code;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class house_construction {

	public void constructioncost(int choice, int totalarea) {
		
		switch(choice) {
		case 1:Standard(totalarea);
		      break;
		case 2:AboveStandard(totalarea);
		      break;
		case 3:HighlyStandard(totalarea);
		      break;
		case 4:FullyAutomated(totalarea);
              break;
		}
	}
    private void Standard(int totalarea) {
    @SuppressWarnings("resource")
	PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("total construction cost is:"+ 1200*totalarea);
		
	}

	private void AboveStandard(int totalarea) {
		@SuppressWarnings("resource")
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("total construction cost is:"+ 1500*totalarea);
		 
	}

	private void HighlyStandard(int totalarea) {
		@SuppressWarnings("resource")
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("total construction cost is:"+ 1800*totalarea);
		
	}

	private void FullyAutomated(int totalarea) {
		@SuppressWarnings("resource")
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("total construction cost is:"+ 2500*totalarea);
		
	}

}