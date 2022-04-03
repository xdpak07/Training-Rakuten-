import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.io.nio.CharBuffer;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		readfile();
	}
	private static void readfile()  throws FileNoteFoundException{
		
		FileReader reader = new FileReader("input.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String line = bufferedReader.readline();
		
		System.out.println(line);
				
	}
}
 