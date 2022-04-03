
	import java.io.*;

	public class FileHandling1 {
		public static void main(String[] args) throws IOException {
			readfile();
		}
		private static void readfile() throws IOException {
			FileReader reader = new FileReader("index.txt");
			BufferedReader bufferedreader = new BufferedReader(reader);
			String line=bufferedreader.readLine();
			System.out.println(line);
		}
	}