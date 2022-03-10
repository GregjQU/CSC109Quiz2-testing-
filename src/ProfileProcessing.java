import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ProfileProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// define a new file object with a path to your file
				File file = new File("profile.txt");
				
			
				try {
					// this is creating the PrintWriter and telling FileWriter which file to write to
					// if the file does not exist, it will be created.
					// if the file already exists, it will be overwritten
					PrintWriter printWriter = new PrintWriter(file);
					
					// the below lines will write various names to the file
					printWriter.println("Greg");
					printWriter.println("Jean-Baptiste");
					printWriter.println("Chris");
					printWriter.println("Wendy");
					printWriter.println("Chuck");
					
					
					printWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		
		
	}

}
