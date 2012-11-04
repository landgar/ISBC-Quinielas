package isbc.quinielas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
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

	protected static void teamsInSeason(int season){
		try {
			File file = new File("./data/seasons/season_" + season + ".txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer st;
			String line;
			int division = 0;
			HashSet<String> teams1 =  new HashSet<String>();
			HashSet<String> teams2 =  new HashSet<String>();

			line = br.readLine();
			while (line != null){
				st = new StringTokenizer(line);
				st.nextToken();
				division = Integer.valueOf(st.nextToken());
				st.nextToken();
				if (division == 1){
					teams1.add(st.nextToken());
					teams1.add(st.nextToken());
				} else {
					teams2.add(st.nextToken());
					teams2.add(st.nextToken());
				}
				line = br.readLine();
			}
			
			System.out.println("Equipos 1: " + teams1.toString());
			System.out.println("Equipos 2: " + teams2.toString());
			
			for (int i = 1; i<3; i++){
				String path = "./data/teamsBySeason/" + i + "_" + season + ".txt"; 
				FileWriter fw = new FileWriter(path);
				BufferedWriter bw = new BufferedWriter(fw);
				if (i == 1){
					Iterator<String> it = teams1.iterator();
					while (it.hasNext()){
						bw.write(it.next() + "\n");
					}
					bw.close();
				} else {
					Iterator<String> it = teams2.iterator();
					while (it.hasNext()){
						bw.write(it.next() + "\n");
					}
					bw.close();			
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1995; i < 2013; i++){
			teamsInSeason(i);
		}
	}
}
