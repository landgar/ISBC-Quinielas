package isbc.quinielas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.swing.plaf.basic.DragRecognitionSupport.BeforeDrag;

public class SeasonInfo {
	private int season;
	private HashMap<String, HashMap<Integer, WeekInfo>> teams;
	
	public SeasonInfo(int season){
		this.season = season;
		
		fillTeams(season);
	}
	
	private void fillTeams(){
		teams.add()
	}
	
	private WeekInfo fillTeamsByWeek(int week){
		// TOTAL
		int totalPosition;
		int totalPlayedGames;
		int totalWinnedGames;
		int totalDrawedGames;
		int totalLostGames;
		int totalScoredGoals;
		int totalReceivedGoals;
		int totalPoints;
		// HOME
		int homePosition;
		int homePlayedGames;
		int homeWinnedGames;
		int homeDrawedGames;
		int homeLostGames;
		int homeScoredGoals;
		int homeReceivedGoals;
		int homePoints;
		//AWAY
		int awayPosition;
		int awayPlayedGames;
		int awayWinnedGames;
		int awayDrawedGames;
		int awayLostGames;
		int awayScoredGoals;
		int awayReceivedGoals;
		int awayPoints;
				
		try {
			WeekInfo weekInfo, weekBefore;
			HashMap<Integer, WeekInfo> teamInfo;
			String path;
			if (week < 10) {
				path = "./data/seasons/" + season + "/" + season + "_J0" + week + ".txt";
			} else {
				path = "./data/seasons/" + season + "/" + season + "_J" + week + ".txt";
			}
			File file = new File(path);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer st;
			String line = br.readLine(), token, teamName;
			
			while (line != null) {
				st = new StringTokenizer(line);
				// Discard the season
				token = st.nextToken();
				// Discard the division
				token = st.nextToken();
				// Save the week
				week = Integer.valueOf(st.nextToken());
				teamName = st.nextToken();
				weekBefore = teams.get(teamName).get(week - 1);
				
				weekInfo = new WeekInfo(totalPosition, totalPlayedGames, totalWinnedGames, 
						totalDrawedGames, totalLostGames, totalScoredGoals, totalReceivedGoals, 
						totalPoints, homePosition, homePlayedGames, homeWinnedGames, homeDrawedGames, 
						homeLostGames, homeScoredGoals, homeReceivedGoals, homePoints, awayPosition, 
						awayPlayedGames, awayWinnedGames, awayDrawedGames, awayLostGames, awayScoredGoals, 
						awayReceivedGoals, awayPoints);
				
				line = br.readLine();
			}
			
			return weekInfo;
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}

