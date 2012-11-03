package isbc.quinielas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
	
	protected static void fileSpliter(File file){
		try {
			String line = "";
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw;

			int year = 2012;
			
			for (int i = year; i<2013; i++){

				String pathname = "./data/season_" + i + ".txt";
				FileWriter fw = new FileWriter(pathname);
				bw = new BufferedWriter(fw);
				br.readLine();
				int currentSeason = Integer.valueOf(line.substring(0, 4));
				while (currentSeason < year){
					br.readLine();
				}
				currentSeason = Integer.valueOf(line.substring(0, 4));
				while (currentSeason == year){
					System.out.println("season: " + currentSeason);
					System.out.println("line: " + line);
					bw.write(line);
					bw.write("\n");
					currentSeason = Integer.valueOf(line.substring(0, 4));
				}
				bw.close();
			}
		} catch (Exception e){}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File data = new File("./data/baseData.txt");
		fileSpliter(data);
	}
}
