package isbc.quinielas;

import java.util.StringTokenizer;

public class Case {
	
	private int season;
    private boolean firstDiv;
    private int week;
    private String[] name = new String[2];
    private int[] result = new int[2];
    private int[] points = new int[2];
    private int[] maximumPossiblePoints = new int[2];
    private int[] position = new int[2];
    // difference between their positions
    private int positionDiff;
    // difference between their points in league
    private int pointsDiff;
    private int[] streak = new int[2];
    //streak of the local team being LOCAL TEAM
    private int homeStreak;
    //streak of the away team being AWAY TEAM
    private int awayStreak;
    // [0]: goals scored by the local team
    // [1]: goals scored by the visitor team
    private int[] goalsScored = new int[2];
    private int[] goalsReceived = new int[2];
    private int[] goalDiff = new int[2];
    // gaals scored ONLY by the local team in his stadium
    private int homeScored;
    // goals scored ONLY by the away team, playing away
    private int awayScored;
    private int homeReceived;
    private int awayReceived;
    private int homeDiff;
    private int awayDiff;
	
    public Case (String season, String division, String week, String localTeam, String awayTeam, String result, WeekClasification wk){
    	StringTokenizer stSeason = new StringTokenizer(division, "-");
    	this.season = Integer.valueOf(stSeason.nextToken().substring(2));
    	this.firstDiv = division == "1»"? true : false;
    	this.week = Integer.valueOf(week);
    	this.name[0] = localTeam;
    	this.name[1] = awayTeam;
    	StringTokenizer stResult = new StringTokenizer(result, "-");
    	this.result[0] = Integer.valueOf(stResult.nextToken());
    	this.result[1] = Integer.valueOf(stResult.nextToken());
    	
    	
    }
    
    
    
    
    
    
    public int getSeason() { return season; }
	public boolean isFirstDiv() {
		return firstDiv;
	}
	public int getWeek() {
		return week;
	}
	public String[] getName() {
		return name;
	}
	public int[] getResult() {
		return result;
	}
	public int[] getPoints() {
		return points;
	}
	public int[] getMaximumPossiblePoints() {
		return maximumPossiblePoints;
	}
	public int[] getPosition() {
		return position;
	}
	public int getPositionDiff() {
		return positionDiff;
	}
	public int getPointsDiff() {
		return pointsDiff;
	}
	public int[] getStreak() {
		return streak;
	}
	public int getHomeStreak() {
		return homeStreak;
	}
	public int getAwayStreak() {
		return awayStreak;
	}
	public int[] getGoalsScored() {
		return goalsScored;
	}
	public int[] getGoalsReceived() {
		return goalsReceived;
	}
	public int[] getGoalDiff() {
		return goalDiff;
	}
	public int getHomeScored() {
		return homeScored;
	}
	public int getAwayScored() {
		return awayScored;
	}
	public int getHomeReceived() {
		return homeReceived;
	}
	public int getAwayReceived() {
		return awayReceived;
	}
	public int getHomeDiff() {
		return homeDiff;
	}
	public int getAwayDiff() { return awayDiff; }

}
