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
	
	private static final String BASE_DATA = "./data/baseData.txt";
	
	protected static void fileTesting(){
		try {
			String line = "";
			int lineNumber = 0;
			File file = new File(BASE_DATA);
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
				
		} catch (Exception e) {}
	}
	
	protected static void fileSpliter(){
		try {
			String line = "";
			File file = new File(BASE_DATA);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw;

			int year = 2012;
			
			for (int i = year; i<2013; i++){

				String pathname = "./data/seasons/season_" + i + ".txt";
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
			
		} catch (Exception e) {}		
	}
	
	protected static void matchesForWeek(int season){
		try {
			File file = new File("./data/seasons/" + season + "/season_" + season + ".txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer st;
			String line = br.readLine();

			int maxWeek = 0, possibleWeek;
			while (line != null) {
				st = new StringTokenizer(line);
				st.nextToken(); st.nextToken();
				possibleWeek = Integer.valueOf(st.nextToken());
				if (possibleWeek > maxWeek){
					maxWeek = possibleWeek;
				}
				line = br.readLine();
			}
			
			for (int week = 1; week <= maxWeek; week++) {
				file = new File("./data/seasons/" + season + "/season_" + season + ".txt");
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				line = br.readLine();
				String path;
				if (week < 10){
					path = "./data/seasons/" + season + "/" + season + "_J0" + week + ".txt";
				} else {
					path = "./data/seasons/" + season + "/" + season + "_J" + week + ".txt";
				}
				FileWriter fw = new FileWriter(path);
				BufferedWriter bw = new BufferedWriter(fw);
				
				while (line != null){
					st = new StringTokenizer(line);
					//Discard season and division
					st.nextToken(); st.nextToken();
				
					if (Integer.valueOf(st.nextToken()) == week) {
						bw.write(line + "\n");
					}
					line = br.readLine();
				}
				bw.close();
			}
		} catch (Exception e) {}
	}
	
	public static void main(String[] args) {
		//split the whole data in seasons
		// fileSpliter();
		
		// teams by season
		/*
		for (int i = 1995; i < 2013; i++){
			teamsInSeason(i);
		}*/
		
		//separate the matches for season and week
		// path example: ./data/seasons/xxxx/xxxx_JYY.txt
		/*
		for (int i= 1995; i < 2013; i++){
			matchesForWeek(i);
		}*/
	}
}
