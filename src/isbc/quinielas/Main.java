package isbc.quinielas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	/**
	 * @param args
	 */
	
	protected static void parseFile(File file){
		try {
			String line = "";
			int lineNumber = 0;
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			// Important data begins at line 3
			for (int i = 0; i < 3; i++){
				line = br.readLine();
				lineNumber++;
			}
			while (line != "" && lineNumber < 20){
				line = br.readLine();
				lineNumber++;
				//System.out.println("Processing data in line " + lineNumber + ": \n\t\t" + line);
				StringTokenizer tokenizer = new StringTokenizer(line);
				StringTokenizer elementTokenizer = new StringTokenizer(tokenizer.nextToken(), "-");
				while (elementTokenizer.hasMoreElements()){
					System.out.println("Element: " + Integer.valueOf(elementTokenizer.nextToken().substring(2)));
				}
				tokenizer.nextElement();
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File data = new File("./datos.txt");
		parseFile(data);
	}
}
