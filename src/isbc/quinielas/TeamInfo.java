package isbc.quinielas;

public class TeamInfo {
	//TOTAL
	private int totalPosition;
	private int totalPlayedGames;
	private int totalWinnedGames;
	private int totalDrawedGames;
	private int totalLostGames;
	private int totalScoredGoals;
	private int totalReceivedGoals;
	private int totalPoints;
	// HOME
	private int homePosition;
	private int homePlayedGames;
	private int homeWinnedGames;
	private int homeDrawedGames;
	private int homeLostGames;
	private int homeScoredGoals;
	private int homeReceivedGoals;
	private int homePoints;
	//AWAY
	private int awayPosition;
	private int awayPlayedGames;
	private int awayWinnedGames;
	private int awayDrawedGames;
	private int awayLostGames;
	private int awayScoredGoals;
	private int awayReceivedGoals;
	private int awayPoints;
	
	//TODO
	public TeamInfo(
					int totalPosition, int totalPlayedGames, int totalWinnedGames, int totalDrawedGames, 
					int totalLostGames, int totalScoredGoals, int totalReceivedGoals, int totalPoints, 
					int homePosition, int homePlayedGames, int homeWinnedGames, int homeDrawedGames, 
					int homeLostGames, int homeScoredGoals, int homeReceivedGoals, int homePoints, 
					int awayPosition, int awayPlayedGames, int awayWinnedGames, int awayDrawedGames, 
					int awayLostGames, int awayScoredGoals, int awayReceivedGoals, int awayPoints)
	{
		//TOTAL
	    this.totalPosition = totalPosition;
	    this.totalPlayedGames = totalPlayedGames;
	    this.totalWinnedGames = totalWinnedGames;
	    this.totalDrawedGames = totalDrawedGames;
	    this.totalLostGames = totalLostGames;
	    this.totalScoredGoals = totalScoredGoals;
	    this.totalReceivedGoals = totalReceivedGoals;
	    this.totalPoints = totalPoints;
	    //HOME
	    this.homePosition = homePosition;
	    this.homePlayedGames = homePlayedGames;
	    this.homeWinnedGames = homeWinnedGames;
	    this.homeDrawedGames = homeDrawedGames;
	    this.homeLostGames = homeLostGames;
	    this.homeScoredGoals = homeScoredGoals;
	    this.homeReceivedGoals = homeReceivedGoals;
	    this.homePoints = homePoints;
	    //AWAY
	    this.awayPosition = awayPosition;
	    this.awayPlayedGames = awayPlayedGames;
	    this.awayWinnedGames = awayWinnedGames;
	    this.awayDrawedGames = awayDrawedGames;
	    this.awayLostGames = awayLostGames;
	    this.awayScoredGoals = awayScoredGoals;
	    this.awayReceivedGoals = awayReceivedGoals;
	    this.awayPoints = awayPoints;
	}
	
	
	
	public int getTotalPosition() {
		return totalPosition;
	}
	public int getTotalPlayedGames() {
		return totalPlayedGames;
	}
	public int getTotalWinnedGames() {
		return totalWinnedGames;
	}
	public int getTotalDrawedGames() {
		return totalDrawedGames;
	}
	public int getTotalLostGames() {
		return totalLostGames;
	}
	public int getTotalScoredGoals() {
		return totalScoredGoals;
	}
	public int getTotalReceivedGoals() {
		return totalReceivedGoals;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public int getHomePosition() {
		return homePosition;
	}
	public int getHomePlayedGames() {
		return homePlayedGames;
	}
	public int getHomeWinnedGames() {
		return homeWinnedGames;
	}
	public int getHomeDrawedGames() {
		return homeDrawedGames;
	}
	public int getHomeLostGames() {
		return homeLostGames;
	}
	public int getHomeScoredGoals() {
		return homeScoredGoals;
	}
	public int getHomeReceivedGoals() {
		return homeReceivedGoals;
	}
	public int getHomePoints() {
		return homePoints;
	}
	public int getAwayPosition() {
		return awayPosition;
	}
	public int getAwayPlayedGames() {
		return awayPlayedGames;
	}
	public int getAwayWinnedGames() {
		return awayWinnedGames;
	}
	public int getAwayDrawedGames() {
		return awayDrawedGames;
	}
	public int getAwayLostGames() {
		return awayLostGames;
	}
	public int getAwayScoredGoals() {
		return awayScoredGoals;
	}
	public int getAwayReceivedGoals() {
		return awayReceivedGoals;
	}
	public int getAwayPoints() {
		return awayPoints;
	}
}
