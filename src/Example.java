
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		
		File file = new File("profile.txt");
		
		Scanner fileInput = null;	
		try {	
			fileInput = new Scanner(file); 
		} catch (FileNotFoundException e) {
			System.out.println("Unable to load file!"); 
			e.printStackTrace(); 
			System.exit(1); 
		}
		
		String fileLine1 = fileInput.nextLine(); // 
		String fileLine2 = fileInput.nextLine(); 
		String fileLine3 = fileInput.nextLine(); // 
		String fileLine4 = fileInput.nextLine();
		String fileLine5 = fileInput.nextLine();
		
		/*
		System.out.println(fileLine1);
		System.out.println(fileLine2);
		System.out.println(fileLine3);
		*/
		
		Scanner inputScan = new Scanner(System.in);
		System.out.println("would you like to view the profile or quit?");
		String userFeedback = inputScan.nextLine();
		while (!userFeedback.equals("quit")) {
			
			System.out.println("Do you want to edit the file");
			Scanner choose1 = new Scanner(System.in);
			String chose1 = choose1.nextLine();
			//System.out.println(fileLine1);
			if(chose1.equals("yes")) {
				System.out.println("what do you want to edit?");
				System.out.println("");
			}else if (chose1.equals("no")) {
				
				System.out.println("Here is what the file curently says:");
				
				System.out.println(fileLine1);
				System.out.println(fileLine2);
				System.out.println(fileLine3);
				System.out.println(fileLine4);
				System.out.println(fileLine5);
				
			}
		}
		
		
	}
}