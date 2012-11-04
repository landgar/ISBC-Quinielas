package isbc.quinielas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SeasonInfo {
	private int season;
	private HashMap<String, HashMap<Integer, WeekInfo>> teams;
	
	public SeasonInfo(int season){
		this.season = season;
		File file = new File("./data/seasons/season_" + season + ".txt");
		
		fillTeams(file);
	}
	
	private void fillTeams(File file){
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
			int week;
			WeekInfo weekInfo;
			HashMap<Integer, WeekInfo> teamInfo;
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer st;
			String line = "", token;
			
			line = br.readLine();
			st = new StringTokenizer(line);
			// Discard the season
			token = st.nextToken();
			// Discard the division
			token = st.nextToken();
			// Save the week
			week = Integer.valueOf(st.nextToken());
			
			weekInfo = new WeekInfo(totalPosition, totalPlayedGames, totalWinnedGames, 
					totalDrawedGames, totalLostGames, totalScoredGoals, totalReceivedGoals, 
					totalPoints, homePosition, homePlayedGames, homeWinnedGames, homeDrawedGames, 
					homeLostGames, homeScoredGoals, homeReceivedGoals, homePoints, awayPosition, 
					awayPlayedGames, awayWinnedGames, awayDrawedGames, awayLostGames, awayScoredGoals, 
					awayReceivedGoals, awayPoints);
			teamInfo = new HashMap<Integer, WeekInfo>();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public TeamInfo getTeamClasification(int week, String team){
		return weeks.get(week).get(team);
	}
}

