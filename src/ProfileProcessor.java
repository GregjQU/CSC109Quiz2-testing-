import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.Scanner;

public class ProfileProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File namesFile = new File("profile.txt");
	///	Scanner fileInput = null;
		
		
		Scanner fileInput = null;	
		try {	
			fileInput = new Scanner(namesFile); 
		} catch (FileNotFoundException e) {
			System.out.println("Unable to load file!"); 
			e.printStackTrace(); 
			System.exit(1); 
		}
		Scanner inputScan = new Scanner(System.in);
		System.out.println("would you like to view the profile or quit?");
		String userFeedback = inputScan.nextLine();
		
		while (!userFeedback.equals("quit")) {
			
			while(!userFeedback.equals("view")) {
				
				
			}
		}
}
}
