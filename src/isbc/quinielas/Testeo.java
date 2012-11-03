package isbc.quinielas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Testeo {
	
	
	protected static void fileTesting(File file){
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
			while (line != null){
				line = br.readLine();
				lineNumber++;
				StringTokenizer tokenizer = new StringTokenizer(line);
				
				if (tokenizer.countTokens() > 6){
					System.out.println("Error en linea: " + lineNumber);
				}
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
		File data = new File("./data/baseData.txt");
		fileTesting(data);
	}
}
