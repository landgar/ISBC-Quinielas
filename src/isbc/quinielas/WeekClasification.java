package isbc.quinielas;

import java.util.HashMap;

public class WeekClasification {
	private int season;
	private int week;
	private HashMap<String, TeamInfo> teams;
	
	public WeekClasification(){
		
	}
	
	public TeamInfo getTeamClasification(String team){
		return teams.get(team);
	}
}

